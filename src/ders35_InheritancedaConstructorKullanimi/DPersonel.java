package ders35_InheritancedaConstructorKullanimi;

public class DPersonel {

    DPersonel(){
        // extends keyword olmadigi icin burada super(); yok.
        // bu nedenle, bu calisir ve Child'ina (muhasebe) döner.
        System.out.println("Personel parametresiz Cons");
    }

    DPersonel(String isim){
        System.out.println("Personel parametreli Cons");
    }

}
