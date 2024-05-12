package p.parking;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.net.URL;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.util.*;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.geometry.Insets;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.*;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.stage.FileChooser;
import javafx.stage.Stage;


public class HomeSceneController {
    public ToggleGroup RadioForArhSecond1;
    @FXML
    AnchorPane ustAnch1, ustAnch2, arhCamPane, arhRightPane2, zapAnch1, jurAn1, jurAn11;
    @FXML
    GridPane arhGP, prosmotrGP1;
    @FXML
    Slider arhSlider;
    @FXML
    Stage stage;


    @FXML
    ImageView imgV1, imgV41, imgV42, imgV43, imgV44, imgV71, imgV72, imgV73, imgV74, imgV75, imgV76,
            imgV77, imgV91, imgV92, imgV93, imgV94, imgV95, imgV96, imgV97, imgV98, imgV99, ivProsmotr0, imArh1, imArh2, imArh3, imArh4;
    @FXML
    AnchorPane anchorPaneProsmotr, anchorPaneUst, anchorPaneArh, anchorPaneZap, anchorPaneJur, anchorPaneJurTrev, anchorPaneTrev,
            anchorPaneTur, anchorPaneProg, anchorPanePolz, homePanel, baseAnchorPane, othersAnchorPane, settingAP, camBtnPane, camRightPane,
            rightPaneForArh, trevogaPane, jurTrevBtnSchalgPane, newPolz1, newPolz2, baseAnchorPane112, baseAnchorPane111, polzUtilAP;
    @FXML
    Pane basePane, basePane1, basePane11, zapBtnPane;
    @FXML
    Pane prosmotrSmallPane, UstSmallPane, ArhSmallPane, ZapSmallPane, JurSmallPane, JurTrevSmallPane, KonfSmallPane,
            TrevSmallPane, TurSmallPane, PolzSmallPane, ProgSmallPane, MapSmallPane, DecSmallPane, BekSmallPane,
            ProshSmallPane, FonZapSmallPane;
    @FXML
    Button prosmotrClose, UstClose, ArhClose, ZapClose, JurClose, JurTrevClose, TrevClose, TurClose,
            PolzClose, ProgClose, buttonForArhDownload, buttonForSevenCam, buttonForFourCam, buttonForNineCam, buttonForOneCam, maxBtn,
            prosmotrBtnUp, UstBtnUp, ArhBtnUp, ZapBtnUp, JurBtnUp, JurTrevBtnUp, TrevBtnUp, TurBtnUp, PolzBtnUp, ProgBtnUp, btnSplitArh,
            trevPrimBtn, btnNewPolz, lookBtnForProg1, lookBtnForProg2, lookBtnForProg3, btnResetProg, trevPrimBtn1;
    @FXML
    TextField chooseMusicTrev1, chooseMusicTrev2, chooseMusicTrev3, chooseMusicTrev4, chooseMusicTrev5, chooseMusicTrev6,
            chooseMusicTrev7, chooseMusicTrev8, chooseMusicTrev9, chooseMusicTrev10, adminPodtvField, secLogField,
            secPassField, secPodtvField, adminLogField, adminPassField, textFieldForProg1, textFieldForProg2, textFieldForProg3;

    @FXML
    HBox hBox;
    @FXML
    URL location;
    @FXML
    AnchorPane paneWithFourCam, paneWithOneCam, paneWithSevenCam, paneWithNineCam;
    @FXML
    Button btnSplitRightPane;
    @FXML
    AnchorPane prosmotrFX;

    @FXML
    MouseEvent mouseEvent;

    ImageView mxbtnView = new ImageView(new Image(getClass().getResourceAsStream("icon/mxmz.png")));

    @FXML
    DatePicker datePickerBeginning, datePickerEnd, datePickerArh1, datePickerArh2;

    @FXML
    ChoiceBox<String> choiceBoxForChooseFiles, choiceBoxForType, choiceBoxForProg1, choiceBoxForProg2, choiceBoxForProg3,
            choiceBoxForProg4, choiceBoxForProg5, choiceBoxForProg6, choiceBoxForProg7;
    @FXML
    ChoiceBox<String> choiceBoxForJurEq;

    @FXML
    ToggleGroup RadioForArhFirst, RadioForArhSecond, RadioForZap1, RadioForZap2, ToggleForArhPane, ToggleForJurPane;
    @FXML
    ToggleButton toggleForArhPC, toggleForArhUstr, toggleForJurPC, toggleForJurUstr;

    @FXML
    CheckBox checkBoxForArhAll, checkBoxForArhConnect, checkBoxForProg1, checkBoxForProg2, checkBoxForProg3, checkBoxForProg4,
            checkBoxForProg5, checkBoxForProg6, checkBoxForProg7, checkBoxForProg8, checkBoxForProg9, checkBoxForProg10;

    @FXML
    RadioButton radioForArhDop, radioForArhMain, radioForArhPhoto, radioForArhVideo;

    @FXML
    Label NameOfEquipment, textIfWrongPolz, trevLabel;
    /*@FXML
    TableColumn jurUPrim, jurPCPrim;*/
    @FXML
    Label
            arhLabel, turLabel, progLabel, polzLabel, jurLabel, zapLabel, jurTrevLabel;
    @FXML
    Button arhBtn, progBtn, polzBtn, jurBtn, zapBtn, jurTrevBtn, trevBtn;
    @FXML
    GridPane prosmotrGP4, prosmotrGP9;
    @FXML
    ImageView imArh11, imArh21,imArh31,imArh41, imArh411,imArh311,imArh111,imArh2111,imArh211,imArh1111,imArh3111,imArh4111,imArh2112;
    /*==================================== Колонки таблицы журнала тревог ==========================================*/
    private ObservableList<Accident> accidentsData = FXCollections.observableArrayList();
    @FXML
    private TableView<Accident> jurtrevTable;
    @FXML
    private TableColumn<Accident, Integer> jurTrevNum;
    @FXML
    private TableColumn<Accident, String> jurTrevStat;
    @FXML
    private TableColumn<Accident, String> jurTrevType;
    @FXML
    private TableColumn<Accident, String> jurTrevTime;
    @FXML
    private TableColumn<Accident, String> jurTrevUst;
    @FXML
    private TableColumn<Accident, String> jurTrevRes;
    /*==================================== Колонки таблицы устройств верхняя ==========================================*/
    private ObservableList<DeviceUpTable> deviceUpData = FXCollections.observableArrayList();
    @FXML
    private TableView<DeviceUpTable> ustUpTableV;
    @FXML
    private TableColumn<DeviceUpTable, String> nameUp;
    @FXML
    private TableColumn<DeviceUpTable, String> cloudIDUp;
    @FXML
    private TableColumn<DeviceUpTable, String> portUp;
    @FXML
    private TableColumn<DeviceUpTable, String> protocol;
    @FXML
    private TableColumn<DeviceUpTable, String> groupUp;
    /*==================================== Колонки таблицы устройств нижняя ==========================================*/
    private ObservableList<DeviceDownTable> deviceDownData = FXCollections.observableArrayList();
    @FXML
    private TableView<DeviceDownTable> ustDownTableV;
    @FXML
    private TableColumn<DeviceDownTable, String> nameDown;
    @FXML
    private TableColumn<DeviceDownTable, String> cloudIDDown;
    @FXML
    private TableColumn<DeviceDownTable, String> portDown;
    @FXML
    private TableColumn<DeviceDownTable, String> version;
    @FXML
    private TableColumn<DeviceDownTable, String> groupDown;
    @FXML
    private TableColumn<DeviceDownTable, String> status;
    @FXML
    private TableColumn<DeviceDownTable, String> security;
    @FXML
    private TableColumn<DeviceDownTable, String> recording;
    @FXML
    private TableColumn<DeviceDownTable, String> connection;
    @FXML
    private TableColumn<DeviceDownTable, String> operation;


