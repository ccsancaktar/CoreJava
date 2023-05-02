package ders11_ternaryOperators;

import java.util.Scanner;

public class C02_ternary {
    public static void main(String[] args) {
        /*
        Soru 2 - Kullanicidan bir harf isteyin
        harf kucuk ise Büyük yazdirin
        yoksa girilen harfi yazdirin
         */

        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen bir harf giriniz");
        char harf = scan.next().charAt(0);

        System.out.println( harf>'a' && harf<'z' ? (char)(harf-32) : harf );
        // ASCII tablsuna gore kucuk harflerin degeri buyuklerden 32 fazla.
        // kucuk buyuk harf degerlerine ve sembollere ASCII tablosundan bakilir.


    }
}
