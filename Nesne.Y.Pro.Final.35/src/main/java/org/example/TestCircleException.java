package org.example;

public class TestCircleException{
    public static void main(String[] args){
        try{
            CircleWithException circle = new CircleWithException(-5);
        } catch (IllegalArgumentException e){
            System.out.println("İstisna yakalandı: " +e.getMessage());
        }
    }
}
