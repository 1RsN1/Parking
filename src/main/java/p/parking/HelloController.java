package p.parking;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.ButtonType;
import javafx.scene.control.Label;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class HelloController {
    @FXML
    Stage stage;
    @FXML
    AnchorPane scenePanel;
    @FXML
    AnchorPane scenePanel2;
    @FXML
    AnchorPane scenePanel1;

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
    public void MaximizeWindow(ActionEvent event) {
        stage = (Stage) scenePanel.getScene().getWindow();
        //stage.setMaximized(true);
        stage.setWidth(1920);
        stage = (Stage) scenePanel.getScene().getWindow();
    }
}