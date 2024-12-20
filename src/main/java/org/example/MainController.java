package org.example;

import javafx.beans.property.SimpleStringProperty;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;

import java.time.LocalDate;
import java.time.LocalTime;

import org.example.model.Etkinlik;
import org.example.model.HavaDurumu;

public class MainController {

    @FXML
    private TableView<Etkinlik> etkinlikTablosu;

    @FXML
    private TableColumn<Etkinlik, String> baslikSutun;

    @FXML
    private TableColumn<Etkinlik, String> tarihSutun;

    @FXML
    private TableColumn<Etkinlik, String> saatSutun;

    @FXML
    private TableColumn<Etkinlik, String> konumSutun;

    @FXML
    private Label havaDurumuLabel;

    private ObservableList<Etkinlik> etkinlikListesi;

    @FXML
    private void initialize() {
        baslikSutun.setCellValueFactory(cellData -> new SimpleStringProperty(cellData.getValue().getBaslik()));
        tarihSutun.setCellValueFactory(cellData -> new SimpleStringProperty(cellData.getValue().getTarih().toString()));
        saatSutun.setCellValueFactory(cellData -> new SimpleStringProperty(cellData.getValue().getSaat().toString()));
        konumSutun.setCellValueFactory(cellData -> new SimpleStringProperty(cellData.getValue().getKonum()));

        // Örnek veri
        etkinlikListesi = FXCollections.observableArrayList(
                new Etkinlik(1, "Doğa Yürüyüşü", LocalDate.of(2024, 12, 20), LocalTime.of(10, 30), "Belgrad Ormanı"),
                new Etkinlik(2, "Kamp Etkinliği", LocalDate.of(2024, 12, 25), LocalTime.of(14, 0), "Kilyos")
        );
        etkinlikTablosu.setItems(etkinlikListesi);

        // Hava durumu bilgisini yükle
        havaDurumuBilgisiGetir("Istanbul");
    }

    private void havaDurumuBilgisiGetir(String sehir) {
        HavaDurumu havaDurumu = new HavaDurumu();
        try {
            String bilgi = havaDurumu.havaDurumunuGetir(sehir);
            havaDurumuLabel.setText(bilgi);
        } catch (Exception e) {
            havaDurumuLabel.setText("Hava durumu bilgisi alınamadı: " + e.getMessage());
        }
    }
}
