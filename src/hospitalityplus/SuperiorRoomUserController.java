package hospitalityplus;

import java.io.IOException;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

public class SuperiorRoomUserController {

    @FXML
    private Button btn21;

    @FXML
    private Button btn22;

    @FXML
    private Button btn23;

    @FXML
    private Button btnBack;

    @FXML
    void BackSuperior(ActionEvent event) throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("PemilihanKamarUser.fxml"));
        Parent root = loader.load();
        Stage stage = (Stage)btnBack.getScene().getWindow();
        stage.setScene(new Scene(root));
    }

    @FXML
    void Button21(ActionEvent event) throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("Room21.fxml"));
        Parent root = loader.load();
        Stage stage = (Stage)btn21.getScene().getWindow();
        stage.setScene(new Scene(root));
    }

    @FXML
    void Button22(ActionEvent event) throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("Room22.fxml"));
        Parent root = loader.load();
        Stage stage = (Stage)btn22.getScene().getWindow();
        stage.setScene(new Scene(root));
    }

    @FXML
    void Button23(ActionEvent event) throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("Room23.fxml"));
        Parent root = loader.load();
        Stage stage = (Stage)btn23.getScene().getWindow();
        stage.setScene(new Scene(root));
    }

}
