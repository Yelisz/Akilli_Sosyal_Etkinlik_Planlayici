package org.example;

public class CircleWithException {
    private double radius;

    public CircleWithException(double radius) throws IllegalArgumentException{
        setRadius(radius);
    }

    public void setRadius(double newRadius){
        if(newRadius < 0){
            throw new IllegalArgumentException("Yarıçap negatif olamaz: " +newRadius);
        }
        this.radius = newRadius;
    }
}
