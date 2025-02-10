//GeometricObject' in bir nesnesi olmamalı genel geometrik şekil diye bir şey yoktur
//Bu yüzden abstract olarak tanımladık

//getArea() ve getPerimeter() metodları circle ve rectangle için farklı
//tanımlanmalı (daire ve dörtgen) bu yüzden abstract metod olarak tanımlandı

package org.example;

import java.util.Date;

public abstract class GeometricObject {
    private String color = "White";
    private boolean filled;
    private java.util.Date dateCreated;

    protected GeometricObject(){
        dateCreated = new java.util.Date();
    }
    protected GeometricObject(String color, boolean filled){
        this.color = color;
        this.filled = filled;
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

    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    public java.util.Date getDateCreated(){
        return dateCreated;
    }
    public String toString(){
        return  "created on" +dateCreated+ "\ncolor" +color+ "and filled" +filled;
    }
    public  abstract double getArea();
    public  abstract double getPerimeter();
}
