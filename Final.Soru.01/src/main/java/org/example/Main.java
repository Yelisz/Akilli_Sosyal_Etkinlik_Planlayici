package org.example;
import java.math.BigInteger;
import java.math.BigDecimal;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Number> list = new ArrayList<>();

        list.add(45);
        list.add(3445.53);
        list.add(new BigInteger("234567890"));
        list.add(new BigDecimal("2.4567894562345678"));

        System.out.println("En buyuk sayı: " +getLargestNumber(list));
    }
    public static Number getLargestNumber(ArrayList<Number> list){
        if(list == null || list.size() == 0){
            return null; //Eger liste bossa null doner
        }

        Number number = list.get(0);
        for(int i = 1; i < list.size(); i++){
            if(number.doubleValue() < list.get(i).doubleValue())
                number = list.get(i);
        }
        return number;
    }
}