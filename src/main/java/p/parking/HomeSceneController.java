package p.parking;

import java.net.URL;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.*;
import javafx.stage.Stage;

public class HomeSceneController {
    @FXML
    Stage stage;
    @FXML
    ImageView imgV1, imgV41, imgV42, imgV43, imgV44, imgV71, imgV72, imgV73, imgV74, imgV75, imgV76,
            imgV77, imgV91, imgV92, imgV93, imgV94, imgV95, imgV96, imgV97, imgV98, imgV99, ivProsmotr0;
    @FXML
    AnchorPane anchorPaneProsmotr, anchorPaneUst, scenePanel, baseAnchorPane, othersAnchorPane, settingAP, camBtnPane, camRightPane;
    @FXML
    Pane basePane, basePane1, basePane11;
    @FXML
    Pane prosmotrSmallPane;
    @FXML
    Button prosmotrClose;
    @FXML
    GridPane gp;
    //ResourceBundle resources; //это че ?
    @FXML
    URL location; // а это ? не знаю, это изначально создается в scene buildere
    @FXML
    Button buttonForSevenCam, buttonForFourCam, buttonForNineCam, buttonForOneCam, jt, maxBtn, prosmotrBtnUp;
    @FXML
    AnchorPane paneWithFourCam, paneWithOneCam, paneWithSevenCam, paneWithNineCam;
    ImageView mxbtnView = new ImageView(new Image(getClass().getResourceAsStream("icon/mxmz.png")));


    public void initialize() {
        //  ImageView mxbtnView = new ImageView(new Image(getClass().getResourceAsStream("icon/mxmz.png")));
        mxbtnView.setFitWidth(18);
        mxbtnView.setFitHeight(18);
        maxBtn.setGraphic(mxbtnView);
        // ошибка если во время разворачивания / сворачивания окна в / из полноэкранного режима нажать на кнопку домой, пока окно не развернулось до конца
        ivProsmotr0.setImage(new javafx.scene.image.Image(getClass().getResourceAsStream("icon/VSTU-logo.png")));
        imgV1.setImage(new javafx.scene.image.Image(getClass().getResourceAsStream("photo/1.jpg")));
        /*imgV41.setImage(new javafx.scene.image.Image(getClass().getResourceAsStream("photo/1.jpg")));
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
        imgV99.setImage(new javafx.scene.image.Image(getClass().getResourceAsStream("photo/9.jpg")));*/
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

    public void prosmotrSmallClose(ActionEvent event) {
        gp.getChildren().remove(prosmotrSmallPane);
        gp.setPrefWidth(gp.getWidth() - 90);
        anchorPaneProsmotr.setVisible(false);
        anchorPaneUst.setVisible(false);
    }

    public void prosmotrCloseOn(MouseEvent event) {
        prosmotrClose.setVisible(true);
    }

    public void prosmotrCloseOff(MouseEvent event) {
        prosmotrClose.setVisible(false);
    }

    public void prosmotr(ActionEvent event) {
        prosmotrBtnUpper();
        anchorPaneProsmotr.setVisible(true);
        anchorPaneUst.setVisible(false);
    }

    public void glavnaya(ActionEvent event) {
        anchorPaneProsmotr.setVisible(false);
        anchorPaneUst.setVisible(false);
    }

    public void ust(ActionEvent event) {
        anchorPaneUst.setVisible(true);
        anchorPaneProsmotr.setVisible(false);
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
            mxbtnView.setImage(new Image(getClass().getResourceAsStream("icon/rstr.png")));
            stage.setWidth(1920);
            stage.setHeight(1079);
            stage.setX(0);
            stage.setY(0);
            baseAnchorPane.setPrefHeight(300);
            basePane.setLayoutY(23);
            settingAP.setPrefHeight(300);
            settingAP.setLayoutY(410);
            basePane1.setLayoutY(23);
            othersAnchorPane.setLayoutY(725);
            othersAnchorPane.setPrefHeight(300);
            basePane11.setLayoutY(23);
            anchorPaneProsmotr.setPrefHeight(1004);
            anchorPaneProsmotr.setPrefWidth(1920);
            anchorPaneUst.setPrefHeight(1004);
            anchorPaneUst.setPrefWidth(1920);
            camRightPane.setLayoutX(1730);
            camRightPane.setPrefHeight(950);
            camBtnPane.setPrefWidth(1920);
            camBtnPane.setLayoutY(873);
            // camsPane.setPrefHeight(890);
            //camsPane.setPrefWidth(1700);
            imgV1.setFitWidth(1700);
            imgV1.setFitHeight(890);
            camsMaximize();
        } else {
            mxbtnView.setImage(new Image(getClass().getResourceAsStream("icon/mxmz.png")));
            stage.setWidth(1440);
            stage.setHeight(900);
            stage.setX(240);
            stage.setY(50);
            baseAnchorPane.setPrefHeight(250);
            basePane.setLayoutY(-2);
            settingAP.setLayoutY(360);
            settingAP.setPrefHeight(250);
            basePane1.setLayoutY(-2);
            othersAnchorPane.setPrefHeight(250);
            othersAnchorPane.setLayoutY(625);
            basePane11.setLayoutY(-2);
            anchorPaneProsmotr.setPrefHeight(900);
            anchorPaneProsmotr.setPrefWidth(1440);
            camRightPane.setPrefHeight(700);
            camRightPane.setLayoutY(13);
            camRightPane.setLayoutX(1256);
            camBtnPane.setPrefWidth(1440);
            camBtnPane.setLayoutY(725);
            // camsPane.setPrefHeight(700);
            // camsPane.setPrefWidth(1241);
            imgV1.setFitWidth(1235);
            imgV1.setFitHeight(700);
        }
    }

    public void camsMaximize() {

    }

    public void prosmotrBtnUpper() {
        System.out.println("test");
        if (gp.getChildren().contains(prosmotrSmallPane)) {
            System.out.println("noth");
        } else {
            gp.add(prosmotrSmallPane, gp.getColumnCount() + 1, 0);
            gp.setPrefWidth(gp.getWidth() + 90);
            prosmotrBtnUp.setVisible(true);
        }
    }


    public void minimizeWindow(ActionEvent event) {
        stage = (Stage) scenePanel.getScene().getWindow();
        stage.setIconified(true);
    }
}





