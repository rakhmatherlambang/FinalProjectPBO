package hospitalityplus;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

public class StartUserController {

    @FXML
    private Button btnStart;
    
    @FXML
    private Button btnAdmin;
    
    @FXML
    private void StartUserButton(ActionEvent event) throws Exception {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("SignUpUser.fxml"));
        Parent root = loader.load();
        Stage stage = (Stage)btnStart.getScene().getWindow();
        stage.setScene(new Scene(root));
    }
    
    @FXML
    private void StartAdmin(ActionEvent event) throws Exception {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("SignUpAdmin.fxml"));
        Parent root = loader.load();
        Stage stage = (Stage)btnAdmin.getScene().getWindow();
        stage.setScene(new Scene(root));
    }

}
    