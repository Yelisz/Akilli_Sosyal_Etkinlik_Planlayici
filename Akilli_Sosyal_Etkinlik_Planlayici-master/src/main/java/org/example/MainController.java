package org.example;

import org.example.model.Event;
import org.example.model.Kullanici;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class MainController {

    @FXML
    private TableView<Event> etkinlikTablosu;

    @FXML
    private TableColumn<Event, String> baslikSutun;

    @FXML
    private TableColumn<Event, String> tarihSutun;

    @FXML
    private TableColumn<Event, String> saatSutun;

    @FXML
    private TableColumn<Event, String> konumSutun;

    @FXML
    private Label havaDurumuLabel;

    private ObservableList<Event> etkinlikListesi;

    @FXML
    public void initialize() {
        // Tablonun kolonlarını bağla
        baslikSutun.setCellValueFactory(new PropertyValueFactory<>("baslik"));
        tarihSutun.setCellValueFactory(new PropertyValueFactory<>("tarih"));
        saatSutun.setCellValueFactory(new PropertyValueFactory<>("saat"));
        konumSutun.setCellValueFactory(new PropertyValueFactory<>("konum"));

        // Örnek veri ekle
        etkinlikListesi = FXCollections.observableArrayList(
                new Event("Toplantı", "2024-12-25", "14:00", "Ofis"),
                new Event("Doğum Günü", "2024-12-26", "18:00", "Ev")
        );

        etkinlikTablosu.setItems(etkinlikListesi);

        // Hava durumu bilgisi güncelle
        updateWeatherInfo();
    }

    private void updateWeatherInfo() {
        // Örnek hava durumu - API entegrasyonu burada yapılacak
        havaDurumuLabel.setText("Ankara: 12°C, Güneşli");
    }

    @FXML
    private void handleAddEvent() {
        // Etkinlik ekleme işlevi
        System.out.println("Etkinlik ekle butonuna basıldı.");
    }

    @FXML
    private void handleEditEvent() {
        // Etkinlik düzenleme işlevi
        System.out.println("Etkinlik düzenle butonuna basıldı.");
    }

    @FXML
    private void handleDeleteEvent() {
        // Seçilen etkinliği silme
        Event selectedEvent = etkinlikTablosu.getSelectionModel().getSelectedItem();
        if (selectedEvent != null) {
            etkinlikListesi.remove(selectedEvent);
        }
    }

    @FXML
    private void handleRefresh() {
        // Tabloyu yenileme
        etkinlikTablosu.refresh();
    }

    @FXML
    private void handleInviteUser() {
        // Seçilen etkinlik ve kullanıcıyı al
        Event selectedEvent = etkinlikTablosu.getSelectionModel().getSelectedItem();
        if (selectedEvent != null) {
            Kullanici currentUser = new Kullanici(1, "Ahmet", "Yılmaz", "ahmet@ornek.com");  // Örnek kullanıcı, gerçekte giriş yapan kullanıcı kullanılmalı

            try {
                // Davet sayfasını yükle
                FXMLLoader loader = new FXMLLoader(getClass().getResource("/path/to/InviteUserPage.fxml"));
                Parent inviteUserPage = loader.load();

                // InviteUserController'a etkinlik ve kullanıcı bilgilerini aktar
                InviteUserController inviteController = loader.getController();
                inviteController.setEventAndUser(selectedEvent, currentUser);

                // Yeni sahneyi oluştur ve göster
                Stage stage = new Stage();
                stage.setScene(new Scene(inviteUserPage));
                stage.show();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
