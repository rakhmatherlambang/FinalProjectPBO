package hospitalityplus;

import java.io.IOException;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

public class PemilihanFasilitasUserController {

    @FXML
    private Button btnBack;

    @FXML
    private Button btnGym;

    @FXML
    private Button btnPool;

    @FXML
    private Button btnSpa;

    @FXML
    void BackFasilitas(ActionEvent event) throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("HalPertamaUser.fxml"));
        Parent root = loader.load();
        Stage stage = (Stage)btnBack.getScene().getWindow();
        stage.setScene(new Scene(root));
    }

    @FXML
    void GymUser(ActionEvent event) throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("GymUser.fxml"));
        Parent root = loader.load();
        Stage stage = (Stage)btnGym.getScene().getWindow();
        stage.setScene(new Scene(root));
    }

    @FXML
    void PoolUser(ActionEvent event) throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("PoolUser.fxml"));
        Parent root = loader.load();
        Stage stage = (Stage)btnGym.getScene().getWindow();
        stage.setScene(new Scene(root));
    }

    @FXML
    void SpaUser(ActionEvent event) throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("SpaUser.fxml"));
        Parent root = loader.load();
        Stage stage = (Stage)btnGym.getScene().getWindow();
        stage.setScene(new Scene(root));
    }

}
