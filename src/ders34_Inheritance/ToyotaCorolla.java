package ders34_Inheritance;

public class ToyotaCorolla extends Toyota {
    public static void main(String[] args) {
        /*
        Child class'tan Parent Class'a erisimde
        access modifier kurallarini bypass edemeyiz.
        Örnegin, parent'teki private class ogelerini child'ta kullanamayiz.
        ayni sekilde parent ve child farkli package'lerde ise
        Parent Class'daki default access modifier'i olan
        Class üyelerini child class'ta kullanamayiz.
         */

       ToyotaCorolla arb1 = new ToyotaCorolla();

        System.out.println(arb1.marka); // Toyota
        System.out.println(arb1.model); // Model Belirtilmedi


    }
}
