package org.example;

import javafx.fxml.FXML;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TextField;
import org.example.model.Event;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class EventEditController {

    @FXML
    private TextField txtEventTitle;

    @FXML
    private DatePicker datePickerEventDate;

    @FXML
    private TextField txtEventTime;

    @FXML
    private TextField txtEventLocation;

    private Event currentEvent;

    // Etkinlik düzenleme için mevcut etkinlik bilgilerini alır
    public void setEventData(Event event) {
        currentEvent = event;
        txtEventTitle.setText(event.getBaslik());

        // Tarih formatını belirtin ve String'i LocalDate'e dönüştürün
        LocalDate tarihLocalDate = event.getTarih();  // Artık tarih LocalDate formatında
        datePickerEventDate.setValue(tarihLocalDate);

        // Saat formatını LocalTime'a dönüştürün
        LocalTime timeLocal = event.getSaat();  // LocalTime türünde
        txtEventTime.setText(timeLocal.toString());  // LocalTime'ı String'e dönüştürüp yazıyoruz

        txtEventLocation.setText(event.getKonum());
    }

    @FXML
    private void handleUpdateEvent() {
        // Düzenlenen etkinlik bilgilerini al
        String title = txtEventTitle.getText();
        LocalDate date = datePickerEventDate.getValue();  // DatePicker'dan alınan tarih LocalDate türünde
        String timeString = txtEventTime.getText();  // Saatin String formatı
        String location = txtEventLocation.getText();

        // String'i LocalTime'a dönüştürün
        LocalTime time = LocalTime.parse(timeString);  // String'i LocalTime'a dönüştürüyoruz

        // Etkinliği güncelle
        if (currentEvent != null) {
            currentEvent.setBaslik(title);
            currentEvent.setTarih(date);  // Tarih LocalDate türünde
            currentEvent.setSaat(time);  // Saat LocalTime türünde
            currentEvent.setKonum(location);
        }

        System.out.println("Etkinlik Güncellendi!");
    }
}
