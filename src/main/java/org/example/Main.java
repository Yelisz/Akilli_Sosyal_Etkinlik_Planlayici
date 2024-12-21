package org.example;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import javafx.scene.Node;
import org.example.model.Harita;

import java.io.IOException;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws IOException {
        // MenuBar oluştur
        MenuBar menuBar = new MenuBar();

        Menu menuGiris = new Menu("Giriş");
        Menu menuKullanici = new Menu("Kullanıcı Oluştur");
        Menu menuEtkinlik = new Menu("Etkinlik Yönetimi");
        Menu menuDavet = new Menu("Davet Gönder");

        menuBar.getMenus().addAll(menuGiris, menuKullanici, menuEtkinlik, menuDavet);

        // FXML dosyasını yükle
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("/Main.View.fxml"));
        Scene fxmlScene = new Scene(fxmlLoader.load());

        // Menü çubuğunu ve diğer bileşenleri root'a ekle
        VBox root = new VBox(); // Root düzenleyiciyi değiştir
        root.getChildren().addAll(menuBar, fxmlScene.getRoot());

        // Harita bileşeni oluştur ve ekle
        Harita harita = new Harita();
        harita.haritayiYukle(); // Haritayı yükle
        Node haritaBileseni = harita.getWebView(); // Harita bileşenini al

        // Haritayı root'a ekle
        root.getChildren().add(haritaBileseni);

        // Sahne oluştur
        Scene scene = new Scene(root, 800, 600);
        primaryStage.setTitle("Etkinlik Yönetimi");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}
