package p.parking;

import java.net.URL;
import java.util.Objects;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.ButtonType;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.control.Button;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class HomeSceneController {
    @FXML
    Stage stage, baseStage,settingsStage,othersStage;
    @FXML
    Scene baseScene;
    @FXML
    private ImageView imgV1, imgV41, imgV42, imgV43, imgV44, imgV71, imgV72, imgV73, imgV74, imgV75, imgV76, imgV77, imgV91, imgV92, imgV93, imgV94, imgV95, imgV96, imgV97, imgV98, imgV99, ivProsmotr0;
    @FXML
    AnchorPane anchorPane1, scenePanel, baseAnchorPane, othersAnchorPane, settingAP;
    @FXML
    private ResourceBundle resources;
    @FXML
    private URL location;
    @FXML
    private Button buttonForSevenCam, buttonForFourCam, buttonForNineCam, buttonForOneCam;
    @FXML
    private AnchorPane paneWithFourCam,paneWithOneCam,paneWithSevenCam,paneWithNineCam;


    public void initialize() {
        ivProsmotr0.setImage(new javafx.scene.image.Image(getClass().getResourceAsStream("icon/VSTU-logo.png")));
        imgV1.setImage(new javafx.scene.image.Image(getClass().getResourceAsStream("photo/1.jpg")));
        imgV41.setImage(new javafx.scene.image.Image(getClass().getResourceAsStream("photo/1.jpg")));
        imgV42.setImage(new javafx.scene.image.Image(getClass().getResourceAsStream("photo/2.jpg")));
        imgV43.setImage(new javafx.scene.image.Image(getClass().getResourceAsStream("photo/3.jpg")));
        imgV44.setImage(new javafx.scene.image.Image(getClass().getResourceAsStream("photo/4.jpg")));
        imgV71.setImage(new javafx.scene.image.Image(getClass().getResourceAsStream("photo/1.jpg")));
        imgV72.setImage(new javafx.scene.image.Image(getClass().getResourceAsStream("photo/2.jpg")));
        imgV73.setImage(new javafx.scene.image.Image(getClass().getResourceAsStream("photo/3.jpg")));
        imgV74.setImage(new javafx.scene.image.Image(getClass().getResourceAsStream("photo/4.jpg")));
        imgV75.setImage(new javafx.scene.image.Image(getClass().getResourceAsStream("photo/5.jpg")));
        imgV76.setImage(new javafx.scene.image.Image(getClass().getResourceAsStream("photo/6.jpg")));
        imgV77.setImage(new javafx.scene.image.Image(getClass().getResourceAsStream("photo/7.jpg")));
        imgV91.setImage(new javafx.scene.image.Image(getClass().getResourceAsStream("photo/1.jpg")));
        imgV92.setImage(new javafx.scene.image.Image(getClass().getResourceAsStream("photo/2.jpg")));
        imgV93.setImage(new javafx.scene.image.Image(getClass().getResourceAsStream("photo/3.jpg")));
        imgV94.setImage(new javafx.scene.image.Image(getClass().getResourceAsStream("photo/4.jpg")));
        imgV95.setImage(new javafx.scene.image.Image(getClass().getResourceAsStream("photo/5.jpg")));
        imgV96.setImage(new javafx.scene.image.Image(getClass().getResourceAsStream("photo/6.jpg")));
        imgV97.setImage(new javafx.scene.image.Image(getClass().getResourceAsStream("photo/7.jpg")));
        imgV98.setImage(new javafx.scene.image.Image(getClass().getResourceAsStream("photo/8.jpg")));
        imgV99.setImage(new javafx.scene.image.Image(getClass().getResourceAsStream("photo/9.jpg")));
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

    public void prosmotr(MouseEvent event) {
        anchorPane1.setVisible(true);
    }

    public void glavnaya(MouseEvent event) {
        anchorPane1.setVisible(false);
    }

    @FXML
    void clickedForFourCam(MouseEvent event) {
        paneWithFourCam.setVisible(true);
        paneWithOneCam.setVisible(false);
        paneWithSevenCam.setVisible(false);
        paneWithNineCam.setVisible(false);
    }

    @FXML
    void clickedForOneCam(MouseEvent event) {
        paneWithOneCam.setVisible(true);
        paneWithFourCam.setVisible(false);
        paneWithSevenCam.setVisible(false);
        paneWithNineCam.setVisible(false);
    }

    @FXML
    void clickedForSevenCam(MouseEvent event) {
        paneWithSevenCam.setVisible(true);
        paneWithOneCam.setVisible(false);
        paneWithFourCam.setVisible(false);
        paneWithNineCam.setVisible(false);
    }

    @FXML
    void clickedForNineCam(MouseEvent event) {
        paneWithNineCam.setVisible(true);
        paneWithOneCam.setVisible(false);
        paneWithFourCam.setVisible(false);
        paneWithSevenCam.setVisible(false);
    }

    public void maximizeWindow(ActionEvent event) {
        stage = (Stage) scenePanel.getScene().getWindow();
        if (stage.getWidth() < 1920) {
            stage.setWidth(1920);
            stage.setHeight(1079);
            stage.setX(0);
            stage.setY(0);
            settingAP.setLayoutY(410);
            settingAP.setPrefHeight(305);
            othersAnchorPane.setLayoutY(730);
            othersAnchorPane.setPrefHeight(305);
            baseAnchorPane.setLayoutY(90);
            baseAnchorPane.setPrefHeight(305);


        } else {
            stage.setWidth(1440);
            stage.setHeight(900);
            stage.setX(240);
            stage.setY(50);
            settingAP.setLayoutY(360);
            settingAP.setPrefHeight(250);
            othersAnchorPane.setLayoutY(625);
            othersAnchorPane.setPrefHeight(250);
            baseAnchorPane.setLayoutY(95);
            baseAnchorPane.setPrefHeight(250);

        }

    }

    public void minimizeWindow(ActionEvent event) {
        stage = (Stage) scenePanel.getScene().getWindow();
        stage.setIconified(true);
    }
}





