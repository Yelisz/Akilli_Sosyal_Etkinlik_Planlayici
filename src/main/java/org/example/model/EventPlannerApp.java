package org.example.model;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class EventPlannerApp extends Application {

    @Override
    public void start(Stage primaryStage) {
        Harita harita = new Harita();
        harita.haritayiYukle();

        StackPane root = new StackPane();
        root.getChildren().add(harita.getWebView());

        primaryStage.setTitle("Akıllı Etkinlik Planlayıcısı - Harita");
        primaryStage.setScene(new Scene(root, 800, 600));
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
