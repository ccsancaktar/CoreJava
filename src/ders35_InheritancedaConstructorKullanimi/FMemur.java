package ders35_InheritancedaConstructorKullanimi;

public class FMemur extends EMuhasebe {
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

    FMemur(){
        // extends keyword oldugu icin burada super(); var.
        // bu nedenle, (muhasebe) parentine gider.
        System.out.println("Memur parametresiz Cons");
    }

    FMemur(String isim){
        // extends keyword oldugu icin burada super(); var.
        // bu nedenle, (muhasebe) parentine gider.
        // Fakat yine de parentteki "Parametresiz Cons" calisir.
        System.out.println("Memur parametreli Cons");
    }

    public static void main(String[] args) {

        FMemur mmr1 = new FMemur("ali");
    }

}
