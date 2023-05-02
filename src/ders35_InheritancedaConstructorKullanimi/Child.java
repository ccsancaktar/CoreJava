package ders35_InheritancedaConstructorKullanimi;

public class Child extends BParent {
    String isim = "Child isim belirtilmedi";
    protected String childKlupAdi = "ChildKlübü";

    Child(){
        System.out.println("Child constructor calisti");
    }

    public static void main(String[] args) {
        AGrandParent grandParent1 = new AGrandParent();
        // bu objeyi olusturmak icin GrandPa Cons. calisir.
        // Parent ve Child cons. calismaz.

        Child child1 = new Child();
        child1.grandpaKlupAdi = "Child1";
        child1.parentKlupAdi="Child2";

        // Child1 Objesi icin Child const. calisir

        /*
        Java'da bir class'i kullanabilmek icin
        o Class'tan obje olusturur, dolayisiyla
        o class'in consturctor'ini kullanirdik.

        Java inheritance'da parent class'lardaki
        ozellikleri kullanabilmek icin,
        o class'larin constructorlarini
        otomatik calistiran otomatik bir yapi kurmustur.

        Ornegin biz Child Class'inda
        yine Child class'indan bir obje olusturmak istedigimizde
        Child constructor'ini kullaniriz.

        Java Child(){} gördügünde
        once Parent'in constructor'ini calistirmam lazim der.
        Buradan parent cons'a gider.
        Parent Class'inda Parent(){} görünce,
        önce bunun parent'ini (GrandParent) cons. calismasi gerekir der.
        Böylece "extends" keywork olmayan Class'a kadar gider ve
        oradan baslayarak tüc Cons.'lari asagiya dogru calistirir.
         */
    }
}