    /*==================================== Колонки таблицы журнала==========================================*/

    private ObservableList<TableJurPC> tableJurPCData = FXCollections.observableArrayList();
    private ObservableList<TableJurUstr> tableJursUstrData = FXCollections.observableArrayList();
    @FXML
    private TableView<TableJurPC> tableViewForJurPC;
    @FXML
    private TableView<TableJurUstr> tableViewForJurUstr;
    @FXML
    private TableColumn<TableJurPC, Integer> numberColumnPC;
    @FXML
    private TableColumn<TableJurUstr, Integer> numberColumnUstr;
    @FXML
    private TableColumn<TableJurPC, String> timeColumnPC;
    @FXML
    private TableColumn<TableJurUstr, String> timeColumnUstr;
    @FXML
    private TableColumn<TableJurPC, String> polzColumnPC;
    @FXML
    private TableColumn<TableJurUstr, String> polzColumnUstr;
    @FXML
    private TableColumn<TableJurPC, String> typeColumnPC;
    @FXML
    private TableColumn<TableJurUstr, String> typeColumnUstr;
    @FXML
    private TableColumn<TableJurPC, String> ustrColumnPC;
    @FXML
    private TableColumn<TableJurPC, String> chanelColumnPC;
    @FXML
    private TableColumn<TableJurPC, String> noteColumnPC;
    @FXML
    private TableColumn<TableJurUstr, String> noteColumnUstr;

    /*=============================================================================================================*/
    boolean isAdmin;

    public boolean start() throws IOException {
        FileInputStream inputStream = new FileInputStream("parol.txt");
        byte[] buffer = new byte[1024];
        int bytesRead = inputStream.read(buffer);
        return isAdmin = new String(buffer, 0, bytesRead).equals("true");//TODO попробовать убрать сравнение
    }


// TODO *баг на архиве после максимизирования и обратного минимизирования невозможно заново максимизировать - не работает
//  из-за изменения размера окон просмотра изображений в архиве - требуется дороботка баг*

    //TODO увеличить размер шрифта в таблицах  - jurTrevType.setStyle("-fx-font-size: 22px;"); / сделать их непередвигаемыми
    //TODO сделать таблицы для устройств devices / журнала log / журнала тревогог accidents


    public void initialize() throws IOException {
        start();
        if (!isAdmin) {
            securityLoad();
        }
        //accidents
        initTableJurTrev();
        jurTrevNum.setCellValueFactory(new PropertyValueFactory<Accident, Integer>("num"));
        jurTrevStat.setCellValueFactory(new PropertyValueFactory<Accident, String>("status"));
        jurTrevType.setCellValueFactory(new PropertyValueFactory<Accident, String>("type"));
        jurTrevTime.setCellValueFactory(new PropertyValueFactory<Accident, String>("date"));
        jurTrevUst.setCellValueFactory(new PropertyValueFactory<Accident, String>("ustr"));
        jurTrevRes.setCellValueFactory(new PropertyValueFactory<Accident, String>("result"));
        jurtrevTable.setItems(accidentsData);
        //deviceUp
        initDeviceUp();
        nameUp.setCellValueFactory(new PropertyValueFactory<DeviceUpTable, String>("name"));
        cloudIDUp.setCellValueFactory(new PropertyValueFactory<DeviceUpTable, String>("cloudID"));
        portUp.setCellValueFactory(new PropertyValueFactory<DeviceUpTable, String>("IPport"));
        protocol.setCellValueFactory(new PropertyValueFactory<DeviceUpTable, String>("protocol"));
        groupUp.setCellValueFactory(new PropertyValueFactory<DeviceUpTable, String>("group"));
        ustUpTableV.setItems(deviceUpData);
        //device down
        initDeviceDown();
        nameDown.setCellValueFactory(new PropertyValueFactory<DeviceDownTable, String>("name"));
        cloudIDDown.setCellValueFactory(new PropertyValueFactory<DeviceDownTable, String>("cloudID"));
        portDown.setCellValueFactory(new PropertyValueFactory<DeviceDownTable, String>("IPport"));
        version.setCellValueFactory(new PropertyValueFactory<DeviceDownTable, String>("version"));
        groupDown.setCellValueFactory(new PropertyValueFactory<DeviceDownTable, String>("group"));
        status.setCellValueFactory(new PropertyValueFactory<DeviceDownTable, String>("status"));
        security.setCellValueFactory(new PropertyValueFactory<DeviceDownTable, String>("security"));
        recording.setCellValueFactory(new PropertyValueFactory<DeviceDownTable, String>("recording"));
        connection.setCellValueFactory(new PropertyValueFactory<DeviceDownTable, String>("connection"));
        operation.setCellValueFactory(new PropertyValueFactory<DeviceDownTable, String>("operation"));
        ustDownTableV.setItems(deviceDownData);
        //Log
        initTableJurPC();
        initTableJurUstr();
        numberColumnPC.setCellValueFactory(new PropertyValueFactory<TableJurPC, Integer>("numberPC"));
        numberColumnUstr.setCellValueFactory(new PropertyValueFactory<TableJurUstr, Integer>("numberUstr"));
        timeColumnPC.setCellValueFactory(new PropertyValueFactory<TableJurPC, String>("timePC"));
        timeColumnUstr.setCellValueFactory(new PropertyValueFactory<TableJurUstr, String>("timeUstr"));
        polzColumnPC.setCellValueFactory(new PropertyValueFactory<TableJurPC, String>("polzPC"));
        polzColumnUstr.setCellValueFactory(new PropertyValueFactory<TableJurUstr, String>("polzUstr"));
        typeColumnPC.setCellValueFactory(new PropertyValueFactory<TableJurPC, String>("typePC"));
        typeColumnUstr.setCellValueFactory(new PropertyValueFactory<TableJurUstr, String>("typeUstr"));
        ustrColumnPC.setCellValueFactory(new PropertyValueFactory<TableJurPC, String>("ustr"));
        chanelColumnPC.setCellValueFactory(new PropertyValueFactory<TableJurPC, String>("chanel"));
        noteColumnPC.setCellValueFactory(new PropertyValueFactory<TableJurPC, String>("notePC"));
        noteColumnUstr.setCellValueFactory(new PropertyValueFactory<TableJurUstr, String>("noteUstr"));
        tableViewForJurPC.setItems(tableJurPCData);
        tableViewForJurUstr.setItems(tableJursUstrData);
        //
        mxbtnView.setFitWidth(18);
        mxbtnView.setFitHeight(18);
        maxBtn.setGraphic(mxbtnView);
        ivProsmotr0.setImage(new Image(getClass().getResourceAsStream("icon/VSTU-logo.png")));
        //Zap
        choiceBoxForChooseFiles.getItems().addAll("Файл", "Время", "Лицо");
        choiceBoxForChooseFiles.setValue("Файл");
        choiceBoxForType.getItems().addAll("Все", "Трев. вход", "Движение", "Постоянно", "Ручная", "I-кадр видео", "Видео анализ");
        choiceBoxForType.setValue("Все");
        choiceBoxForJurEq.getItems().addAll("Камера 1", "Камера 2", "Камера 3");
        choiceBoxForJurEq.setValue("Камера 1");
        imgV1.setImage(new Image(getClass().getResourceAsStream("photo/pop3.jpg")));
        imArh1.setImage(new javafx.scene.image.Image(getClass().getResourceAsStream("photo/pop3.jpg")));
        imArh2.setImage(new javafx.scene.image.Image(getClass().getResourceAsStream("photo/pop3.jpg")));
        imArh3.setImage(new javafx.scene.image.Image(getClass().getResourceAsStream("photo/pop3.jpg")));
        imArh4.setImage(new javafx.scene.image.Image(getClass().getResourceAsStream("photo/pop3.jpg")));
        imgV1.setImage(new Image(getClass().getResourceAsStream("photo/pop3.jpg")));
        imArh11.setImage(new javafx.scene.image.Image(getClass().getResourceAsStream("photo/pop3.jpg")));
        imArh21.setImage(new javafx.scene.image.Image(getClass().getResourceAsStream("photo/pop3.jpg")));
        imArh31.setImage(new javafx.scene.image.Image(getClass().getResourceAsStream("photo/pop3.jpg")));
        imArh41.setImage(new javafx.scene.image.Image(getClass().getResourceAsStream("photo/pop3.jpg")));
        imArh411.setImage(new javafx.scene.image.Image(getClass().getResourceAsStream("photo/pop3.jpg")));
        imArh311.setImage(new javafx.scene.image.Image(getClass().getResourceAsStream("photo/pop3.jpg")));
        imArh111.setImage(new javafx.scene.image.Image(getClass().getResourceAsStream("photo/pop3.jpg")));
        imArh2111.setImage(new javafx.scene.image.Image(getClass().getResourceAsStream("photo/pop3.jpg")));
        imArh211.setImage(new javafx.scene.image.Image(getClass().getResourceAsStream("photo/pop3.jpg")));
        imArh1111.setImage(new javafx.scene.image.Image(getClass().getResourceAsStream("photo/pop3.jpg")));
        imArh3111.setImage(new javafx.scene.image.Image(getClass().getResourceAsStream("photo/pop3.jpg")));
        imArh4111.setImage(new javafx.scene.image.Image(getClass().getResourceAsStream("photo/pop3.jpg")));
        imArh2112.setImage(new javafx.scene.image.Image(getClass().getResourceAsStream("photo/pop3.jpg")));

        //Trev
        chooseMusicTrev1.setText("D:\\VMS\\sound\\Russian\\motion.wav");
        chooseMusicTrev2.setText("D:\\VMS\\sound\\Russian\\cover.wav");
        chooseMusicTrev3.setText("D:\\VMS\\sound\\Russian\\outAlarm.wav");
        chooseMusicTrev4.setText("D:\\VMS\\sound\\Russian\\lost.wav");
        chooseMusicTrev5.setText("D:\\VMS\\sound\\Russian\\analyze.wav");
        chooseMusicTrev6.setText("D:\\VMS\\sound\\Russian\\humanDetect.wav");
        chooseMusicTrev7.setText("D:\\VMS\\sound\\Russian\\facedetect.wav");
        chooseMusicTrev8.setText("D:\\VMS\\sound\\Russian\\diskfull.wav");
        chooseMusicTrev9.setText("D:\\VMS\\sound\\Russian\\diskerror.wav");
        chooseMusicTrev10.setText("D:\\VMS\\sound\\Russian\\carshapedetect.wav");
        //Prog
        choiceBoxForProg1.getItems().addAll("30 дней", "60 дней", "90 дней");
        choiceBoxForProg1.setValue("30 дней");
        choiceBoxForProg2.getItems().addAll("30000", "60000", "90000");
        choiceBoxForProg2.setValue("30000");
        choiceBoxForProg3.getItems().addAll("1", "2", "3", "4", "5", "6", "7");
        choiceBoxForProg3.setValue("4");
        choiceBoxForProg4.getItems().addAll("AVI/H265", "MP4", "Элементарный поток");
        choiceBoxForProg4.setValue("AVI/H265");
        choiceBoxForProg5.getItems().addAll("H264/H265", "AVI", "MP4");
        choiceBoxForProg5.setValue("H264/H265");
        choiceBoxForProg6.getItems().addAll("PNG", "BMP", "JPG");
        choiceBoxForProg6.setValue("JPG");
        choiceBoxForProg7.getItems().addAll("По умолчанию", "Direct", "GDI");
        choiceBoxForProg7.setValue("По умолчанию");
        textFieldForProg1.setText("D:/VMS/data/users/admin/pictures");
        textFieldForProg2.setText("D:/VMS/data/users/admin/downloads");
        textFieldForProg3.setText("D:/VMS/data/users/admin/log");
        fileChooserForProg.setInitialDirectory(new File("D:\\VMS\\data\\users\\admin"));
    }


