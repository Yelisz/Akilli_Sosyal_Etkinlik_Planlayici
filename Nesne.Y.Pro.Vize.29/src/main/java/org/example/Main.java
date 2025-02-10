package org.example;

class Shape {
    public String getType() {
        return "Genel bir şekil.";
    }
}

class Circle extends Shape {
    public double getDiameter() {
        return 10.0;
    }

    @Override
    public String getType() {
        return "Daire.";
    }
}

class Rectangle extends Shape {
    @Override
    public String getType() {
        return "Dikdörtgen.";
    }
}

public class Main {
    public static void main(String[] args) {
        Shape shape1 = new Circle(); // Implicit Casting
        Shape shape2 = new Rectangle();

        displayShapeInfo(shape1);
        displayShapeInfo(shape2);
    }

    public static void displayShapeInfo(Shape shape) {
        System.out.println("Şekil türü: " + shape.getType());

        if (shape instanceof Circle) {
            Circle circle = (Circle) shape; // Explicit Casting
            System.out.println("Dairenin çapı: " + circle.getDiameter());
        }
    }
}
