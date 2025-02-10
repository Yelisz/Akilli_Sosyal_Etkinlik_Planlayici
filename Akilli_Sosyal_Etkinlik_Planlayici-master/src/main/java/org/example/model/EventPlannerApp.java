package org.example.model;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

import java.io.IOException;

public class EventPlannerApp extends Application {

    @Override
    public void start(Stage primaryStage) throws IOException {
        Harita harita = new Harita();
        harita.yukle("İstanbul");

        StackPane root = new StackPane();//bilesenleri ust uste bindirir
        root.getChildren().add(harita.getWebView());//ana konteyner

        primaryStage.setTitle("Akıllı Etkinlik Planlayıcısı - Harita");
        primaryStage.setScene(new Scene(root, 800, 600));
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);//javafx in ana cagirisi
    }
}
