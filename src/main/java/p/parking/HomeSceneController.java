package p.parking;

import java.net.URL;
import java.time.LocalDateTime;
import java.time.LocalTime;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.geometry.Insets;
import javafx.scene.Node;
import javafx.scene.control.*;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.*;
import javafx.stage.Stage;


public class HomeSceneController {
    public ToggleGroup RadioForArhSecond1;
    @FXML
    AnchorPane ustAnch1, ustAnch2, arhCamPane, arhRightPane2,zapAnch1, jurAn1,jurAn11;
    @FXML
    GridPane arhGP, prosmotrGP1;
    @FXML
    Slider arhSlider;
    @FXML
    Stage stage;
    @FXML
    TableView jurtrevTable;
    @FXML
    ImageView imgV1, imgV41, imgV42, imgV43, imgV44, imgV71, imgV72, imgV73, imgV74, imgV75, imgV76,
            imgV77, imgV91, imgV92, imgV93, imgV94, imgV95, imgV96, imgV97, imgV98, imgV99, ivProsmotr0;
    @FXML
    AnchorPane anchorPaneProsmotr, anchorPaneUst, anchorPaneArh, anchorPaneZap, anchorPaneJur, anchorPaneJurTrev, anchorPaneTrev,
            anchorPaneTur, anchorPaneProg, anchorPanePolz, scenePanel, baseAnchorPane, othersAnchorPane, settingAP, camBtnPane, camRightPane,
            rightPaneForArh;
    @FXML
    Pane basePane, basePane1, basePane11, zapBtnPane;
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
            DecBtnUp, BekBtnUp, ProshBtnUp, FonZapBtnUp, btnSplitArh;
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
         // camRightPane.setVisible(!camRightPane.isVisible());
        if(anchorPaneProsmotr.getWidth() == 1920){
            if(camRightPane.isVisible()==true){
                camRightPane.setVisible(false);
                btnSplitRightPane.setLayoutX(1897.5);
               // imgV1.setFitWidth(1885);
                prosmotrGP1.setPadding(new Insets(0,40,0,320));
            }
            else {
                camRightPane.setVisible(true);
                btnSplitRightPane.setLayoutX(1739);
               // imgV1.setFitWidth(1710);
                prosmotrGP1.setPadding(new Insets(0,200,0,0));
            }
        }else {
            if(camRightPane.isVisible()==true){
                camRightPane.setVisible(false);
                btnSplitRightPane.setLayoutX(1417.5);
               // imgV1.setFitWidth(1405);
                prosmotrGP1.setPadding(new Insets(0,90,0,90));
            }
            else {
                camRightPane.setVisible(true);
                btnSplitRightPane.setLayoutX(1262);
               // imgV1.setFitWidth(1230);
                prosmotrGP1.setPadding(new Insets(0,200,0,0));
            }
        }
    }
    public void splitCamBool(){
        if(anchorPaneProsmotr.getWidth() < 1920){
            if(camRightPane.isVisible()==false){
                btnSplitRightPane.setLayoutX(1897.5);
                imgV1.setFitWidth(1885);
                prosmotrGP1.setPadding(new Insets(0,40,0,320));
            }
            else {
                btnSplitRightPane.setLayoutX(1739);
                imgV1.setFitWidth(1710);
                prosmotrGP1.setPadding(new Insets(0,200,0,0));
            }
        }else {
            if(camRightPane.isVisible()==false){
                btnSplitRightPane.setLayoutX(1417.5);
                imgV1.setFitWidth(1405);
                prosmotrGP1.setPadding(new Insets(0,40,0,250));
            }
            else {
                btnSplitRightPane.setLayoutX(1262);
                imgV1.setFitWidth(1230);
                prosmotrGP1.setPadding(new Insets(0,200,0,0));
            }
        }
    }

    public void splitArh(ActionEvent event) {
        if(anchorPaneProsmotr.getWidth() == 1920){
            if(arhRightPane2.isVisible()==true){
                arhRightPane2.setVisible(false);
                btnSplitArh.setLayoutX(1897.5);
                arhGP.setPadding(new Insets(0,40,0,200));
                arhSlider.setPadding(new Insets(0,40,0,200));
            }
            else {
               arhRightPane2.setVisible(true);
                btnSplitArh.setLayoutX(1710);
               arhGP.setPadding(new Insets(0,220,0,0));
               arhSlider.setPadding(new Insets(0,220,0,0));
            }
        }else {
            if(arhRightPane2.isVisible()==true){
                arhRightPane2.setVisible(false);
                btnSplitArh.setLayoutX(1417.5);
                arhGP.setPadding(new Insets(0,90,0,90));
                arhSlider.setPadding(new Insets(0,90,0,90));
            }
            else {
                arhRightPane2  .setVisible(true);
                btnSplitArh.setLayoutX(1230);
                arhGP.setPadding(new Insets(0,220,0,0));
                arhSlider.setPadding(new Insets(0,220,0,0));
            }
        }
    }

    public void splitArhBool(){
        if(anchorPaneProsmotr.getWidth() < 1920){
            if(arhRightPane2.isVisible()==false){
                btnSplitArh.setLayoutX(1897.5);
                arhGP.setPadding(new Insets(0,40,0,200));
                arhSlider.setPadding(new Insets(0,40,0,200));

            }
            else {
                btnSplitArh.setLayoutX(1710);
                arhGP.setPadding(new Insets(0,220,0,0));
                arhSlider.setPadding(new Insets(0,220,0,0));


            }
        }else {
            if(arhRightPane2.isVisible()==false){
                btnSplitArh.setLayoutX(1417.5);
                arhGP.setPadding(new Insets(0,40,0,200));
                arhSlider.setPadding(new Insets(0,40,0,200));

            }
            else {
                btnSplitArh.setLayoutX(1230);
                arhGP.setPadding(new Insets(0,220,0,0));
                arhSlider.setPadding(new Insets(0,220,0,0));

            }
        }
    }

    public void initialize() {
        mxbtnView.setFitWidth(18);
        mxbtnView.setFitHeight(18);
        maxBtn.setGraphic(mxbtnView);
        ivProsmotr0.setImage(new javafx.scene.image.Image(getClass().getResourceAsStream("icon/VSTU-logo.png")));

        /* не работает
        choiceBoxForChooseFiles.getItems().addAll("Файл", "Время", "Лицо");
        choiceBoxForType.getItems().addAll("Все", "Трев. вход", "Движение", "Постоянно", "Ручная", "I-кадр видео", "Видео анализ");
        */

        imgV1.setImage(new javafx.scene.image.Image(getClass().getResourceAsStream("photo/pop3.jpg")));
        imgV41.setImage(new javafx.scene.image.Image(getClass().getResourceAsStream("photo/pop3.jpg")));
        imgV42.setImage(new javafx.scene.image.Image(getClass().getResourceAsStream("photo/pop3.jpg")));
        imgV43.setImage(new javafx.scene.image.Image(getClass().getResourceAsStream("photo/pop3.jpg")));
        imgV44.setImage(new javafx.scene.image.Image(getClass().getResourceAsStream("photo/pop3.jpg")));
        /*
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

    public void ProgCloseOff(MouseEvent event) {
        ProgClose.setVisible(false);
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
            // prosmotr
            //anchorPaneProsmotr.setPrefHeight(1003);
           // anchorPaneProsmotr.setPrefWidth(1920);
            camRightPane.setPrefHeight(850);
            camRightPane.setLayoutX(1755);
            btnSplitRightPane.setLayoutX(1739);
            btnSplitRightPane.setPrefHeight(850);
            camBtnPane.setLayoutY(885);
            camBtnPane.setLayoutX(585);

            //1 cam
            //paneWithOneCam.setPrefWidth(1710);
            //paneWithOneCam.setPrefHeight(850);
            imgV1.setFitHeight(850);
            // 4 cam
            //1/5cam
            //1/8cam
            //1/8 cam 2
            // 1 cam full
            //
            splitCamBool();
            //ust
            anchorPaneUst.setPadding(new Insets(0, 0, 30, 0));
            ustAnch1.setPrefHeight(480);
            ustAnch2.setLayoutY(502);
            ustAnch2.setPrefHeight(502);
            //arh
            arhCamPane.setLayoutX(610);
            anchorPaneArh.setPadding(new Insets(0, 0, 20, 0));
            splitArhBool();

            imgV41.setFitHeight(440);
            imgV42.setFitHeight(440);
            imgV43.setFitHeight(440);
            imgV44.setFitHeight(440);

            //jur
            anchorPaneJur.setPadding(new Insets(0, 0, 30, 0));
            jurAn1.setLayoutX(835);
            jurAn11.setLayoutX(880);
            //zap
            anchorPaneZap.setPadding(new Insets(0, 0, 30, 0));
            zapBtnPane.setLayoutX(840);
            zapAnch1.setPrefHeight(400);
            //jurtrev
            anchorPaneJurTrev.setPadding(new Insets(0, 0, 30, 0));



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
            //prosmotr
           // anchorPaneProsmotr.setPrefHeight(900);
           // anchorPaneProsmotr.setPrefWidth(1440);
            camRightPane.setPrefHeight(700);
            camRightPane.setLayoutX(1278);
            camBtnPane.setPrefWidth(730);
            camBtnPane.setLayoutY(740);
            camBtnPane.setLayoutX(313);
            btnSplitRightPane.setPrefHeight(700);
            btnSplitRightPane.setLayoutX(1262);

            //1cam
            //paneWithOneCam.setPrefHeight(700);
            //paneWithOneCam.setPrefWidth(1235);
            imgV1.setFitHeight(700);
            // 4 cam
            //1/5cam
            //1/8cam
            //1/8 cam 2
            // 1 cam full
            //
            splitCamBool();
            //ust
            anchorPaneUst.setPadding(new Insets(0, 0, 0, 0));
            ustAnch1.setPrefHeight(405);
            ustAnch2.setLayoutY(405);
            ustAnch2.setPrefHeight(405);
            //arh
            arhCamPane.setLayoutX(500);
            anchorPaneArh.setPadding(new Insets(0, 0, 0, 0));
            splitArhBool();
            imgV41.setFitHeight(350);
            imgV42.setFitHeight(350);
            imgV43.setFitHeight(350);
            imgV44.setFitHeight(350);

            //jur
            anchorPaneJur.setPadding(new Insets(0, 0, 0, 0));
            jurAn1.setLayoutX(595);
            jurAn11.setLayoutX(640);
            //zap
            zapBtnPane.setLayoutX(600);
            anchorPaneZap.setPadding(new Insets(0, 0, 0, 0));
            zapAnch1.setPrefHeight(250);
            //jurtrev
            anchorPaneJurTrev.setPadding(new Insets(0, 0, 0, 0));

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




