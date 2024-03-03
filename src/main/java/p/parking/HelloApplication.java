package kur.project0;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.ButtonType;
import javafx.stage.Modality;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

import java.io.IOException;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws Exception {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("sashaRA.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 1440, 900);
        stage.initStyle(StageStyle.UNDECORATED);
        stage.setResizable(false);
        stage.setTitle("Project");
        stage.setScene(scene);
        stage.show();
    }
    public void logout(Stage stage) {

        Alert alert = new Alert(Alert.AlertType.CONFIRMATION);
        alert.setTitle("Logout");
        alert.setHeaderText("You are about to logout!");
        alert.setContentText("Do you want to save before exiting?: ");

        if (alert.showAndWait().get() == ButtonType.OK) {

            System.out.println("Successfully logged out!");
            stage.close();
        }

    }

    public static void main(String[] args) {
        launch();
    }
}