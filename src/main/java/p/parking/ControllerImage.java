package p.parking;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonType;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class ControllerImage {

    @FXML
    Stage stage;

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button buttonFour;

    @FXML
    private Button buttonOne;

    @FXML
    private AnchorPane paneFour;

    @FXML
    private AnchorPane paneOne;

    @FXML
    private AnchorPane scenePanel;

    @FXML
    void getFour(MouseEvent event) {
            paneFour.setVisible(true);
            paneOne.setVisible(false);
    }

    @FXML
    void getOne(MouseEvent event) {
            paneOne.setVisible(true);
            paneFour.setVisible(false);
    }

    @FXML
    void logout(ActionEvent event) {
        Alert alert = new Alert(Alert.AlertType.CONFIRMATION);
        alert.setTitle("Logout");
        alert.setHeaderText("You are about to logout!");
        alert.setContentText("Do you want to save before exiting?: ");

        if (alert.showAndWait().get() == ButtonType.OK) {
            stage = (Stage) scenePanel.getScene().getWindow();
            System.out.println("Successfully logged out!");
            stage.close();
        }
    }

    @FXML
    void initialize() {

    }

}
