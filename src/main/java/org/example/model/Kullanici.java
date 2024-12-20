// src/main/model/Kullanici.java
package org.example.model;

import java.util.List;

public class Kullanici {
    private int id;
    private String ad;
    private String soyad;
    private String email;
    private List<String> ilgiAlanlari;
    private List<Etkinlik> katildigiEtkinlikler;

    // Constructor
    public Kullanici(int id, String ad, String soyad, String email) {
        this.id = id;
        this.ad = ad;
        this.soyad = soyad;
        this.email = email;
    }

    // Getters and Setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getAd() {
        return ad;
    }

    public void setAd(String ad) {
        this.ad = ad;
    }

    public String getSoyad() {
        return soyad;
    }

    public void setSoyad(String soyad) {
        this.soyad = soyad;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public List<String> getIlgiAlanlari() {
        return ilgiAlanlari;
    }

    public void setIlgiAlanlari(List<String> ilgiAlanlari) {
        this.ilgiAlanlari = ilgiAlanlari;
    }

    public List<Etkinlik> getKatildigiEtkinlikler() {
        return katildigiEtkinlikler;
    }

    public void setKatildigiEtkinlikler(List<Etkinlik> katildigiEtkinlikler) {
        this.katildigiEtkinlikler = katildigiEtkinlikler;
    }

    // Methods
    public void etkinlikOlustur(Etkinlik etkinlik) {
        System.out.println(ad + " etkinlik oluşturdu: " + etkinlik.getBaslik());
    }

    public void etkinlikYoneticisi() {
        System.out.println(ad + " etkinliklerini yönetiyor.");
    }
}