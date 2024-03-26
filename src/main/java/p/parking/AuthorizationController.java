package p.parking;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

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
            hl.changeScene("HomeScene.fxml");
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

