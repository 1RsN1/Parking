package p.parking;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.image.ImageView;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

import java.io.File;
import java.io.FileOutputStream;
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
    private PasswordField passwordField;

    @FXML
    private TextField userName;

    @FXML
    private Label wrongLogIn;
    @FXML
    void userLogIn() throws IOException {
        File myFile = new File("parol.txt");
        myFile.createNewFile();
        checkLogin();
    }

    private void checkLogin() throws IOException {
        HelloApplication hl = new HelloApplication();
        if(userName.getText().equals("admin") && passwordField.getText().equals("admin")) {
            FileOutputStream outputStream = new FileOutputStream("parol.txt");
            byte[] buffer = "true".getBytes();
            outputStream.write(buffer);
            outputStream.close();
            hl.changeSceneForAdmin();
        } else if(userName.getText().isEmpty() && passwordField.getText().isEmpty()) {
            wrongLogIn.setText("Введите ваши данные");
        } else {
            wrongLogIn.setText("Неправильное имя или пароль");
        }
        if(userName.getText().equals("security") && passwordField.getText().equals("security")) {
            FileOutputStream outputStream = new FileOutputStream("parol.txt");
            byte[] buffer = "false".getBytes();
            outputStream.write(buffer);
            outputStream.close();
            hl.changeSceneForSecurity();

        } else if(userName.getText().isEmpty() && passwordField.getText().isEmpty()) {
            wrongLogIn.setText("Введите ваши данные");
        } else {
            wrongLogIn.setText("Неправильное имя или пароль");
        }
    }

    @FXML
    void EnterLogIn(KeyEvent event) throws IOException {
        if(event.getCode() == KeyCode.ENTER) userLogIn();
    }

    @FXML
    void initialize() {
        ivProsmotr0.setImage(new javafx.scene.image.Image(Objects.requireNonNull(getClass().getResourceAsStream("icon/VSTU-logo.png"))));
    }

    public void logout() {
        Alert alert = new Alert(Alert.AlertType.CONFIRMATION);
        alert.setTitle("Выход");
        alert.setHeaderText("Вы точно хотите выйти?");
        if (alert.showAndWait().get() == ButtonType.OK) {
            stage = (Stage) scenePanel.getScene().getWindow();
            stage.close();
        }
    }
}

