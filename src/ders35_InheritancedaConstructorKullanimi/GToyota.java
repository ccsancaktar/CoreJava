package ders35_InheritancedaConstructorKullanimi;

public class GToyota {
    GToyota(){
       System.out.println("Toyota parametresiz Cons");
    }

    GToyota(String isim){
        // Extends olmadigi icin "super();" kabul etmez.
        System.out.println("Toyota parametreli Cons");
    }

}
