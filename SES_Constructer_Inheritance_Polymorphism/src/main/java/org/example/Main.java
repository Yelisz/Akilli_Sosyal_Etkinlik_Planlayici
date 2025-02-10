package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
      insan yeliz = new insan();
      yeliz.boy = 172;
      yeliz.kilo = 65;
      yeliz.yas = 21;
      yeliz.yemek();
      System.out.println("Yeliz kilo: " +yeliz.kilo);
      insan feyza = new insan(168, 70, 21);
      System.out.println("Feyza yaş: " +feyza.yas);

      muhendis ali = new muhendis(10000);
      ali.zam((float) 0.5);
      System.out.println(ali);//toString geri döncez
      muhendis veli = new muhendis();
      veli.yemek(80);
      veli.yemek();
      System.out.println("Veli'nin kilosu: " +veli.kilo);

    }
}