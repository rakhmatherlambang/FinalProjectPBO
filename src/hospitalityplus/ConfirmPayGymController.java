package hospitalityplus;

import java.io.IOException;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

public class ConfirmPayGymController {

    @FXML
    private Button btnBack;

    @FXML
    private Button btnPay;

    @FXML
    void ButtonPay(ActionEvent event) throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("DonePayGym.fxml"));
        Parent root = loader.load();
        Stage stage = (Stage)btnPay.getScene().getWindow();
        stage.setScene(new Scene(root));
    }

    @FXML
    void backPay(ActionEvent event) throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("GymUser.fxml"));
        Parent root = loader.load();
        Stage stage = (Stage)btnBack.getScene().getWindow();
        stage.setScene(new Scene(root));
    }

}
