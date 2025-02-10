package org.example;

public class SimpleGeometricObejct {
    private String color = "white";
    private boolean filled;
    private java.util.Date dateCreated;

    public SimpleGeometricObejct(String color, boolean filled){
        dateCreated = new java.util.Date();
        this.color = color;
        this.filled = filled;
    }

    public SimpleGeometricObejct() {
        dateCreated = new java.util.Date();
    }

    public String getColor(){
        return color;
    }
    public void setColor(String color){
        this.color = color;
    }
    public boolean isFilled(){
        return filled;
    }
    public void setFilled(boolean fillied){
        this.filled = fillied;
    }
    public java.util.Date getDateCreated(){
        return dateCreated;
    }
    public String toString(){
        return "created on" + dateCreated + "\n color: " +color+ "and fillied: " +filled;
    }
}
