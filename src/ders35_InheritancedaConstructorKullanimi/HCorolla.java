package ders35_InheritancedaConstructorKullanimi;

public class HCorolla extends GToyota {
    HCorolla(){
        System.out.println("Corolla parametresiz Cons");
    }

    HCorolla(String isim){
        super(isim);
        System.out.println("Corolla parametreli Cons");
    }
}
