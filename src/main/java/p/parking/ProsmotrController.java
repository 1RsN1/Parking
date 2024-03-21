package p.parking;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;

public class ProsmotrController {
    @FXML
    private ImageView imgV1;

    public void initialize() {
        System.out.println("init prosmotr");
        imgV1.setImage(new javafx.scene.image.Image(getClass().getResourceAsStream("photo/1.jpg")));

    }

    public void clickedForOneCam(MouseEvent event) {
        System.out.println("One cam INIT");
    }

    public void clickedForFourCam(MouseEvent event) {
    }

    public void clickedForSevenCam(MouseEvent event) {
    }

    public void clickedForNineCam(MouseEvent event) {
    }

    public void splitCamRightPane(ActionEvent event) {
    }
}
