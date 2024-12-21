package org.example;

import javafx.fxml.FXML;
import javafx.scene.control.TextField;
import javafx.scene.control.PasswordField;

public class LoginController {

    @FXML
    private TextField txtKullaniciAdi;

    @FXML
    private PasswordField txtSifre;

    @FXML
    private void handleLogin() {
        String kullaniciAdi = txtKullaniciAdi.getText();
        String sifre = txtSifre.getText();

        // Giriş kontrolü (örnek bir çıktı)
        if ("admin".equals(kullaniciAdi) && "1234".equals(sifre)) {
            System.out.println("Giriş başarılı!");
        } else {
            System.out.println("Giriş başarısız! Kullanıcı adı veya şifre yanlış.");
        }
    }
}
