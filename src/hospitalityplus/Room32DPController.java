package hospitalityplus;

import java.io.IOException;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

public class Room32DPController {

    @FXML
    private Button btnDone;

    @FXML
    void buttonDone(ActionEvent event) throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("HalPertamaUser.fxml"));
        Parent root = loader.load();
        Stage stage = (Stage)btnDone.getScene().getWindow();
        stage.setScene(new Scene(root));
    }

}
