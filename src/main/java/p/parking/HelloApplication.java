package p.parking;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.ButtonType;
import javafx.scene.image.Image;
import javafx.scene.input.MouseEvent;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

import java.io.IOException;
import java.util.Objects;

public class HelloApplication extends Application {
    Image imgIconier = new Image(Objects.requireNonNull(getClass().getResourceAsStream("icon/VSTU-logo - Copy.png")));

    private static Stage stg;
    @Override
    public void start(Stage stage) throws IOException {
        stg = stage;
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("Authorization.fxml"));
        //HomeSceneMax or HomeScene
        Scene scene = new Scene(fxmlLoader.load(), 600, 300);
        stage.initStyle(StageStyle.TRANSPARENT);
        scene.setFill(Color.TRANSPARENT);
        stage.setResizable(false);
        stage.setTitle("Project");
        stage.getIcons().add(imgIconier);
        stage.setScene(scene);
        stage.show();
    }

    public void changeSceneForAdmin() throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("HomeScene.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 1440, 900);
        Stage stage = new Stage();
        scene.setFill(Color.TRANSPARENT);
        stage.initStyle(StageStyle.TRANSPARENT);
        stage.setResizable(false);
        stage.setTitle("Project");
        stage.getIcons().add(imgIconier);
        stage.setScene(scene);
        stg.close();
        stage.show();
    }public void changeSceneForSecurity() throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("HomeSceneForSecurity.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 1440, 900);
        Stage stage = new Stage();
        scene.setFill(Color.TRANSPARENT);
        stage.initStyle(StageStyle.TRANSPARENT);
        stage.setResizable(false);
        stage.setTitle("Project");
        stage.getIcons().add(imgIconier);
        stage.setScene(scene);
        stg.close();
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}
