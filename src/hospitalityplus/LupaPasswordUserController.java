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

public class LupaPasswordUserController {
    
    @FXML
    private TextField tfUsername;
    
    @FXML
    private PasswordField tfPassword;

    @FXML
    private Button btnBack;

    @FXML
    private Button btnLogin1;

    @FXML
    private Button btnLogin2;

    @FXML
    private Button btnSetpw;
    
    

    Connection conn = null;
    ResultSet rs = null;
    PreparedStatement pst = null;
    
    @FXML
    void BackLupa(ActionEvent event) throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("LogInUser.fxml"));
        Parent root = loader.load();
        Stage stage = (Stage)btnBack.getScene().getWindow();
        stage.setScene(new Scene(root));
    }

    @FXML
    void buttonLogin(ActionEvent event) throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("LogInUser.fxml"));
        Parent root = loader.load();
        Stage stage = (Stage)btnLogin2.getScene().getWindow();
        stage.setScene(new Scene(root));
    }

    @FXML
    void buttonLogin1(ActionEvent event) throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("LogInUser.fxml"));
        Parent root = loader.load();
        Stage stage = (Stage)btnLogin1.getScene().getWindow();
        stage.setScene(new Scene(root));
    }

@FXML
void buttonSetpw(ActionEvent event) {
    conn = DBHelper.getConnection();
    String updatePasswordQuery = "UPDATE pelanggan SET password = ? WHERE username = ?";
    try {
        if (tfUsername.getText().isEmpty() || tfPassword.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Harap isi username dan password");
            return;
        }
        pst = conn.prepareStatement(updatePasswordQuery);
        pst.setString(1, tfPassword.getText());
        pst.setString(2, tfUsername.getText());

        int rowsAffected = pst.executeUpdate();

        if (rowsAffected > 0) {
            JOptionPane.showMessageDialog(null, "Password berhasil diupdate");
        FXMLLoader loader = new FXMLLoader(getClass().getResource("LogInUser.fxml"));
        Parent root = loader.load();
        Stage stage = (Stage)btnLogin1.getScene().getWindow();
        stage.setScene(new Scene(root));            
        } else {
            JOptionPane.showMessageDialog(null, "Gagal mengupdate password. Username tidak ditemukan.");
        }
    } catch (Exception e) {
        e.printStackTrace();
        JOptionPane.showMessageDialog(null, "Terjadi kesalahan: " + e.getMessage());
    }
}


}
