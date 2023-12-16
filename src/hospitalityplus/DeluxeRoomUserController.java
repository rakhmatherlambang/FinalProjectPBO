package hospitalityplus;

import java.io.IOException;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

public class DeluxeRoomUserController {

    @FXML
    private Button btn31;

    @FXML
    private Button btn32;

    @FXML
    private Button btn33;

    @FXML
    private Button btnBack;

    @FXML
    void BackDeluxe(ActionEvent event) throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("PemilihanKamarUser.fxml"));
        Parent root = loader.load();
        Stage stage = (Stage)btnBack.getScene().getWindow();
        stage.setScene(new Scene(root));
    }

    @FXML
    void Room31(ActionEvent event) throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("Room31.fxml"));
        Parent root = loader.load();
        Stage stage = (Stage)btn31.getScene().getWindow();
        stage.setScene(new Scene(root));
    }

    @FXML
    void Room32(ActionEvent event) throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("Room32.fxml"));
        Parent root = loader.load();
        Stage stage = (Stage)btn32.getScene().getWindow();
        stage.setScene(new Scene(root));
    }

    @FXML
    void Room33(ActionEvent event) throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("Room33.fxml"));
        Parent root = loader.load();
        Stage stage = (Stage)btn33.getScene().getWindow();
        stage.setScene(new Scene(root));
    }

}
