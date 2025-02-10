package org.example;

import org.example.model.Davet;
import org.example.model.Etkinlik;
import org.example.model.Kullanici;

import java.time.LocalDate;
import java.time.LocalTime;

public class Main {
    public static void main(String[] args) {
        // Etkinlik bilgileri
        LocalDate tarih = LocalDate.of(2024, 12, 25);  // 2024-12-25
        LocalTime saat = LocalTime.of(18, 30);  // 18:30

        // Etkinlik oluşturuluyor
        Etkinlik etkinlik = new Etkinlik(1, "Yılbaşı Partisi", tarih, saat, "İstanbul");

        // Kullanıcıları oluşturuyoruz
        Kullanici gonderen = new Kullanici(1, "Ahmet", "Yılmaz", "ahmet@ornek.com");
        Kullanici alici = new Kullanici(2, "Mehmet", "Demir", "mehmet@ornek.com");

        // Davet oluşturuluyor
        Davet davet = new Davet(1, etkinlik, gonderen, alici, "Bekliyor");

        // Etkinlik bilgilerini yazdırıyoruz
        System.out.println("Etkinlik Başlık: " + etkinlik.getBaslik());
        System.out.println("Etkinlik Tarih: " + etkinlik.getTarih());
        System.out.println("Etkinlik Saat: " + etkinlik.getSaat());
        System.out.println("Etkinlik Konum: " + etkinlik.getKonum());

        // Davet bilgilerini yazdırıyoruz
        System.out.println("\nDavet Gönderen: " + davet.getGonderen().getAd() + " " + davet.getGonderen().getSoyad());
        System.out.println("Davet Alan: " + davet.getAlici().getAd() + " " + davet.getAlici().getSoyad());
        System.out.println("Davet Durumu: " + davet.getDurum());
    }
}
