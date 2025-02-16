package org.example.model;

import java.util.ArrayList;
import java.util.List;

public class Takvim {
    private int id;
    private List<Etkinlik> etkinlikler;

    // Constructor
    public Takvim(int id) {
        this.id = id;
        this.etkinlikler = new ArrayList<>();
    }

    // Getters and Setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public List<Etkinlik> getEtkinlikler() {
        return etkinlikler;
    }

    public void setEtkinlikler(List<Etkinlik> etkinlikler) {
        this.etkinlikler = etkinlikler;
    }

    // Methods
    public void hatirlatmaEkle(Etkinlik etkinlik) {
        System.out.println("Hatırlatma eklendi: " + etkinlik.getBaslik());
    }

}
