package hospitalityplus;

import java.io.IOException;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

public class HalPertamaUserController {

    @FXML
    private Button btnFasilitas;

    @FXML
    private Button btnKamar;

    @FXML
    void PilihFasilitas(ActionEvent event) throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("PemilihanFasilitasUser.fxml"));
        Parent root = loader.load();
        Stage stage = (Stage)btnFasilitas.getScene().getWindow();
        stage.setScene(new Scene(root));
    }

    @FXML
    void PilihKamar(ActionEvent event) throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("PemilihanKamarUser.fxml"));
        Parent root = loader.load();
        Stage stage = (Stage)btnKamar.getScene().getWindow();
        stage.setScene(new Scene(root));
    }

}
