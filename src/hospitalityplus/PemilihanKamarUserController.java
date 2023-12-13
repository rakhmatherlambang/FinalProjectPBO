package hospitalityplus;

import java.io.IOException;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

public class PemilihanKamarUserController {

    @FXML
    private Button btnBack;

    @FXML
    private Button btnDeluxe;

    @FXML
    private Button btnStandard;

    @FXML
    private Button btnSuperior;

    @FXML
    void BackPilihanKamar(ActionEvent event) throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("HalPertamaUser.fxml"));
        Parent root = loader.load();
        Stage stage = (Stage)btnBack.getScene().getWindow();
        stage.setScene(new Scene(root));
    }

    @FXML
    void DeluxeUser(ActionEvent event) {

    }

    @FXML
    void StandardUser(ActionEvent event) {

    }

    @FXML
    void SuperiorUser(ActionEvent event) {

    }

}