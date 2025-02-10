package org.example.model;

import java.time.LocalDate;
import java.time.LocalTime;

public class Event {

    private String baslik;
    private LocalDate tarih;
    private LocalTime saat;
    private String konum;

    // Constructor
    public Event(String baslik, String tarih, String saat, String konum) {
        this.baslik = baslik;
        this.tarih = LocalDate.parse(tarih);
        this.saat = LocalTime.parse(saat);
        this.konum = konum;
    }

    public String getBaslik() {

        return baslik;
    }

    public void setBaslik(String baslik) {

        this.baslik = baslik;
    }

    public LocalDate getTarih() {

        return tarih;
    }

    public void setTarih(LocalDate tarih) {

        this.tarih = tarih;
    }

    public LocalTime getSaat() {

        return saat;
    }

    public void setSaat(LocalTime saat) {

        this.saat = saat;
    }

    public String getKonum() {

        return konum;
    }

    public void setKonum(String konum) {

        this.konum = konum;
    }
}
