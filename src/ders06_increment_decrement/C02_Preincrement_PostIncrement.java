package ders06_increment_decrement;

public class C02_Preincrement_PostIncrement {
    public static void main(String[] args) {

        int sayi = 10;

        // sayi degerini olustuacagimiz b variableini atayalim
        // ve sonra sayi degerini 1 artiralim.

        int b = sayi;
        sayi ++;

        System.out.println(b); // 10
        System.out.println(sayi); // 11

        // bunu tek satirda yapabilir miyiz?
        // sayi degerini olustuacagimiz c variableini atayalim
        // ve sonra sayi degerini 1 artiralim.

        //Burada iki secenek var, suanki POST INCREMET //
        //sayi++ kullanirsak once sayiyi alip sonra C'ye atayacak.
        sayi = 11;
        int c = sayi++;
        System.out.println(c); // 11
        System.out.println(sayi); // 12

        // Ikinci Secenek PRE INCREMENT //
        sayi = 11;
        c = ++sayi;
        System.out.println(c); // 12
        System.out.println(sayi); // 12




    }
}
