package hospitalityplus;

import java.io.IOException;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

public class StandardRoomUserController {

    @FXML
    private Button btn11;

    @FXML
    private Button btn12;

    @FXML
    private Button btn13;

    @FXML
    private Button btnBack;

    @FXML
    void BackStandardRoom(ActionEvent event) throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("PemilihanKamarUser.fxml"));
        Parent root = loader.load();
        Stage stage = (Stage)btnBack.getScene().getWindow();
        stage.setScene(new Scene(root));
    }

    @FXML
    void Room11(ActionEvent event) throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("Room11.fxml"));
        Parent root = loader.load();
        Stage stage = (Stage)btn11.getScene().getWindow();
        stage.setScene(new Scene(root));
    }

    @FXML
    void Room12(ActionEvent event) throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("Room12.fxml"));
        Parent root = loader.load();
        Stage stage = (Stage)btn12.getScene().getWindow();
        stage.setScene(new Scene(root));
    }

    @FXML
    void Room13(ActionEvent event) throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("Room13.fxml"));
        Parent root = loader.load();
        Stage stage = (Stage)btn13.getScene().getWindow();
        stage.setScene(new Scene(root));
    }

}
