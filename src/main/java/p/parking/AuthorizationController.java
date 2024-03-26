package p.parking;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

import java.io.IOException;
import java.util.Objects;

public class AuthorizationController {

    @FXML
    private ImageView ivProsmotr0;

    @FXML
    private AnchorPane scenePanel;
    @FXML
    Stage stage;

    @FXML
    private Button buttonLogIn;

    @FXML
    private PasswordField password;

    @FXML
    private TextField userName;

    @FXML
    private Label wrongLogIn;

    @FXML
    void userLogIn(ActionEvent event) throws IOException {
        checkLogin();
    }

    private void checkLogin() throws IOException {
        HelloApplication hl = new HelloApplication();
        if(userName.getText().equals("admin") && password.getText().equals("admin")) {
            hl.changeSceneForAdmin();
        } else if(userName.getText().isEmpty() && password.getText().isEmpty()) {
            wrongLogIn.setText("Введите ваши данные");
        } else {
            wrongLogIn.setText("Неправильное имя или пароль");
        }
        if(userName.getText().equals("security") && password.getText().equals("security")) {
            hl.changeSceneForSecurity();
        } else if(userName.getText().isEmpty() && password.getText().isEmpty()) {
            wrongLogIn.setText("Введите ваши данные");
        } else {
            wrongLogIn.setText("Неправильное имя или пароль");
        }
    }

    @FXML
    void initialize() {
        ivProsmotr0.setImage(new javafx.scene.image.Image(Objects.requireNonNull(getClass().getResourceAsStream("icon/VSTU-logo.png"))));
    }

    public void logout(ActionEvent event) {
        Alert alert = new Alert(Alert.AlertType.CONFIRMATION);
        alert.setTitle("Выход");
        alert.setHeaderText("Вы точно хотите выйти?");
        if (alert.showAndWait().get() == ButtonType.OK) {
            stage = (Stage) scenePanel.getScene().getWindow();
            stage.close();
        }
    }

}

