package p.parking;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.ButtonType;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class HelloController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;
    @FXML
    Stage stage;
    @FXML
    AnchorPane scenePanel;
    @FXML
    AnchorPane scenePanel2;
    @FXML
    AnchorPane scenePanel1;



    public void initialize() {
    }

    public void logout(ActionEvent event) {
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

    public void maximizeWindow(ActionEvent event) {
        stage = (Stage) scenePanel.getScene().getWindow();
        if (stage.getWidth() < 1920) {
            stage.setWidth(1920);
            stage.setHeight(1079);
            stage.setX(0);
            stage.setY(0);
        }
        else {
            stage.setWidth(1440);
            stage.setHeight(900);
            stage.setX(240);
            stage.setY(50);
        }

    }
    public void minimizeWindow(ActionEvent event) {
        stage = (Stage) scenePanel.getScene().getWindow();
        stage.setIconified(true);
}}

