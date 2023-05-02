package ders29_PassByValue_Immutable;

import java.util.Locale;

public class C04_Immutable {
    public static void main(String[] args) {
        /*
        Immutable   :  Degistirilemez
        Mutable     :  Degistirilebilir

        en meshur immutable class : String
         */

        String str = "Sancak Bank";
        System.out.println(str.toUpperCase()); // SANCAK BANK

        str.toLowerCase();
        System.out.println(str); // Sancak Bank

        str.substring(3,5); // ck "sout olmadigindan yazdirmaz"
        System.out.println(str); // Sancak Bank


        // Javada String gibi metin iadelerde kullanabilecegimiz
        // mutable StringBuilder class'i da vardir.

        StringBuilder sb = new StringBuilder("Java Bank");
        System.out.println(sb); // Java Bank

        sb.reverse();
        System.out.println(sb); // knaB avaJ

        sb.append(".");
        System.out.println(sb); // knaB avaJ.
    }
}
