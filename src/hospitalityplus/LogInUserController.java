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

public class LogInUserController {

    @FXML
    private Button btnLogin;

    @FXML
    private Button btnTosignup;

    @FXML
    private PasswordField tfPassword;
    
    @FXML
    private Button btnLupa;

    @FXML
    private TextField tfUsername;
    
    Connection conn = null;
    ResultSet rsp = null;
    ResultSet rsa = null; 
    PreparedStatement pstp = null;
    PreparedStatement psta = null;
    
    @FXML
    void backUserButton(ActionEvent event) throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("SignUpUser.fxml"));
        Parent root = loader.load();
        Stage stage = (Stage)btnLogin.getScene().getWindow();
        stage.setScene(new Scene(root));
    }
    
    @FXML
    void buttonLupa(ActionEvent event) throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("LupaPasswordUser.fxml"));
        Parent root = loader.load();
        Stage stage = (Stage)btnLupa.getScene().getWindow();
        stage.setScene(new Scene(root));
    }

    @FXML
    void TosignupUserButton(ActionEvent event) throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("SignUpUser.fxml"));
        Parent root = loader.load();
        Stage stage = (Stage)btnTosignup.getScene().getWindow();
        stage.setScene(new Scene(root));
    }
    @FXML
    void LoginDataButton(ActionEvent event)throws Exception{
        conn = DBHelper.getConnection();
        String sqlp="SELECT * from pelanggan WHERE username = ? and password = ? ";
        String sqla="SELECT * from admin WHERE username = ? and password = ? ";
        try{
            pstp = conn.prepareStatement(sqlp);
            pstp.setString(1, tfUsername.getText());
            pstp.setString(2, tfPassword.getText());
            rsp = pstp.executeQuery();
            
            psta = conn.prepareStatement(sqla);
            psta.setString(1, tfUsername.getText());
            psta.setString(2, tfPassword.getText());
            rsa = psta.executeQuery();            
            if(rsp.next()){
                System.out.println("benar");
                Parent root = FXMLLoader.load(getClass().getResource("HalPertamaUser.fxml"));
                Scene scene = new Scene(root);  
                Stage stage = (Stage)((Node) event.getSource()).getScene().getWindow();
                stage.setScene(scene);
                stage.show();
            }else if(rsa.next()){
                System.out.println("benar");
                Parent root = FXMLLoader.load(getClass().getResource("AdminHalPertama.fxml"));
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
