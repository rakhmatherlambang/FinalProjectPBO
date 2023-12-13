package hospitalityplus;

import db.DBHelper;
import java.io.IOException;
import java.net.URL;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;
import javax.swing.JOptionPane;

public class SignUpUserController implements Initializable{


    @FXML
    private Button btnBackUser;

    @FXML
    private Button btnSignup;

    @FXML
    private Button btnTologin;

    @FXML
    private TextField tfEmail;

    @FXML
    private PasswordField tfPassword;

    @FXML
    private TextField tfUsername;
    
    @FXML
    void backUserButton(ActionEvent event) throws IOException {
    FXMLLoader loader = new FXMLLoader(getClass().getResource("StartUser.fxml"));
    Parent root = loader.load();
    Stage stage = (Stage)btnSignup.getScene().getWindow();
    stage.setScene(new Scene(root));
    }
    
    @FXML
    void TologinUserButton(ActionEvent event) throws IOException {
    FXMLLoader loader = new FXMLLoader(getClass().getResource("LogInUser.fxml"));
    Parent root = loader.load();
    Stage stage = (Stage)btnSignup.getScene().getWindow();
    stage.setScene(new Scene(root));
    }

    @FXML
    void SignupDataButton(ActionEvent event) throws IOException {
        if(event.getSource() == btnSignup){
           JOptionPane.showMessageDialog(null,"Berhasil Sign Up");            
           signupRecord();
        }   
    }
    
  public ObservableList<Pelanggan> getDataPelanggan(){
    ObservableList<Pelanggan> pg = FXCollections.observableArrayList();
    Connection conn = DBHelper.getConnection();
    String query = "SELECT * FROM pelanggan";
    Statement st;
    ResultSet rs;

    try {
        st = conn.createStatement();
        rs = st.executeQuery(query);
        while (rs.next()) {
            Pelanggan temp = new Pelanggan(rs.getString("username"), rs.getString("email"), rs.getString("password"));
            pg.add(temp);
        }
    } catch (SQLException ex) {
        ex.printStackTrace();
    }
    return pg;
}
  
   public void update(String query){
     Connection conn = DBHelper.getConnection();
     Statement st;
     ResultSet rs;
     
     try{
         st = conn.createStatement();
         st.executeUpdate(query);
     }catch (SQLException ex){
         ex.printStackTrace();
     }
 }  
   
    private void signupRecord() throws IOException{
     String query = "INSERT INTO pelanggan VALUES ('" +tfEmail.getText() + "','" + tfUsername.getText() + "','" + tfPassword.getText() + "')";
     update(query);
     
     tfEmail.clear();
     tfUsername.clear();
     tfPassword.clear();
     
    FXMLLoader loader = new FXMLLoader(getClass().getResource("LogInUser.fxml"));
    Parent root = loader.load();
    Stage stage = (Stage)btnSignup.getScene().getWindow();
    stage.setScene(new Scene(root));
 }

@Override
public void initialize(URL location, ResourceBundle resources) {
    // Lakukan inisialisasi atau tindakan lain yang diperlukan
    System.out.println("Objek FXML diinisialisasi!");
}

}
