package org.example;

import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

public class LoginController {

    @FXML
    private TextField txtKullaniciAdi;

    @FXML
    private PasswordField txtSifre;

    @FXML
    private void handleLogin() {
        String kullaniciAdi = txtKullaniciAdi.getText();
        String sifre = txtSifre.getText();

        if (kullaniciAdi.isEmpty() || sifre.isEmpty()) {
            showAlert("Hata", "Kullanıcı adı ve şifre boş bırakılamaz.");
            return;
        }

        if (validateCredentials(kullaniciAdi, sifre)) {
            showAlert("Başarılı", "Giriş başarılı! Ana ekrana yönlendiriliyorsunuz.");
        } else {
            showAlert("Hata", "Kullanıcı adı veya şifre yanlış.");
        }
    }

    private boolean validateCredentials(String kullaniciAdi, String sifre) {
        return kullaniciAdi.equals("admin") && sifre.equals("1234");
    }

    private void showAlert(String title, String message) {
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle(title);
        alert.setHeaderText(null);
        alert.setContentText(message);
        alert.showAndWait();
    }
}
