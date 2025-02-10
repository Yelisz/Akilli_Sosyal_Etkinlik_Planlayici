package org.example.model;

public class Davet {
    private int id;
    private Etkinlik etkinlik;
    private Kullanici gonderen;
    private Kullanici alici;
    private String durum;

    // Constructor
    public Davet(int id, Etkinlik etkinlik, Kullanici gonderen, Kullanici alici, String durum) {
        this.id = id;
        this.etkinlik = etkinlik;
        this.gonderen = gonderen;
        this.alici = alici;
        this.durum = durum;
    }

    // Getters and Setters
    public int getId() {
        return id;
    }

    public Etkinlik getEtkinlik() {
        return etkinlik;
    }

    public Kullanici getGonderen() {
        return gonderen;
    }

    public Kullanici getAlici() {
        return alici;
    }

    public String getDurum() {
        return durum;
    }
}
