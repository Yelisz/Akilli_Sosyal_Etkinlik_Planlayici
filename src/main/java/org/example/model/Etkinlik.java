package org.example.model;

import java.time.LocalDate;
import java.time.LocalTime;

public class Etkinlik {
    private int id;
    private String baslik;
    private LocalDate tarih;
    private LocalTime saat;
    private String konum;

    // Constructor
    public Etkinlik(int id, String baslik, LocalDate tarih, LocalTime saat, String konum) {
        this.id = id;
        this.baslik = baslik;
        this.tarih = tarih;
        this.saat = saat;
        this.konum = konum;
    }

    // Getter ve Setter metotları
    public int getId() {
        return id;
    }

    public String getBaslik() {
        return baslik;
    }

    public LocalDate getTarih() {
        return tarih;
    }

    public LocalTime getSaat() {
        return saat;
    }

    public String getKonum() {
        return konum;
    }
}