    public void maximizeWindow(ActionEvent event) {
        stage = (Stage) homePanel.getScene().getWindow();
        if (stage.getWidth() < 1920) {
            glavnayaMaximize();
            prosmotrMaximize();
            arhMaximize();
            zapMaximize();
            trevMaximize();
            jurMaximize();
            JurTrevMaximize();
            ustMaximize();
            progMaximize();
            polzMaximize();
        } else {
            glavnayaMinimize();
            prosmotrMinimize();
            arhMinimize();
            zapMinimize();
            trevMinimize();
            jurMinimize();
            JurTrevMinimize();
            ustMinimize();
            progMinimize();
            polzMinimize();
            hboxDeleteWhenMinimize();
        }
    }

    public void minimizeWindow(ActionEvent event) {
        stage = (Stage) homePanel.getScene().getWindow();
        stage.setIconified(true);
    }

    /*==================================== Glavnaya ==========================================*/
    public void logout(ActionEvent event) {
        Alert alert = new Alert(Alert.AlertType.CONFIRMATION);
        alert.setTitle("Logout");
        alert.setHeaderText("You are about to logout!");
        alert.setContentText("Do you want to save before exiting?");
        if (alert.showAndWait().get() == ButtonType.OK) {
            stage = (Stage) homePanel.getScene().getWindow();
            System.out.println("Successfully logged out!");
            stage.close();
        }
    }

    public void glavnaya(ActionEvent event) {
        anchorPaneProsmotr.setVisible(false);
        anchorPaneUst.setVisible(false);
        anchorPaneArh.setVisible(false);
        anchorPaneZap.setVisible(false);
        anchorPaneJur.setVisible(false);
        anchorPaneJurTrev.setVisible(false);
        anchorPaneTrev.setVisible(false);
        anchorPanePolz.setVisible(false);
        anchorPaneProg.setVisible(false);
    }

