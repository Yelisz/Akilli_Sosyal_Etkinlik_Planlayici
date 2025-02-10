package org.example;

public class insan {
    int boy;
    int kilo;
    int yas;

    public insan(){//parametresiz/deafult constructer
    }
    public insan (int boy, int kilo, int yas){// parametreli constructer
        this.boy = boy;
        this.kilo = kilo;
        this.yas = yas;
    }
    //!! iki constructer var -> polymorphism
    void yemek(){
      kilo++;
    }
}
