package org.example;

class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true; // Aynı referans mı?
        if (obj == null || getClass() != obj.getClass()) return false; // Tür kontrolü
        Person person = (Person) obj; // Güvenli Downcasting
        return age == person.age && name.equals(person.name); // İçerik karşılaştırması
    }
}
