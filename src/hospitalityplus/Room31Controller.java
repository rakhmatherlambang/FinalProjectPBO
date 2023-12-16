package hospitalityplus;

import java.io.IOException;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

public class Room31Controller {

    @FXML
    private Button btnBack;

    @FXML
    private Button btnBayar;

    @FXML
    void Back31(ActionEvent event) throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("DeluxeRoomUser.fxml"));
        Parent root = loader.load();
        Stage stage = (Stage)btnBack.getScene().getWindow();
        stage.setScene(new Scene(root));
    }

    @FXML
    void Bayar31(ActionEvent event) throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("Room31CP.fxml"));
        Parent root = loader.load();
        Stage stage = (Stage)btnBayar.getScene().getWindow();
        stage.setScene(new Scene(root));
    }

}
