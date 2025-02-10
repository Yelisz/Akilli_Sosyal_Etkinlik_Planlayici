package org.example;

public abstract class Animal {
    public abstract String sound();//Abstract metod, her alt sınıf uygulamak zorundadır

    public void sleep(){// Concrete metot, Ortak davranış alt sınıflar isterse kullanır
        System.out.println("This animal is sleeping...");
    }
    interface Pet{
        String getName();
        void setName(String name);
    }
    interface Wild{
        String habitat();
    }

    //Dog Animalın alt classı ve Pet metodlarınıda uygulamalı (zorunda değil)
    public class Dog extends Animal implements Pet{
        private String name;
        public String sound(){
            return  "Hav hav";
        }
        public String getName(){
            return name;
        }
        public void setName(String name){
            this.name = name;
        }
    }

    //Lion Animalın alt sınıfı ve vahşi hayvan özellikleri taşıyor
    class Lion extends Animal implements Wild{
        private String habitat;
        public String sound(){
            return "Arr Ğarr";
        }
        public String habitat(){
            return "Savanna";
        }
    }
    class Parrot extends Animal implements Pet, Wild{
        private String name;
        private String habitat;

        public String sound(){
            return "Cici kuş cici kuş";
        }
        public void sleep(){
            super.sleep();
        }
        public String getName(){
            return name;
        }
        public void setName(String name){
            this.name = name;
        }
        public String habitat(){
            return habitat;//return "Yagmur ormanları ve tropikal alanlar";
        }
    }
}
