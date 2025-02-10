package org.example;

import javafx.fxml.FXML;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TextField;

public class EventAddController {

    @FXML
    private TextField txtEventTitle;

    @FXML
    private DatePicker datePickerEventDate;

    @FXML
    private TextField txtEventTime;

    @FXML
    private TextField txtEventLocation;

    @FXML
    private void handleAddEvent() {
        String title = txtEventTitle.getText();
        String date = datePickerEventDate.getValue().toString();
        String time = txtEventTime.getText();
        String location = txtEventLocation.getText();

        // Burada etkinlik verilerini işleyip, ekleme işlemi yapılacak
        System.out.println("Etkinlik Başlığı: " + title);
        System.out.println("Etkinlik Tarihi: " + date);
        System.out.println("Etkinlik Saati: " + time);
        System.out.println("Etkinlik Konumu: " + location);

        // Örneğin, etkinliği veritabanına ekleme işlemi burada yapılabilir.
    }
}
