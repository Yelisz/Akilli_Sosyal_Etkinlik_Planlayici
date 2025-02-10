package org.example;

public class muhendis extends insan {//inheritance
    private int maas;
    public muhendis(){
        this(70000);
    }
    public muhendis(int maas){
        if(maas > 70000){
            this.maas = maas;
        }
        else{
            this.maas = 70000;
        }
    }
    public muhendis (int boy, int kilo, int yas){//super anahtar kelimesi kullanımı
        super(boy, kilo, yas);//superclasstaki constructerı kullanıyoruz
    }
    int zam(){
        maas++;
        return maas;
    }
    int zam(int zam_mikari){//overloading/üzerine yükleme
        maas += zam_mikari;
        return maas;
    }
    int zam(float zam_orani){//bu metod içerisinden yukarıdaki
        float artis = zam_orani * maas;//overload metodu çağırılıyor
        zam((int)artis);
        return maas;
    }

    //superclass -> insan, subclass -> muhendis
    //inheritance/kalıtım extendsle saglanır

    //polymorphism/çok şekilcilik parametre sayısı veya tipi
    //değişmek şartıyla aynı isimde metodtan birden fazla yazılabilir
    //buna overload denir ancak overloadın return typeı farklı olamaz
    void yemek(){//overriding/üzerine yazma
        kilo += 2;
    }
    void yemek(int kilo){//overload
        this.kilo = kilo;
    }
    //insan classında yemek metodu 1 kilo arttırır
    //muhendis classında 2 kilo arttırır buna override/üstüne yazma denir

}
