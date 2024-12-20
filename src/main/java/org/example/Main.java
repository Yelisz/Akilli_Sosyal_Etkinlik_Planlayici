package org.example;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws IOException {
        System.out.println(getClass().getResource("/Main.View.fxml"));
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("/Main.View.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        primaryStage.setTitle("Etkinlik Yönetimi");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        System.out.println(Main.class.getResource("/Main.View.fxml"));
        launch();
    }
}
