package org.example;

public class StackOfIntegers {
    private int[] elements;
    private int size;
    public static final int DEFAULT_CAPACITY = 16;

    public StackOfIntegers(int capacity){//constructer
        elements = new int[capacity];// Kullanici tarafindan belirtilen kapasiteyle dizi olusturur
    }

    public StackOfIntegers() {//default constructer
        this(DEFAULT_CAPACITY);//Varsayilan kapasiteyi kullanir
    }

    public void push(int value){
        if(size >= elements.length){//size diziden buyuk oldugunda
            int[] temp = new int[elements.length * 2];//diziyi iki katina cikarir
            System.arraycopy(elements, 0, temp, 0, elements.length);//yeni diziye koypalar
            elements = temp;//yeni dizi referansini eski diziye atar
        }
        elements[size++] = value;//yeni eleman ekler ve boyutunu bir arttirir
    }

    public int pop(){
        return elements[--size];
    }//yiginin en ustundeki elemani cikarir

    public int peek(){
        return elements[size - 1];
    }//yiginin en ustundeki elemanı gorur
    public boolean empty(){
        return size == 0;
    }//yigin bos mu

    public int getSize(){
        return size;
    }//yigindaki toplam eleman sayisi

}
