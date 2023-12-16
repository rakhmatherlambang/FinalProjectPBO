package hospitalityplus;

import db.DBHelper;
import java.io.IOException;
import java.net.URL;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;

public class AdminHalPertamaController implements Initializable {

    @FXML
    private Button btnLogout;

    @FXML
    private TableView<Pelanggan> tvData;

    @FXML
    private TableColumn<Pelanggan, String> colEmail;

    @FXML
    private TableColumn<Pelanggan, String> colPassword;

    @FXML
    private TableColumn<Pelanggan, String> colUsername;

    @FXML
    void buttonLogout(ActionEvent event) throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("StartUser.fxml"));
        Parent root = loader.load();
        Stage stage = (Stage)btnLogout.getScene().getWindow();
        stage.setScene(new Scene(root));
    }
    
 public ObservableList<Pelanggan> getDataPelanggan(){
    ObservableList<Pelanggan> pg = FXCollections.observableArrayList();
    Connection conn = DBHelper.getConnection();
    String query = "SELECT * FROM pelanggan";
    Statement st;
    ResultSet rs;

    try {
        st = conn.createStatement();
        rs = st.executeQuery(query);
        while (rs.next()) {
            Pelanggan temp = new Pelanggan(rs.getString("email"), rs.getString("username"), rs.getString("password"));
            pg.add(temp);
        }
    } catch (SQLException ex) {
        ex.printStackTrace();
    }
    return pg;
}

 public void showPelanggan(){
     ObservableList<Pelanggan> list = getDataPelanggan();
     
     colEmail.setCellValueFactory(new PropertyValueFactory<>("email"));
     colUsername.setCellValueFactory(new PropertyValueFactory<>("username"));
     colPassword.setCellValueFactory(new PropertyValueFactory<>("password"));
 }

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        showPelanggan();
        System.out.println("data berhasil");
    }

}
