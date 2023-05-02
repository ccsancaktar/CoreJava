package ders42_AbstractClass_Interfaces;

public class K_ChildClassOfInterfaces implements I02_Interfaces, I03_Interfaces {
    /*
    Bir class'i bir interface'e child yapmak icin "implements" keyword kullanilir.
    implement yazdiktan sonra virgul kullanara istedigimiz kadar interface ekleyebiliriz.

    Class-Class => extends kulan
    Interface - Interface => extends kullan
    Class - Interface => implements kullan
    Implements - Class => CHILD EDILEMEZ
     */

    public static void main(String[] args) {

        System.out.println(I03_Interfaces.SAYI); // 20
        System.out.println(I02_Interfaces.SAYI); // 30
        System.out.println(ISIM); // Sancak

    }

    @Override
    public void yakit() {

    }

    @Override
    public void motor() {

    }

    @Override
    public void teker() {

    }
}
