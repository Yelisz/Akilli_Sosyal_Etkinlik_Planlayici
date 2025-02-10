package org.example;

public class Circle extends GeometricObject{
    private double radius;

    public Circle(){
        this(1.0);

    }
    public Circle(double radius){
        this.radius = radius;
    }
    public Circle(double radius, String color, boolean filled){
        super(color, filled);
        this.radius = radius;
    }
    public double getRadius(){
        return radius;
    }
    public double setRadius(double radius){
        this.radius = radius;
        return radius;
    }
    public double getArea(){
        return  Math.PI * radius * radius;
    }
    public double getPerimeter(){
        return 2 * Math.PI * radius;
    }
    public String toString(){
        return  super.toString() + "Radius: " +radius;
    }
}
