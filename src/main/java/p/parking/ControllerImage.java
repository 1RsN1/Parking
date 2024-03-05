package p.parking;

import java.net.URL;
import java.util.Objects;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonType;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import static java.util.Objects.requireNonNull;

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
    private AnchorPane anchorPane1;




    @FXML
    void getFour(MouseEvent event) {
            paneFour.setVisible(true);
            paneOne.setVisible(false);
        System.out.println("getFour");
    }

    @FXML
    void getOne(MouseEvent event) {
        System.out.println("getOne");
            paneOne.setVisible(true);
            paneFour.setVisible(false);
    }

    @FXML
    void initialize() {
        System.out.println("Initializing ControllerImage");
    }

}
