package ders35_InheritancedaConstructorKullanimi;

public class EMuhasebe extends DPersonel {
    /*
    Extends keyword kullanilan class'larda
    ister Default cons bulunsun,
    istersek de biz yeni cons(lar) olusturalim
    Java cons'in ilk satirina
    super(); costructor call yazar.

    super(); constructor call default constructor'a benzer.
    Görünmese de orada vardir ve calisir.
    Ancak biz ilk satira farkli bir cons. call yazarsak
    Java super(); 'i siler.
    */

    EMuhasebe(){
        // extends keyword oldugu icin burada super(); var.
        // bu nedenle, (personel) parentine gider.
        System.out.println("Muhasebe parametresiz Cons");
    }

    EMuhasebe(String isim){
        // extends keyword oldugu icin burada super(); var.
        // bu nedenle, (muhasebe) parentine gider.
        // Fakat yined de parentteki "Parametresiz Cons" calisir.
        System.out.println("Muhasebe parametreli Cons");
    }

}
