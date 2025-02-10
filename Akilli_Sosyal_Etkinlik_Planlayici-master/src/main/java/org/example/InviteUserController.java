package org.example;

import javafx.fxml.FXML;
import javafx.scene.control.TextField;
import javafx.scene.control.Button;

import org.example.model.Event;
import org.example.model.Kullanici;


public class InviteUserController {

    @FXML
    private TextField txtUserEmailOrUsername;  // Kullanıcı adı veya e-posta alanı

    @FXML
    private Button btnSendInvite;  // Davet gönderme butonu

    private Event currentEvent;  // Davet edilecek etkinlik
    private Kullanici currentUser;  // Davet gönderen kullanıcı

    // Etkinlik ve kullanıcı bilgilerini controller'a aktar
    public void setEventAndUser(Event etkinlik, Kullanici kullanici) {
        this.currentEvent = etkinlik;
        this.currentUser = kullanici;
    }

    @FXML
    private void handleSendInvite() {
        String emailOrUsername = txtUserEmailOrUsername.getText();

        if (emailOrUsername.isEmpty()) {
            System.out.println("Lütfen bir kullanıcı adı veya e-posta girin.");
            return;
        }

        // Burada, girilen e-posta veya kullanıcı adına sahip bir Kullanici nesnesi bulunmalıdır.
        // Örneğin, bir veritabanından veya kullanıcı listesinde sorgulama yapılabilir.

        // Kullanıcıyı bulduktan sonra davet nesnesi oluşturulabilir:
        Kullanici alici = new Kullanici();  // Bu kısmı veritabanı veya mevcut kullanıcılar üzerinden güncelleyin.
        alici.setEmail(emailOrUsername);


        // Davet gönderme işlemi yapılabilir, örneğin veritabanına kaydedilebilir:
        System.out.println("Davet gönderildi: " + alici.getEmail());

        // Davet gönderme işlemi başarılı mesajı
        System.out.println("Etkinlik daveti gönderildi!");
    }
}
