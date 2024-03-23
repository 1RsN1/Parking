package p.parking;

import java.net.URL;
import java.time.LocalDateTime;
import java.time.LocalTime;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.Node;
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
    AnchorPane anchorPaneProsmotr, anchorPaneUst, anchorPaneArh, anchorPaneZap, anchorPaneJur, anchorPaneJurTrev,
            anchorPaneKonf, anchorPaneTrev, anchorPaneTur, anchorPanePolz, anchorPaneProg, anchorPaneMap,
            anchorPaneDec, anchorPaneBek, anchorPaneProsh, anchorPaneFonZap, scenePanel, baseAnchorPane, othersAnchorPane,
            settingAP, camBtnPane, camRightPane, rightPaneForArh;
    @FXML
    Pane basePane, basePane1, basePane11;
    @FXML
    Pane prosmotrSmallPane, UstSmallPane, ArhSmallPane, ZapSmallPane, JurSmallPane, JurTrevSmallPane, KonfSmallPane,
            TrevSmallPane, TurSmallPane, PolzSmallPane, ProgSmallPane, MapSmallPane, DecSmallPane, BekSmallPane,
            ProshSmallPane, FonZapSmallPane;
    @FXML
    Button prosmotrClose, UstClose, ArhClose, ZapClose, JurClose, JurTrevClose, KonfClose, TrevClose, TurClose,
            PolzClose, ProgClose, MapClose, DecClose, BekClose, ProshClose, FonZapClose, buttonForArhDownload;
    @FXML
    HBox hBox;
    @FXML
    URL location;
    @FXML
    Button buttonForSevenCam, buttonForFourCam, buttonForNineCam, buttonForOneCam, maxBtn, prosmotrBtnUp, UstBtnUp,
            ArhBtnUp, ZapBtnUp, JurBtnUp, JurTrevBtnUp, KonfBtnUp, TrevBtnUp, TurBtnUp, PolzBtnUp, ProgBtnUp, MapBtnUp,
            DecBtnUp, BekBtnUp, ProshBtnUp, FonZapBtnUp;
    @FXML
    AnchorPane paneWithFourCam, paneWithOneCam, paneWithSevenCam, paneWithNineCam;
    @FXML
    Button btnSplitRightPane;
    @FXML
    AnchorPane  prosmotrFX;

    ImageView mxbtnView = new ImageView(new Image(getClass().getResourceAsStream("icon/mxmz.png")));

    @FXML
    DatePicker datePickerBeginning, datePickerEnd;

    @FXML
    ChoiceBox<String> choiceBoxForChooseFiles, choiceBoxForType;
    @FXML
    ChoiceBox<?> choiceBoxForJur;
    @FXML
    ChoiceBox<?> choiceBoxForJurEq;

    @FXML
    ToggleGroup RadioForArhFirst, RadioForArhSecond, RadioForZap1, RadioForZap2, ToggleForArhPane, ToggleForJurPane;
    @FXML
    ToggleButton toggleForArhPC, toggleForArhUstr, toggleForJurPC, toggleForJurUstr;

    @FXML
    CheckBox checkBoxForArhAll, checkBoxForArhConnect;

    @FXML
    RadioButton radioForArhDop, radioForArhMain, radioForArhPhoto, radioForArhVideo;

    @FXML
    Label NameOfEquipment;
    @FXML
    TableView<?> tableViewForJurPC;
    @FXML
    TableView<?> tableViewForJurUstr;

    @FXML
    SpinnerValueFactory<LocalTime> svf = new SpinnerValueFactory<LocalTime>() {
        @Override
        public void decrement(int i) {

        }

        @Override
        public void increment(int i) {

        }
    };

    public void splitCamRightPane(ActionEvent event) {
     /*   if (camRightPane.isVisible()) {
            camRightPane.setVisible(false);
        } else {
            camRightPane.setVisible(true);
        }*/
    }

    public void initialize() {
        mxbtnView.setFitWidth(18);
        mxbtnView.setFitHeight(18);
        maxBtn.setGraphic(mxbtnView);
        ivProsmotr0.setImage(new javafx.scene.image.Image(getClass().getResourceAsStream("icon/VSTU-logo.png")));
        choiceBoxForChooseFiles.getItems().addAll("Файл", "Время", "Лицо");
        choiceBoxForType.getItems().addAll("Все", "Трев. вход", "Движение", "Постоянно", "Ручная", "I-кадр видео", "Видео анализ");
        //imgV1.setImage(new javafx.scene.image.Image(getClass().getResourceAsStream("photo/1.jpg")));
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
        alert.setContentText("Do you want to save before exiting?");
        if (alert.showAndWait().get() == ButtonType.OK) {
            stage = (Stage) scenePanel.getScene().getWindow();
            System.out.println("Successfully logged out!");
            stage.close();
        }
    }

    public void glavnaya(ActionEvent event) {
        //prosmotrFX.setVisible(false);
        anchorPaneProsmotr.setVisible(false);
        anchorPaneUst.setVisible(false);
        anchorPaneArh.setVisible(false);
        anchorPaneZap.setVisible(false);
        anchorPaneJur.setVisible(false);
        anchorPaneJurTrev.setVisible(false);
    }

    public void hboxDeleteLast(AnchorPane anchorPane) {
        if (scenePanel.getWidth() < 1920 && hBox.getChildren().size() > 12) {
            while (hBox.getChildren().size() > 12) {
                if(hBox.getChildren().getLast() == anchorPane) {
                    hBox.getChildren().remove(11, hBox.getChildren().lastIndexOf(hBox));
                } else
                    hBox.getChildren().removeLast();
            }
        }
    }

    public void hboxDeleteWhenMinimize() {
        while (hBox.getChildren().size() > 12) {
            hBox.getChildren().removeLast();
        }
    }

    public void prosmotrBtnUpper() {
        if (hBox.getChildren().contains(prosmotrSmallPane)) {
        } else {
            hBox.getChildren().addFirst(prosmotrSmallPane);
            prosmotrBtnUp.setVisible(true);
        }
    }

    public void prosmotr(ActionEvent event) {
        prosmotrBtnUpper();
        anchorPaneProsmotr.setVisible(true);
        //prosmotrFX .setVisible(true);
        anchorPaneUst.setVisible(false);
        anchorPaneArh.setVisible(false);
        anchorPaneZap.setVisible(false);
        anchorPaneJur.setVisible(false);
        anchorPaneJurTrev.setVisible(false);
        hboxDeleteLast(anchorPaneProsmotr);
    }

    public void prosmotrSmallClose(ActionEvent event) {
        hBox.getChildren().remove(prosmotrSmallPane);
       anchorPaneProsmotr.setVisible(false);
       // prosmotrFX.setVisible(false);
        //anchorPaneArh.setVisible(false);
    }

    public void prosmotrCloseOn(MouseEvent event) {
        prosmotrClose.setVisible(true);
    }

    public void prosmotrCloseOff(MouseEvent event) {
        prosmotrClose.setVisible(false);
    }

    public void UstBtnUpper() {
        if (hBox.getChildren().contains(UstSmallPane)) {
        } else {
            hBox.getChildren().addFirst(UstSmallPane);
            UstBtnUp.setVisible(true);
        }
    }

    public void UstSmallClose(ActionEvent event) {
        hBox.getChildren().remove(UstSmallPane);
        anchorPaneUst.setVisible(false);
    }

    public void ust(ActionEvent event) {
        UstBtnUpper();
        anchorPaneUst.setVisible(true);
        anchorPaneProsmotr.setVisible(false);
        anchorPaneArh.setVisible(false);
        anchorPaneZap.setVisible(false);
        anchorPaneJur.setVisible(false);
        anchorPaneJurTrev.setVisible(false);
        hboxDeleteLast(anchorPaneUst);
    }

    public void UstCloseOn(MouseEvent event) {
        UstClose.setVisible(true);
    }

    public void UstCloseOff(MouseEvent event) {
        UstClose.setVisible(false);
    }

    public void ArhBtnUpper() {
        if (hBox.getChildren().contains(ArhSmallPane)) {
        } else {
            hBox.getChildren().addFirst(ArhSmallPane);
            ArhBtnUp.setVisible(true);
        }
    }

    public void ArhSmallClose(ActionEvent event) {
        hBox.getChildren().remove(ArhSmallPane);
        anchorPaneArh.setVisible(false);
    }

    public void arh(ActionEvent event) {
        ArhBtnUpper();
        anchorPaneArh.setVisible(true);
        anchorPaneProsmotr.setVisible(false);
        anchorPaneUst.setVisible(false);
        anchorPaneZap.setVisible(false);
        anchorPaneJur.setVisible(false);
        anchorPaneJurTrev.setVisible(false);
        hboxDeleteLast(anchorPaneArh);
    }

    public void ArhCloseOn(MouseEvent event) {
        ArhClose.setVisible(true);
    }

    public void ArhCloseOff(MouseEvent event) {
        ArhClose.setVisible(false);
    }

    public void ZapBtnUpper() {
        if (hBox.getChildren().contains(ZapSmallPane)) {
        } else {
            hBox.getChildren().addFirst(ZapSmallPane);
            ArhBtnUp.setVisible(true);
        }
    }

    public void ZapSmallClose(ActionEvent event) {
        hBox.getChildren().remove(ZapSmallPane);
        anchorPaneZap.setVisible(false);
    }

    public void zap(ActionEvent event) {
        ZapBtnUpper();
        anchorPaneZap.setVisible(true);
        anchorPaneProsmotr.setVisible(false);
        anchorPaneUst.setVisible(false);
        anchorPaneArh.setVisible(false);
        anchorPaneJur.setVisible(false);
        anchorPaneJurTrev.setVisible(false);
        hboxDeleteLast(anchorPaneZap);
    }

    public void ZapCloseOn(MouseEvent event) {
        ZapClose.setVisible(true);
    }

    public void ZapCloseOff(MouseEvent event) {
        ZapClose.setVisible(false);
    }

    public void JurBtnUpper() {
        if (hBox.getChildren().contains(JurSmallPane)) {
        } else {
            hBox.getChildren().addFirst(JurSmallPane);
            JurBtnUp.setVisible(true);
        }
    }

    public void JurSmallClose(ActionEvent event) {
        hBox.getChildren().remove(JurSmallPane);
        anchorPaneJur.setVisible(false);
    }

    public void jur(ActionEvent event) {
        JurBtnUpper();
        anchorPaneJur.setVisible(true);
        anchorPaneProsmotr.setVisible(false);
        anchorPaneUst.setVisible(false);
        anchorPaneArh.setVisible(false);
        anchorPaneZap.setVisible(false);
        anchorPaneJurTrev.setVisible(false);
        hboxDeleteLast(anchorPaneJur);
    }

    public void JurCloseOn(MouseEvent event) {
        JurClose.setVisible(true);
    }

    public void JurCloseOff(MouseEvent event) {
        JurClose.setVisible(false);
    }

    public void JurTrevBtnUpper() {
        if (hBox.getChildren().contains(JurTrevSmallPane)) {
        } else {
            hBox.getChildren().addFirst(JurTrevSmallPane);
            JurTrevBtnUp.setVisible(true);
        }
    }

    public void JurTrevSmallClose(ActionEvent event) {
        hBox.getChildren().remove(JurTrevSmallPane);
        anchorPaneJurTrev.setVisible(false);
    }

    public void jurTrev(ActionEvent event) {
        JurTrevBtnUpper();
        anchorPaneJurTrev.setVisible(true);
        anchorPaneProsmotr.setVisible(false);
        anchorPaneUst.setVisible(false);
        anchorPaneArh.setVisible(false);
        anchorPaneZap.setVisible(false);
        anchorPaneJur.setVisible(false);
        hboxDeleteLast(anchorPaneJurTrev);
    }

    public void JurTrevCloseOn(MouseEvent event) {
        JurTrevClose.setVisible(true);
    }

    public void JurTrevCloseOff(MouseEvent event) {
        JurTrevClose.setVisible(false);
    }

    public void KonfBtnUpper() {
        if (hBox.getChildren().contains(KonfSmallPane)) {
        } else {
            hBox.getChildren().addFirst(KonfSmallPane);
            KonfBtnUp.setVisible(true);
        }
    }

    public void KonfSmallClose(ActionEvent event) {
        hBox.getChildren().remove(KonfSmallPane);
        anchorPaneKonf.setVisible(false);
    }

    public void konf(ActionEvent event) {
        KonfBtnUpper();
        anchorPaneKonf.setVisible(true);
        hboxDeleteLast(anchorPaneKonf);
    }

    public void KonfCloseOn(MouseEvent event) {
        KonfClose.setVisible(true);
    }

    public void KonfCloseOff(MouseEvent event) {
        KonfClose.setVisible(false);
    }

    public void TrevBtnUpper() {
        if (hBox.getChildren().contains(TrevSmallPane)) {
        } else {
            hBox.getChildren().addFirst(TrevSmallPane);
            TrevBtnUp.setVisible(true);
        }
    }

    public void TrevSmallClose(ActionEvent event) {
        hBox.getChildren().remove(TrevSmallPane);
        anchorPaneTrev.setVisible(false);
    }

    public void trev(ActionEvent event) {
        TrevBtnUpper();
        anchorPaneTrev.setVisible(true);
        hboxDeleteLast(anchorPaneTrev);
    }

    public void TrevCloseOn(MouseEvent event) {
        TrevClose.setVisible(true);
    }

    public void TrevCloseOff(MouseEvent event) {
        TrevClose.setVisible(false);
    }

    public void TurBtnUpper() {
        if (hBox.getChildren().contains(TurSmallPane)) {
        } else {
            hBox.getChildren().addFirst(TurSmallPane);
            TurBtnUp.setVisible(true);
        }
    }

    public void TurSmallClose(ActionEvent event) {
        hBox.getChildren().remove(TurSmallPane);
        anchorPaneTur.setVisible(false);
    }

    public void tur(ActionEvent event) {
        TurBtnUpper();
        anchorPaneTur.setVisible(true);
        hboxDeleteLast(anchorPaneTur);
    }

    public void TurCloseOn(MouseEvent event) {
        TurClose.setVisible(true);
    }

    public void TurCloseOff(MouseEvent event) {
        TurClose.setVisible(false);
    }

    public void PolzBtnUpper() {
        if (hBox.getChildren().contains(PolzSmallPane)) {
        } else {
            hBox.getChildren().addFirst(PolzSmallPane);
            PolzBtnUp.setVisible(true);
        }
    }

    public void PolzSmallClose(ActionEvent event) {
        hBox.getChildren().remove(PolzSmallPane);
        anchorPanePolz.setVisible(false);
    }

    public void polz(ActionEvent event) {
        PolzBtnUpper();
        anchorPanePolz.setVisible(true);
        hboxDeleteLast(anchorPanePolz);
    }

    public void PolzCloseOn(MouseEvent event) {
        PolzClose.setVisible(true);
    }

    public void PolzCloseOff(MouseEvent event) {
        PolzClose.setVisible(false);
    }

    public void ProgBtnUpper() {
        if (hBox.getChildren().contains(ProgSmallPane)) {
        } else {
            hBox.getChildren().addFirst(ProgSmallPane);
            ProgBtnUp.setVisible(true);
        }
    }

    public void ProgSmallClose(ActionEvent event) {
        hBox.getChildren().remove(ProgSmallPane);
        anchorPaneProg.setVisible(false);
    }

    public void prog(ActionEvent event) {
        ProgBtnUpper();
        anchorPaneProg.setVisible(true);
        hboxDeleteLast(anchorPaneProg);
    }

    public void ProgCloseOn(MouseEvent event) {
        ProgClose.setVisible(true);
    }

    public void ProgCloseOff(MouseEvent event) {
        ProgClose.setVisible(false);
    }

    public void MapBtnUpper() {
        if (hBox.getChildren().contains(MapSmallPane)) {
        } else {
            hBox.getChildren().addFirst(MapSmallPane);
            MapBtnUp.setVisible(true);
        }
    }

    public void MapSmallClose(ActionEvent event) {
        hBox.getChildren().remove(MapSmallPane);
        anchorPaneMap.setVisible(false);
    }

    public void map(ActionEvent event) {
        MapBtnUpper();
        anchorPaneMap.setVisible(true);
        hboxDeleteLast(anchorPaneMap);
    }

    public void MapCloseOn(MouseEvent event) {
        MapClose.setVisible(true);
    }

    public void MapCloseOff(MouseEvent event) {
        MapClose.setVisible(false);
    }

    public void DecBtnUpper() {
        if (hBox.getChildren().contains(DecSmallPane)) {
        } else {
            hBox.getChildren().addFirst(DecSmallPane);
            DecBtnUp.setVisible(true);
        }
    }

    public void DecSmallClose(ActionEvent event) {
        hBox.getChildren().remove(DecSmallPane);
        anchorPaneDec.setVisible(false);
    }

    public void dec(ActionEvent event) {
        DecBtnUpper();
        anchorPaneDec.setVisible(true);
        hboxDeleteLast(anchorPaneDec);
    }

    public void DecCloseOn(MouseEvent event) {
        DecClose.setVisible(true);
    }

    public void DecCloseOff(MouseEvent event) {
        DecClose.setVisible(false);
    }

    public void BekBtnUpper() {
        if (hBox.getChildren().contains(BekSmallPane)) {
        } else {
            hBox.getChildren().addFirst(BekSmallPane);
            BekBtnUp.setVisible(true);
        }
    }

    public void BekSmallClose(ActionEvent event) {
        hBox.getChildren().remove(BekSmallPane);
        anchorPaneBek.setVisible(false);
    }

    public void bek(ActionEvent event) {
        BekBtnUpper();
        anchorPaneBek.setVisible(true);
        hboxDeleteLast(anchorPaneBek);
    }

    public void BekCloseOn(MouseEvent event) {
        BekClose.setVisible(true);
    }

    public void BekCloseOff(MouseEvent event) {
        BekClose.setVisible(false);
    }

    public void ProshBtnUpper() {
        if (hBox.getChildren().contains(ProshSmallPane)) {
        } else {
            hBox.getChildren().addFirst(ProshSmallPane);
            ProshBtnUp.setVisible(true);
        }
    }

    public void ProshSmallClose(ActionEvent event) {
        hBox.getChildren().remove(ProshSmallPane);
        anchorPaneProsh.setVisible(false);
    }

    public void prosh(ActionEvent event) {
        ProshBtnUpper();
        anchorPaneProsh.setVisible(true);
        hboxDeleteLast(anchorPaneProsh);
    }

    public void ProshCloseOn(MouseEvent event) {
        ProshClose.setVisible(true);
    }

    public void ProshCloseOff(MouseEvent event) {
        ProshClose.setVisible(false);
    }

    public void FonZapBtnUpper() {
        if (hBox.getChildren().contains(FonZapSmallPane)) {
        } else {
            hBox.getChildren().addFirst(FonZapSmallPane);
            FonZapBtnUp.setVisible(true);
        }
    }

    public void FonZapSmallClose(ActionEvent event) {
        hBox.getChildren().remove(FonZapSmallPane);
        anchorPaneFonZap.setVisible(false);
    }

    public void fonZap(ActionEvent event) {
        FonZapBtnUpper();
        anchorPaneFonZap.setVisible(true);
        hboxDeleteLast(anchorPaneFonZap);
    }

    public void FonZapCloseOn(MouseEvent event) {
        FonZapClose.setVisible(true);
    }

    public void FonZapCloseOff(MouseEvent event) {
        FonZapClose.setVisible(false);
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
            camRightPane.setPrefHeight(850);
            camRightPane.setLayoutX(1755);
            camBtnPane.setPrefWidth(1920);
            camBtnPane.setLayoutY(900);
            paneWithOneCam.setPrefWidth(1710);
            paneWithOneCam.setPrefHeight(850);
            imgV1.setFitWidth(1705);
            imgV1.setFitHeight(850);
            btnSplitRightPane.setLayoutX(1736);
            btnSplitRightPane.setPrefHeight(857);
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
            camRightPane.setLayoutX(1278);
            camBtnPane.setPrefWidth(730);
            camBtnPane.setLayoutY(740);
            camBtnPane.setLayoutX(313);
            // camsPane.setPrefHeight(700);
            // camsPane.setPrefWidth(1241);
            paneWithOneCam.setPrefHeight(700);
            paneWithOneCam.setPrefWidth(1235);
            imgV1.setFitWidth(1235);
            imgV1.setFitHeight(700);
            btnSplitRightPane.setPrefHeight(707);
            btnSplitRightPane.setLayoutX(1259);
            hboxDeleteWhenMinimize();
        }
    }

    public void camsMaximize() {

    }

    public void minimizeWindow(ActionEvent event) {
        stage = (Stage) scenePanel.getScene().getWindow();
        stage.setIconified(true);
    }

    /*==================================== AnchorPane Arh ==========================================*/

    @FXML
    void getDateFromDatePicker(ActionEvent event) {
        LocalDateTime time = datePickerBeginning.getValue().atTime(0, 0, 0);
    }

    @FXML
    void getChoiceBoxForFiles(MouseEvent event) {

    }
    @FXML
    void getChoiceBoxForType(MouseEvent event) {

    }

    @FXML
    void toggleForArhPCAction(ActionEvent event) {
        if(event.getSource() == toggleForArhPC) {
            checkBoxForArhAll.setVisible(false);
            checkBoxForArhConnect.setVisible(false);
            choiceBoxForChooseFiles.setLayoutX(20);
            radioForArhDop.setVisible(false);
            radioForArhMain.setVisible(false);
            radioForArhPhoto.setVisible(false);
            radioForArhVideo.setVisible(false);
            rightPaneForArh.setPrefHeight(640);
            buttonForArhDownload.setVisible(false);
        }
    }

    @FXML
    void toggleForArhUstrAction(ActionEvent event) {
        if(event.getSource() == toggleForArhUstr) {
            checkBoxForArhAll.setVisible(true);
            checkBoxForArhConnect.setVisible(true);
            choiceBoxForChooseFiles.setLayoutX(320);
            radioForArhDop.setVisible(true);
            radioForArhMain.setVisible(true);
            radioForArhPhoto.setVisible(true);
            radioForArhVideo.setVisible(true);
            rightPaneForArh.setPrefHeight(580);
            buttonForArhDownload.setVisible(true);
        }
    }

    /*==================================== AnchorPane Jur ==========================================*/

    @FXML
    void toggleForJurPCAction(ActionEvent event) {
        if(event.getSource() == toggleForJurPC) {
            NameOfEquipment.setVisible(false);
            choiceBoxForJurEq.setVisible(false);
            tableViewForJurPC.setVisible(true);
            tableViewForJurUstr.setVisible(false);
        }
    }

    @FXML
    void toggleForJurUstrAction(ActionEvent event) {
        if(event.getSource() == toggleForJurUstr) {
            NameOfEquipment.setVisible(true);
            choiceBoxForJurEq.setVisible(true);
            tableViewForJurUstr.setVisible(true);
            tableViewForJurPC.setVisible(false);
        }
    }
}




