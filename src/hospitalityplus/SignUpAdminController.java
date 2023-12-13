package hospitalityplus;

import db.DBHelper;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import javax.swing.JOptionPane;

public class SignUpAdminController {

    @FXML
    private Button btnLogin;

    @FXML
    private PasswordField tfPassword;

    @FXML
    private TextField tfUsername;
    
    Connection conn = null;
    ResultSet rs = null;
    PreparedStatement pst = null;
    
    @FXML
    void BackAdminButton(ActionEvent event) throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("StartUser.fxml"));
        Parent root = loader.load();
        Stage stage = (Stage)btnLogin.getScene().getWindow();
        stage.setScene(new Scene(root));
    }


    @FXML
    void AdminLoginButton(ActionEvent event)throws Exception{
        conn = DBHelper.getConnection();
        String sql="Select * from admin WHERE username = ? and password = ? ";
        try{
            pst = conn.prepareStatement(sql);
            pst.setString(1, tfUsername.getText());
            pst.setString(2, tfPassword.getText());
            rs = pst.executeQuery();
            if(rs.next()){
                System.out.println("benar");
                Parent root = FXMLLoader.load(getClass().getResource("StartUser.fxml"));
                Scene scene = new Scene(root);  
                Stage stage = (Stage)((Node) event.getSource()).getScene().getWindow();
                stage.setScene(scene);
                stage.show();
            }else{
              JOptionPane.showMessageDialog(null,"Username atau Password Salah");
            }
        }catch(Exception e){
            JOptionPane.showMessageDialog(null,e);
        }
    }
    
}