    public void hboxDeleteLast(AnchorPane anchorPane) {
        if (homePanel.getWidth() < 1920 && hBox.getChildren().size() > 12) {
            while (hBox.getChildren().size() > 12) {
                if (hBox.getChildren().getLast() == anchorPane) {
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

    public void glavnayaMinimize() {
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
    }

    public void glavnayaMaximize() {
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
    }

    public void securityLoad() {
        polzBtn.setVisible(false);
        progBtn.setVisible(false);
        polzLabel.setVisible(false);
        progLabel.setVisible(false);
        trevBtn.setVisible(false);
        trevLabel.setVisible(false);
        jurBtn.setLayoutX(50);
        jurLabel.setLayoutX(50);
        jurTrevBtn.setLayoutX(190);
        jurTrevLabel.setLayoutX(180);
    }

    /************************************** Основное ******************************************************************
     /*==================================== Просмотр ==========================================*/
    public void prosmotrMinimize() {
        basePane11.setLayoutY(-2);
        camRightPane.setPrefHeight(700);
        camRightPane.setLayoutX(1280);
        camBtnPane.setPrefWidth(730);
        camBtnPane.setLayoutY(740);
        camBtnPane.setLayoutX(313);
        btnSplitRightPane.setPrefHeight(700);
        btnSplitRightPane.setLayoutX(1262);
        imgV1.setFitHeight(690);
        imArh11.setFitHeight(350);
        imArh11.setFitWidth(600);
        imArh21.setFitHeight(600);
        imArh21.setFitWidth(600);
        imArh31.setFitHeight(350);
        imArh31.setFitWidth(600);
        imArh41.setFitHeight(350);
        imArh41.setFitWidth(600);
        //
        imArh411.setFitHeight(226);
        imArh411.setFitWidth(405);
        imArh311.setFitHeight(226);
        imArh311.setFitWidth(405);
        imArh111.setFitHeight(226);
        imArh111.setFitWidth(405);
        imArh2111.setFitHeight(226);
        imArh2111.setFitWidth(405);
        imArh211.setFitHeight(226);
        imArh211.setFitWidth(405);
        imArh1111.setFitHeight(226);
        imArh1111.setFitWidth(405);
        imArh3111.setFitHeight(226);
        imArh3111.setFitWidth(405);
        imArh4111.setFitHeight(226);
        imArh4111.setFitWidth(405);
        imArh2112.setFitHeight(226);
        imArh2112.setFitWidth(405);
        prosmotrGP9.setPrefWidth(1200);
        prosmotrGP9.setPrefHeight(674);
        prosmotrGP4.setPrefWidth(1200);
        prosmotrGP4.setPrefHeight(674);
        splitCamBool();
    }

    public void prosmotrMaximize() {
        basePane11.setLayoutY(23);
        camRightPane.setPrefHeight(870);
        camRightPane.setLayoutX(1755);
        btnSplitRightPane.setLayoutX(1739);
        btnSplitRightPane.setPrefHeight(870);
        camBtnPane.setLayoutY(885);
        camBtnPane.setLayoutX(585);
        imgV1.setFitHeight(850);
        imArh11.setFitHeight(418);
        imArh11.setFitWidth(1000);
        imArh21.setFitHeight(418);
        imArh21.setFitWidth(1000);
        imArh31.setFitHeight(418);
        imArh31.setFitWidth(1000);
        imArh41.setFitHeight(418);
        imArh41.setFitWidth(1000);
        //
        imArh411.setFitHeight(280);
        imArh411.setFitWidth(505);
        imArh311.setFitHeight(280);
        imArh311.setFitWidth(505);
        imArh111.setFitHeight(280);
        imArh111.setFitWidth(505);
        imArh2111.setFitHeight(280);
        imArh2111.setFitWidth(505);
        imArh211.setFitHeight(280);
        imArh211.setFitWidth(505);
        imArh1111.setFitHeight(280);
        imArh1111.setFitWidth(505);
        imArh3111.setFitHeight(280);
        imArh3111.setFitWidth(505);
        imArh4111.setFitHeight(280);
        imArh4111.setFitWidth(505);
        imArh2112.setFitHeight(280);
        imArh2112.setFitWidth(505);
        prosmotrGP4.setPrefWidth(1486);
        prosmotrGP4.setPrefHeight(836);
        prosmotrGP9.setPrefHeight(836);
        prosmotrGP9.setPrefWidth(1486);
        splitCamBool();
    }

    public void splitCamRightPane(ActionEvent event) {
        btnSplitArh.setRotate(btnSplitArh.getRotate() + 180);

        if (anchorPaneProsmotr.getWidth() == 1920) {
            if (camRightPane.isVisible() == true) {
                camRightPane.setVisible(false);
                btnSplitRightPane.setLayoutX(1897.5);
                //prosmotrGP4.setPadding(new Insets(-20, 140, 0, 220));
                prosmotrGP4.setLayoutX(220);
                prosmotrGP9.setLayoutX(220);
                prosmotrGP1.setPadding(new Insets(-20, 140, 0, 220));
            } else {
                camRightPane.setVisible(true);
                btnSplitRightPane.setLayoutX(1739);
              //  prosmotrGP4.setPadding(new Insets(-20, 200, 0, 0));
                prosmotrGP4.setLayoutX(20);
                prosmotrGP9.setLayoutX(20);
                prosmotrGP1.setPadding(new Insets(-20, 200, 0, 0));
            }
        } else {
            if (camRightPane.isVisible() == true) {
                camRightPane.setVisible(false);
                btnSplitRightPane.setLayoutX(1417.5);
               // prosmotrGP4.setPadding(new Insets(0, 90, 0, 90));
                prosmotrGP4.setLayoutX(90);
                prosmotrGP9.setLayoutX(90);
                prosmotrGP1.setPadding(new Insets(0, 90, 0, 90));
            } else {
                camRightPane.setVisible(true);
                btnSplitRightPane.setLayoutX(1262);
               // prosmotrGP4.setPadding(new Insets(0, 200, 0, 0));
                prosmotrGP4.setLayoutX(20);
                prosmotrGP9.setLayoutX(20);
                prosmotrGP1.setPadding(new Insets(0, 200, 0, 0));
            }
        }
    }

    public void splitCamBool() {
        if (anchorPaneProsmotr.getWidth() < 1920) {
            if (camRightPane.isVisible() == false) {
                btnSplitRightPane.setLayoutX(1897.5);
                imgV1.setFitWidth(1885);
               // prosmotrGP4.setPadding(new Insets(-20, 140, 0, 220));
                prosmotrGP4.setLayoutX(220);
                prosmotrGP9.setLayoutX(220);
                prosmotrGP1.setPadding(new Insets(-20, 140, 0, 220));
            } else {
                btnSplitRightPane.setLayoutX(1739);
                imgV1.setFitWidth(1710);
               // prosmotrGP4.setPadding(new Insets(-20, 200, 0, 0));
                prosmotrGP4.setLayoutX(20);
                prosmotrGP9.setLayoutX(20);
                prosmotrGP1.setPadding(new Insets(-20, 200, 0, 0));
            }
        } else {
            if (camRightPane.isVisible() == false) {
                btnSplitRightPane.setLayoutX(1417.5);
                imgV1.setFitWidth(1405);
               // prosmotrGP4.setPadding(new Insets(0, 90, 0, 90));
                prosmotrGP4.setLayoutX(90);
                prosmotrGP9.setLayoutX(90);
                prosmotrGP1.setPadding(new Insets(0, 90, 0, 90));
            } else {
                btnSplitRightPane.setLayoutX(1262);
                imgV1.setFitWidth(1230);
                //prosmotrGP4.setPadding(new Insets(0, 200, 0, 0));
                prosmotrGP4.setLayoutX(20);
                prosmotrGP9.setLayoutX(20);
                prosmotrGP1.setPadding(new Insets(0, 200, 0, 0));
            }
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
        anchorPaneTrev.setVisible(false);
        anchorPanePolz.setVisible(false);
        anchorPaneProg.setVisible(false);
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

    @FXML
    void clickedForOneCam(ActionEvent event) {
        prosmotrGP1.setVisible(true);
        prosmotrGP4.setVisible(false);
        prosmotrGP9.setVisible(false);
    }

    @FXML
    void clickedForFourCam(ActionEvent event) {
        prosmotrGP9.setVisible(false);
        prosmotrGP4.setVisible(true);
        prosmotrGP1.setVisible(false);
    }

    @FXML
    void clickedForNineCam(ActionEvent event) {
        prosmotrGP9.setVisible(true);
        prosmotrGP4.setVisible(false);
        prosmotrGP1.setVisible(false);
    }

    /*==================================== Тур ==========================================*/
    /*public void prosmotrMinimize(){

    }
    public void prosmotrMaximize(){

    }*/
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
        //anchorPaneTur.setVisible(true);
        System.out.println("tur ne rabotaet");
        hboxDeleteLast(anchorPaneTur);
    }

    public void TurCloseOn(MouseEvent event) {
        TurClose.setVisible(true);
    }

    public void TurCloseOff(MouseEvent event) {
        TurClose.setVisible(false);
    }

    /*==================================== Архив ==========================================*/
    public void arhMinimize() {
        arhCamPane.setLayoutX(500);
        anchorPaneArh.setPadding(new Insets(0, 0, 0, 0));
        arhGP.setPrefWidth(1200);
        arhGP.setPrefHeight(674);
        arhSlider.setPadding(new Insets(0, 220, 0, 0));
        splitArhBool();
        imArh1.setFitHeight(350);
        imArh1.setFitWidth(600);
        imArh2.setFitHeight(600);
        imArh2.setFitWidth(600);
        imArh3.setFitHeight(350);
        imArh3.setFitWidth(600);
        imArh4.setFitHeight(350);
        imArh4.setFitWidth(600);
        arhToggle();
    }

    public void arhMaximize() {
        arhCamPane.setLayoutX(610);
        anchorPaneArh.setPadding(new Insets(0, 0, 20, 0));
        arhGP.setPrefWidth(1486);
        arhGP.setPrefHeight(836);
        arhSlider.setPadding(new Insets(0, 300, 0, 0));
        splitArhBool();
        imArh1.setFitHeight(418);
        imArh1.setFitWidth(1000);
        imArh2.setFitHeight(418);
        imArh2.setFitWidth(1000);
        imArh3.setFitHeight(418);
        imArh3.setFitWidth(1000);
        imArh4.setFitHeight(418);
        imArh4.setFitWidth(1000);
        arhToggle();
    }

    @FXML
    void getDateFromDatePicker(ActionEvent event) {
        LocalDateTime time = datePickerBeginning.getValue().atTime(0, 0, 0);
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
        anchorPaneTrev.setVisible(false);
        anchorPanePolz.setVisible(false);
        anchorPaneProg.setVisible(false);
        hboxDeleteLast(anchorPaneArh);
    }

    public void ArhCloseOn(MouseEvent event) {
        ArhClose.setVisible(true);
    }

    public void ArhCloseOff(MouseEvent event) {
        ArhClose.setVisible(false);
    }


    public void arhToggle() {
        //PC ACTION
        if (checkBoxForArhAll.isVisible() == false) {
            if (arhGP.getPrefWidth() == 1200) {
                rightPaneForArh.setPrefHeight(620);
                arhCamPane.setLayoutX(360);
            }
            if (arhGP.getPrefWidth() == 1486) {
                rightPaneForArh.setPrefHeight(770);
                arhCamPane.setLayoutX(600);
            }
        } // ust ACTION
        if (checkBoxForArhAll.isVisible() == true) {
            if (arhGP.getPrefWidth() == 1200) {
                rightPaneForArh.setPrefHeight(570);
                arhCamPane.setLayoutX(500);
            }
            if (arhGP.getPrefWidth() == 1486) {
                rightPaneForArh.setPrefHeight(730);
                arhCamPane.setLayoutX(750);
            }
        }
    }

    @FXML
    void toggleForArhPCAction(ActionEvent event) {
        if (event.getSource() == toggleForArhPC) {
            checkBoxForArhAll.setVisible(false);
            checkBoxForArhConnect.setVisible(false);
            choiceBoxForChooseFiles.setLayoutX(20);
            radioForArhDop.setVisible(false);
            radioForArhMain.setVisible(false);
            radioForArhPhoto.setVisible(false);
            radioForArhVideo.setVisible(false);
            buttonForArhDownload.setVisible(false);
            // ArhToggle();
        }
    }

    @FXML
    void toggleForArhUstrAction(ActionEvent event) {
        if (event.getSource() == toggleForArhUstr) {
            checkBoxForArhAll.setVisible(true);
            checkBoxForArhConnect.setVisible(true);
            choiceBoxForChooseFiles.setLayoutX(320);
            radioForArhDop.setVisible(true);
            radioForArhMain.setVisible(true);
            radioForArhPhoto.setVisible(true);
            radioForArhVideo.setVisible(true);
            buttonForArhDownload.setVisible(true);
            //ArhToggle();
        }
    }

    public void splitArh(ActionEvent event) {
        btnSplitArh.setRotate(btnSplitArh.getRotate() + 180);
        if (anchorPaneProsmotr.getWidth() == 1920) {
            if (arhRightPane2.isVisible() == true) {
                arhRightPane2.setVisible(false);
                btnSplitArh.setLayoutX(1897.5);
                arhGP.setLayoutX(220);
                arhSlider.setPadding(new Insets(0, 210, 0, 195));
            } else {
                arhRightPane2.setVisible(true);
                btnSplitArh.setLayoutX(1710);
                arhGP.setLayoutX(20);
                arhSlider.setPadding(new Insets(0, 410, 0, 0));
            }
        } else {
            if (arhRightPane2.isVisible() == true) {
                arhRightPane2.setVisible(false);
                btnSplitArh.setLayoutX(1417.5);
                arhGP.setLayoutX(90);
                arhSlider.setPadding(new Insets(0, 150, 0, 65));
            } else {
                arhRightPane2.setVisible(true);
                btnSplitArh.setLayoutX(1230);
                arhGP.setLayoutX(20);
                arhSlider.setPadding(new Insets(0, 220, 0, 0));
            }
        }
    }

    public void splitArhBool() {
        if (anchorPaneProsmotr.getWidth() < 1920) {
            if (arhRightPane2.isVisible() == false) {
                btnSplitArh.setLayoutX(1897.5);
                arhGP.setLayoutX(220);
                arhSlider.setPadding(new Insets(0, 210, 0, 195));
            } else {
                btnSplitArh.setLayoutX(1710);
                arhGP.setLayoutX(20);
                arhSlider.setPadding(new Insets(0, 410, 0, 0));
            }
        } else {
            if (arhRightPane2.isVisible() == false) {
                btnSplitArh.setLayoutX(1417.5);
                arhGP.setLayoutX(90);
                arhSlider.setPadding(new Insets(0, 150, 0, 65));
            } else {
                btnSplitArh.setLayoutX(1230);
                arhGP.setLayoutX(20);
                arhSlider.setPadding(new Insets(0, 220, 0, 0));
            }
        }
    }

    /*====================================  Онлайн запись ==========================================*/
    public void zapMinimize() {
        zapBtnPane.setLayoutX(600);
        anchorPaneZap.setPadding(new Insets(0, 0, 0, 0));
        zapAnch1.setPrefHeight(250);
    }

    public void zapMaximize() {
        anchorPaneZap.setPadding(new Insets(0, 0, 30, 0));
        zapBtnPane.setLayoutX(840);
        zapAnch1.setPrefHeight(400);
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
        anchorPaneTrev.setVisible(false);
        anchorPanePolz.setVisible(false);
        anchorPaneProg.setVisible(false);
        hboxDeleteLast(anchorPaneZap);
    }

    public void ZapCloseOn(MouseEvent event) {
        ZapClose.setVisible(true);
    }

    public void ZapCloseOff(MouseEvent event) {
        ZapClose.setVisible(false);
    }

    /************************************** Настройки ******************************************************************
     /*==================================== Настройка тревог ==========================================*///TODO
    /*====================================  trevoga event ==========================================*/
    @FXML
    void trevogaSetVisible(KeyEvent event) { // Чтобы это работало необходимо сначала нажать на значок "на гланвую" и потом англ P
        if (event.getCode() == KeyCode.P) {
            File file = new File(".\\src\\main\\resources\\p\\parking\\sound\\outAlarm.wav");
            String selectedFile = file.toURI().toString();
            Media media = new Media(selectedFile);
            MediaPlayer mediaPlayerTrev = new MediaPlayer(media);
            mediaPlayerTrev.play();
            trevogaPane.setVisible(true);
        }
    }

    public void prosmotrIfTrev() {
        trevogaPane.setVisible(false);
        prosmotrBtnUpper();
        anchorPaneProsmotr.setVisible(true);
        anchorPaneUst.setVisible(false);
        anchorPaneArh.setVisible(false);
        anchorPaneZap.setVisible(false);
        anchorPaneJur.setVisible(false);
        anchorPaneJurTrev.setVisible(false);
        anchorPaneTrev.setVisible(false);
        anchorPanePolz.setVisible(false);
        anchorPaneProg.setVisible(false);
        hboxDeleteLast(anchorPaneProsmotr);
    }

    //==================== ================================================
    public void trevMinimize() {
        anchorPaneTrev.setPadding(new Insets(0, 0, 0, 0));
        trevPrimBtn.setLayoutX(625);
    }

    public void trevMaximize() {
        anchorPaneTrev.setPadding(new Insets(0, 0, 35, 0));
        trevPrimBtn.setLayoutX(825);
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
        anchorPaneJur.setVisible(false);
        anchorPaneProsmotr.setVisible(false);
        anchorPaneUst.setVisible(false);
        anchorPaneArh.setVisible(false);
        anchorPaneZap.setVisible(false);
        anchorPaneJurTrev.setVisible(false);
        anchorPanePolz.setVisible(false);
        anchorPaneProg.setVisible(false);
        hboxDeleteLast(anchorPaneTrev);
    }

    public void TrevCloseOn(MouseEvent event) {
        TrevClose.setVisible(true);
    }

    public void TrevCloseOff(MouseEvent event) {
        TrevClose.setVisible(false);
    }

    private MediaPlayer mediaPlayer;

    @FXML
    void chooseMusic1(MouseEvent event) {
        File file = new File(".\\src\\main\\resources\\p\\parking\\sound\\motion.wav");
        String selectedFile = file.toURI().toString();
        Media media = new Media(selectedFile);
        mediaPlayer = new MediaPlayer(media);
    }

    @FXML
    void playSoundTrev1(MouseEvent event) {
        mediaPlayer.play();
    }

    @FXML
    void chooseMusic2(MouseEvent event) {
        File file = new File(".\\src\\main\\resources\\p\\parking\\sound\\cover.wav");
        String selectedFile = file.toURI().toString();
        Media media = new Media(selectedFile);
        mediaPlayer = new MediaPlayer(media);
    }

    @FXML
    void playSoundTrev2(MouseEvent event) {
        mediaPlayer.play();
    }

    @FXML
    void chooseMusic3(MouseEvent event) {
        File file = new File(".\\src\\main\\resources\\p\\parking\\sound\\outAlarm.wav");
        String selectedFile = file.toURI().toString();
        Media media = new Media(selectedFile);
        mediaPlayer = new MediaPlayer(media);
    }

    @FXML
    void playSoundTrev3(MouseEvent event) {
        mediaPlayer.play();
    }

    @FXML
    void chooseMusic4(MouseEvent event) {
        File file = new File(".\\src\\main\\resources\\p\\parking\\sound\\lost.wav");
        String selectedFile = file.toURI().toString();
        Media media = new Media(selectedFile);
        mediaPlayer = new MediaPlayer(media);
    }

    @FXML
    void playSoundTrev4(MouseEvent event) {
        mediaPlayer.play();
    }

    @FXML
    void chooseMusic5(MouseEvent event) {
        File file = new File(".\\src\\main\\resources\\p\\parking\\sound\\analyze.wav");
        String selectedFile = file.toURI().toString();
        Media media = new Media(selectedFile);
        mediaPlayer = new MediaPlayer(media);
    }

    @FXML
    void playSoundTrev5(MouseEvent event) {
        mediaPlayer.play();
    }

    @FXML
    void chooseMusic6(MouseEvent event) {
        File file = new File(".\\src\\main\\resources\\p\\parking\\sound\\humanDetect.wav");
        String selectedFile = file.toURI().toString();
        Media media = new Media(selectedFile);
        mediaPlayer = new MediaPlayer(media);
    }

    @FXML
    void playSoundTrev6(MouseEvent event) {
        mediaPlayer.play();
    }

    @FXML
    void chooseMusic7(MouseEvent event) {
        File file = new File(".\\src\\main\\resources\\p\\parking\\sound\\facedetect.wav");
        String selectedFile = file.toURI().toString();
        Media media = new Media(selectedFile);
        mediaPlayer = new MediaPlayer(media);
    }

    @FXML
    void playSoundTrev7(MouseEvent event) {
        mediaPlayer.play();
    }

    @FXML
    void chooseMusic8(MouseEvent event) {
        File file = new File(".\\src\\main\\resources\\p\\parking\\sound\\diskfull.wav");
        String selectedFile = file.toURI().toString();
        Media media = new Media(selectedFile);
        mediaPlayer = new MediaPlayer(media);
    }

    @FXML
    void playSoundTrev8(MouseEvent event) {
        mediaPlayer.play();
    }

    @FXML
    void chooseMusic9(MouseEvent event) {
        File file = new File(".\\src\\main\\resources\\p\\parking\\sound\\diskerror.wav");
        String selectedFile = file.toURI().toString();
        Media media = new Media(selectedFile);
        mediaPlayer = new MediaPlayer(media);
    }

    @FXML
    void playSoundTrev9(MouseEvent event) {
        mediaPlayer.play();
    }

    @FXML
    void chooseMusic10(MouseEvent event) {
        File file = new File(".\\src\\main\\resources\\p\\parking\\sound\\carshapedetect.wav");
        String selectedFile = file.toURI().toString();
        Media media = new Media(selectedFile);
        mediaPlayer = new MediaPlayer(media);
    }

    @FXML
    void playSoundTrev10(MouseEvent event) {
        mediaPlayer.play();
    }

    /*==================================== Журнал ==========================================*///TODO
    private void initTableJurPC() {
        tableJurPCData.add(new TableJurPC(1, accidentGetTime(), "Admin", typeList.get(randomResultAndType()),
                iPPortList.get(0), "1", noteList.get(randomResultAndType())));
        tableJurPCData.add(new TableJurPC(2, accidentGetTime(), "Security", typeList.get(randomResultAndType()),
                iPPortList.get(1), "2", noteList.get(randomResultAndType())));
        tableJurPCData.add(new TableJurPC(3, accidentGetTime(), "Security", typeList.get(randomResultAndType()),
                iPPortList.get(2), "3", noteList.get(randomResultAndType())));
        System.out.println("tableJUrInit");

    }

    private void initTableJurUstr() {
        tableJursUstrData.add(new TableJurUstr(1, accidentGetTime(), "Security", typeList.get(randomResultAndType()),
                noteList.get(randomResultAndType())));
        tableJursUstrData.add(new TableJurUstr(2, accidentGetTime(), "Security", typeList.get(randomResultAndType()),
                noteList.get(randomResultAndType())));
        tableJursUstrData.add(new TableJurUstr(3, accidentGetTime(), "Admin", typeList.get(randomResultAndType()),
                noteList.get(randomResultAndType())));
    }

    /*==============================================================================*///
    public void jurMinimize() {
        anchorPaneJur.setPadding(new Insets(0, 0, 0, 0));
        jurAn1.setLayoutX(595);
        jurAn11.setLayoutX(640);
        // jurPCPrim.setPrefWidth(300);
        //jurUPrim.setPrefWidth(300);
        noteColumnUstr.setPrefWidth(300);
    }

    public void jurMaximize() {
        anchorPaneJur.setPadding(new Insets(0, 0, 30, 0));
        jurAn1.setLayoutX(835);
        jurAn11.setLayoutX(880);
        //jurPCPrim.setPrefWidth(900);
        //jurUPrim.setPrefWidth(900);
        noteColumnUstr.setPrefWidth(900);
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
        anchorPaneTrev.setVisible(false);
        anchorPanePolz.setVisible(false);
        anchorPaneProg.setVisible(false);
        hboxDeleteLast(anchorPaneJur);
    }

    public void JurCloseOn(MouseEvent event) {
        JurClose.setVisible(true);
    }

    public void JurCloseOff(MouseEvent event) {
        JurClose.setVisible(false);
    }

    @FXML
    void toggleForJurPCAction(ActionEvent event) {
        if (event.getSource() == toggleForJurPC) {
            NameOfEquipment.setVisible(false);
            choiceBoxForJurEq.setVisible(false);
            tableViewForJurPC.setVisible(true);
            tableViewForJurUstr.setVisible(false);
        }
    }

    @FXML
    void toggleForJurUstrAction(ActionEvent event) {
        if (event.getSource() == toggleForJurUstr) {
            NameOfEquipment.setVisible(true);
            choiceBoxForJurEq.setVisible(true);
            tableViewForJurUstr.setVisible(true);
            tableViewForJurPC.setVisible(false);
        }
    }


    /*==================================== Журнал тревог ==========================================*/
    /*==================================== Accidents  ==========================================*///TODO
    Random random = new Random();

    private void initTableJurTrev() {
        accidentsData.add(new Accident(accidentGetNum(), deviceStatusList.get(randomStatus()), typeList.get(randomResultAndType()),
                accidentGetTime(), iPPortList.get(0), resultList.get(randomResultAndType())));
        accidentsData.add(new Accident(accidentGetNum(), deviceStatusList.get(randomStatus()), typeList.get(randomResultAndType()),
                accidentGetTime(), iPPortList.get(1), resultList.get(randomResultAndType())));
        accidentsData.add(new Accident(accidentGetNum(), deviceStatusList.get(randomStatus()), typeList.get(randomResultAndType()),
                accidentGetTime(), iPPortList.get(2), resultList.get(randomResultAndType())));
    }

    private String accidentGetTime() {
        int randomHour = random.nextInt(7, 13);
        int randomMin = random.nextInt(30);
        // return new SimpleDateFormat("yyyy/MM/dd HH:mm:ss").format(Calendar.getInstance().getTime());
        return randomHour + ":" + randomMin + ":" + random.nextInt(59) + " 13/05/2024";

    }

    private int accidentGetNum() {
        return accidentsData.size() + 1;
    }

    /************************************************************************/
    public void JurTrevBtnUpper() {
        if (hBox.getChildren().contains(JurTrevSmallPane)) {
        } else {
            hBox.getChildren().addFirst(JurTrevSmallPane);
            JurTrevBtnUp.setVisible(true);
        }
    }

    public void JurTrevMinimize() {
        anchorPaneJurTrev.setPadding(new Insets(0, 0, 0, 0));
        jurTrevStat.setPrefWidth(260);
        jurTrevType.setPrefWidth(260);
        jurTrevTime.setPrefWidth(260);
        jurTrevUst.setPrefWidth(260);
        jurTrevRes.setPrefWidth(260);
        trevPrimBtn.setLayoutX(625);
        trevogaPane.setLayoutX(519);//sum = 1300?
    }

    public void JurTrevMaximize() {
        anchorPaneJurTrev.setPadding(new Insets(0, 0, 30, 0));
        jurTrevStat.setPrefWidth(380);
        jurTrevType.setPrefWidth(380);
        jurTrevTime.setPrefWidth(380);
        jurTrevUst.setPrefWidth(380);
        jurTrevRes.setPrefWidth(420);
        trevPrimBtn.setLayoutX(885);
        trevogaPane.setLayoutX(760);
        //sum = 1940?
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
        anchorPaneProg.setVisible(false);
        anchorPanePolz.setVisible(false);
        anchorPaneTrev.setVisible(false);
        hboxDeleteLast(anchorPaneJurTrev);
    }

    public void JurTrevCloseOn(MouseEvent event) {
        JurTrevClose.setVisible(true);
    }

    public void JurTrevCloseOff(MouseEvent event) {
        JurTrevClose.setVisible(false);
    }

    public void schlagOff(ActionEvent event) {
        imgV1.setImage(new Image(getClass().getResourceAsStream("photo/schlagOff.jpg")));
    }

    public void schlagOn(ActionEvent event) {
        imgV1.setImage(new Image(getClass().getResourceAsStream("photo/schlagOn.jpg")));
    }

    /************************************** Остальное ******************************************************************/
    //==================== Устройства================================================
    //==================== DeviceUp================================================
    List<String> nameList = List.of("Камера 1", "Камера 2 ", "Камера 3");
    List<String> cloudIDList = List.of("1", "2", "3");
    List<String> iPPortList = List.of("127.00.01.01", "127.00.01.02", "127.00.01.03");
    List<String> protocolList = List.of("TCP/IP");
    List<String> groupList = List.of("Камеры парковки");
    List<String> versionList = List.of("1.0");
    List<String> deviceStatusList = List.of("Все", "Трев. вход", "Движение", "Постоянно", "Ручная", "I-кадр видео", "Видео анализ");
    List<String> securityList = List.of("Все", "Трев. вход", "Движение", "Постоянно", "Ручная", "I-кадр видео", "Видео анализ");
    List<String> recordingList = List.of("Запись идёт", "Нет записи");
    List<String> connectionList = List.of("Подключено", "Нет подключения");
    List<String> operationList = List.of("Все", "Трев. вход", "Движение", "Постоянно", "Ручная", "I-кадр видео", "Видео анализ");
    List<String> resultList = List.of("Решено без участия полиции", "Решено при участии полиции", "Решено при участии полиции и врачей");
    List<String> typeList = List.of("Авария", "Угон", "Несчастный случай");
    List<String> noteList = List.of("Решено", "Не решено", "В процессе");

    public int randomResultAndType() {
        return random.nextInt(3);
    }

    public int randomStatus() {
        return random.nextInt(6);
    }

    private void initDeviceUp() {
        deviceUpData.add(new DeviceUpTable(nameList.get(0), cloudIDList.get(0), iPPortList.get(0),
                protocolList.get(0), groupList.get(0)));
        deviceUpData.add(new DeviceUpTable(nameList.get(1), cloudIDList.get(1), iPPortList.get(1),
                protocolList.get(0), groupList.get(0)));
        deviceUpData.add(new DeviceUpTable(nameList.get(2), cloudIDList.get(2), iPPortList.get(2),
                protocolList.get(0), groupList.get(0)));
    }

    //==================== DeviceDown================================================
    private void initDeviceDown() {
        deviceDownData.add(new DeviceDownTable(nameList.get(0), cloudIDList.get(0), iPPortList.get(0), versionList.get(0),
                groupList.get(0), deviceStatusList.get(0), securityList.get(0), recordingList.get(0),
                connectionList.get(0), operationList.get(0)));
        deviceDownData.add(new DeviceDownTable(nameList.get(1), cloudIDList.get(1), iPPortList.get(1), versionList.get(0),
                groupList.get(0), deviceStatusList.get(4), securityList.get(2), recordingList.get(0),
                connectionList.get(0), operationList.get(1)));
        deviceDownData.add(new DeviceDownTable(nameList.get(2), cloudIDList.get(2), iPPortList.get(2), versionList.get(0),
                groupList.get(0), deviceStatusList.get(6), securityList.get(3), recordingList.get(0),
                connectionList.get(0), operationList.get(5)));

    }
    //==========================================================================================

    public void ustMinimize() {
        anchorPaneUst.setPadding(new Insets(0, 0, 0, 0));
        ustAnch1.setPrefHeight(405);
        ustAnch2.setLayoutY(405);
        ustAnch2.setPrefHeight(405);
    }

    public void ustMaximize() {
        anchorPaneUst.setPadding(new Insets(0, 0, 30, 0));
        ustAnch1.setPrefHeight(480);
        ustAnch2.setLayoutY(502);
        ustAnch2.setPrefHeight(502);
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
        anchorPaneTrev.setVisible(false);
        anchorPanePolz.setVisible(false);
        anchorPaneProg.setVisible(false);
        hboxDeleteLast(anchorPaneUst);
    }

    public void UstCloseOn(MouseEvent event) {
        UstClose.setVisible(true);
    }

    public void UstCloseOff(MouseEvent event) {
        UstClose.setVisible(false);
    }

    //==================== Программа ================================================
    public void progMinimize() {
        btnResetProg.setLayoutX(720);
        trevPrimBtn1.setLayoutX(530);
        System.out.println("progMinimize");
        anchorPaneProg.setPadding(new Insets(0, 0, 0, 0));

    }

    public void progMaximize() {
        System.out.println("progMaximize");
        btnResetProg.setLayoutX(920);
        trevPrimBtn1.setLayoutX(730);
        anchorPaneProg.setPadding(new Insets(0, 0, 35, 0));
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
        anchorPaneUst.setVisible(false);
        anchorPaneProsmotr.setVisible(false);
        anchorPaneArh.setVisible(false);
        anchorPaneZap.setVisible(false);
        anchorPaneJur.setVisible(false);
        anchorPaneJurTrev.setVisible(false);
        anchorPaneTrev.setVisible(false);
        anchorPanePolz.setVisible(false);
        hboxDeleteLast(anchorPaneProg);
    }

    public void ProgCloseOn(MouseEvent event) {
        ProgClose.setVisible(true);
    }

    public void ProgCloseOff(MouseEvent event) {
        ProgClose.setVisible(false);
    }

    @FXML
    void resetAll(MouseEvent event) {
        choiceBoxForProg1.setValue("30 дней");
        choiceBoxForProg2.setValue("30000");
        choiceBoxForProg3.setValue("4");
        choiceBoxForProg4.setValue("AVI/H265");
        choiceBoxForProg5.setValue("H264/H265");
        choiceBoxForProg6.setValue("JPG");
        choiceBoxForProg7.setValue("По умолчанию");
        checkBoxForProg1.setSelected(false);
        checkBoxForProg2.setSelected(false);
        checkBoxForProg3.setSelected(false);
        checkBoxForProg4.setSelected(false);
        checkBoxForProg5.setSelected(false);
        checkBoxForProg6.setSelected(false);
        checkBoxForProg7.setSelected(false);
        checkBoxForProg8.setSelected(false);
        checkBoxForProg9.setSelected(false);
        checkBoxForProg10.setSelected(false);
    }

    FileChooser fileChooserForProg = new FileChooser();

    @FXML
    void lookForProg(MouseEvent event) {
        File file = fileChooserForProg.showOpenDialog(new Stage());
    }

    //==================== Пользователи ================================================
    public void polzMinimize() {
        polzUtilAP.setLayoutX(55);
        polzUtilAP.setLayoutY(204);

    }

    public void polzMaximize() {
        polzUtilAP.setLayoutX(200);
        polzUtilAP.setLayoutY(300);
    }

    @FXML
    void addNewPolz(MouseEvent event) {
        if (!newPolz1.isVisible()) {
            newPolz1.setVisible(true);
            btnNewPolz.setLayoutX(1060);
        } else if (newPolz2.isVisible() && !newPolz1.isVisible()) {
            newPolz1.setVisible(true);
            newPolz1.setLayoutX(1080);
            btnNewPolz.setVisible(false);
        } else {
            newPolz2.setVisible(true);
            btnNewPolz.setVisible(false);
        }
    }

    @FXML
    void closeNewPolz1(MouseEvent event) {
        if (newPolz1.isVisible() && !newPolz2.isVisible()) {
            newPolz1.setVisible(false);
            btnNewPolz.setLayoutX(720);
        } else if (newPolz1.isVisible() && newPolz2.isVisible()) {
            newPolz1.setVisible(false);
            newPolz2.setLayoutX(740);
            btnNewPolz.setVisible(true);
            btnNewPolz.setLayoutX(1060);
        }
    }

    @FXML
    void closeNewPolz2(MouseEvent event) {
        if (newPolz1.isVisible() && newPolz2.isVisible()) {
            newPolz2.setVisible(false);
            btnNewPolz.setVisible(true);
            btnNewPolz.setLayoutX(1060);
        } else if (!newPolz1.isVisible() && newPolz2.isVisible()) {
            newPolz2.setVisible(false);
            btnNewPolz.setVisible(true);
            btnNewPolz.setLayoutX(720);
        }
    }

    @FXML
    void adminClearField() {
        adminPodtvField.clear();
        adminLogField.clear();
        adminPassField.clear();
    }

    @FXML
    void secClearField() {
        secPodtvField.clear();
        secLogField.clear();
        secPassField.clear();
    }

    @FXML
    void new1ClearField() {
        adminPodtvField.clear();
        adminLogField.clear();
        adminPassField.clear();
    }

    @FXML
    void new2ClearField() {
        adminPodtvField.clear();
        adminLogField.clear();
        adminPassField.clear();
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
        anchorPaneJur.setVisible(false);
        anchorPaneProsmotr.setVisible(false);
        anchorPaneUst.setVisible(false);
        anchorPaneArh.setVisible(false);
        anchorPaneZap.setVisible(false);
        anchorPaneJurTrev.setVisible(false);
        anchorPaneTrev.setVisible(false);
        anchorPaneProg.setVisible(false);
        hboxDeleteLast(anchorPanePolz);
    }

    public void PolzCloseOn(MouseEvent event) {
        PolzClose.setVisible(true);
    }

    public void PolzCloseOff(MouseEvent event) {
        PolzClose.setVisible(false);
    }

}




