package p.parking;

import java.net.URL;
import java.util.Objects;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
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
    Stage stage;
    @FXML
    private ImageView imgV1, imgV41, imgV42, imgV43,imgV44, ivProsmotr, ivProsmotr0, ivUstr, ivArh, ivJur, ivZap, ivJurTrev, ivKonf, ivTrev, ivTur, ivPolz, ivProg, ivMap, ivDec, ivBek, ivProsh, ivFonZap;
    @FXML
    private AnchorPane anchorPane1;
    @FXML
    private AnchorPane scenePanel;
    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button buttonForEightCam;

    @FXML
    private Button buttonForFourCam;

    @FXML
    private Button buttonForNineCam;

    @FXML
    private Button buttonForOneCam;

    @FXML
    private AnchorPane paneWithFourCam;

    @FXML
    private AnchorPane paneWithOneCam;

    public void initialize() {
        ivProsmotr0.setImage(new javafx.scene.image.Image(getClass().getResourceAsStream("icon/главная.png")));
        ivProsmotr.setImage(new javafx.scene.image.Image(getClass().getResourceAsStream("icon/просмотр камеры.png")));
        ivUstr.setImage(new javafx.scene.image.Image(getClass().getResourceAsStream("icon/устройства.png")));
        ivArh.setImage(new javafx.scene.image.Image(getClass().getResourceAsStream("icon/архив.png")));
        ivZap.setImage(new javafx.scene.image.Image(getClass().getResourceAsStream("icon/онлайн запись.png")));
        ivJur.setImage(new javafx.scene.image.Image(getClass().getResourceAsStream("icon/журнал.png")));
        ivJurTrev.setImage(new javafx.scene.image.Image(getClass().getResourceAsStream("icon/тревога.png")));
        ivKonf.setImage(new javafx.scene.image.Image(getClass().getResourceAsStream("icon/конфиг.png")));
        ivTrev.setImage(new javafx.scene.image.Image(getClass().getResourceAsStream("icon/тревога второй вариант.png")));
        ivTur.setImage(new javafx.scene.image.Image(getClass().getResourceAsStream("icon/тур.png")));
        ivPolz.setImage(new javafx.scene.image.Image(getClass().getResourceAsStream("icon/пользователи.png")));
        ivProg.setImage(new javafx.scene.image.Image(getClass().getResourceAsStream("icon/программа.png")));
        ivMap.setImage(new javafx.scene.image.Image(getClass().getResourceAsStream("icon/карта.png")));
        ivDec.setImage(new javafx.scene.image.Image(getClass().getResourceAsStream("icon/декодер.png")));
        ivBek.setImage(new javafx.scene.image.Image(getClass().getResourceAsStream("icon/бэкап.png")));
        ivProsh.setImage(new javafx.scene.image.Image(getClass().getResourceAsStream("icon/прошивка.png")));
        ivFonZap.setImage(new javafx.scene.image.Image(getClass().getResourceAsStream("icon/фоновая запись.png")));
        imgV1.setImage(new javafx.scene.image.Image(getClass().getResourceAsStream("photo/1.jpg")));
        imgV41.setImage(new javafx.scene.image.Image(getClass().getResourceAsStream("photo/1.jpg")));
        imgV42.setImage(new javafx.scene.image.Image(getClass().getResourceAsStream("photo/2.jpg")));
        imgV43.setImage(new javafx.scene.image.Image(getClass().getResourceAsStream("photo/3.jpg")));
        imgV44.setImage(new javafx.scene.image.Image(getClass().getResourceAsStream("photo/4.jpg")));
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
    }

    @FXML
    void clickedForOneCam(MouseEvent event) {
        paneWithOneCam.setVisible(true);
        paneWithFourCam.setVisible(false);
    }

    @FXML
    void clickedForEightCam(MouseEvent event) {

    }

    @FXML
    void clickedForNineCam(MouseEvent event) {

    }

    public void maximizeWindow(ActionEvent event) {
        stage = (Stage) scenePanel.getScene().getWindow();
        if (stage.getWidth() < 1920) {
            stage.setWidth(1920);
            stage.setHeight(1079);
            stage.setX(0);
            stage.setY(0);
        } else {
            stage.setWidth(1440);
            stage.setHeight(900);
            stage.setX(240);

            stage.setY(50);
        }

    }

    public void minimizeWindow(ActionEvent event) {
        stage = (Stage) scenePanel.getScene().getWindow();
        stage.setIconified(true);
    }
}





