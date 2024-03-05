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
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class HomeSceneController {

    @FXML
    Stage stage;
    @FXML
    private ImageView imgV1, imgV41, imgV42, imgV43,imgV44, ivProsmotr, ivProsmotr0, ivUstr, ivArh, ivJur, ivZap, ivTrev;
    @FXML
    private AnchorPane anchorPane1;
    @FXML
    private AnchorPane scenePanel;
    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;


    public void initialize() {
        ControllerImage controllerImage = new ControllerImage();
        controllerImage.initialize();
        ivProsmotr0.setImage(new javafx.scene.image.Image(getClass().getResourceAsStream("icon/главная.png")));
        ivProsmotr.setImage(new javafx.scene.image.Image(getClass().getResourceAsStream("icon/просмотр камеры.png")));
        ivUstr.setImage(new javafx.scene.image.Image(getClass().getResourceAsStream("icon/устройства.png")));
        ivArh.setImage(new javafx.scene.image.Image(getClass().getResourceAsStream("icon/архив.png")));
        ivJur.setImage(new javafx.scene.image.Image(getClass().getResourceAsStream("icon/журнал.png")));
        ivZap.setImage(new javafx.scene.image.Image(getClass().getResourceAsStream("icon/онлайн запись.png")));
        ivTrev.setImage(new javafx.scene.image.Image(getClass().getResourceAsStream("icon/тревога.png")));
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





