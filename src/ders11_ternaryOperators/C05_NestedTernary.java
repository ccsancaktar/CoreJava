package ders11_ternaryOperators;

import java.util.Scanner;

public class C05_NestedTernary {
    public static void main(String[] args) {
        /*
        Nested Ternary, kompleks sart islemleri icin kullanilir. (Tavsiye Edilmez)
        (OSA Sinavinda cikiyor bu nedenle buraya ornek koyuyoruz)
         */

        /*
        Soru - Kullanicidan bir sayi alin
        Sayi pozitifse "Cift sayi" yada "Cift sayi degil" yazdirin
        Sayi negatifse "3 Basamakli" yada "3 Basamakli degil" yazdirin
         */

        Scanner scan = new Scanner(System.in);
        System.out.println("Bir sayi giriniz;");
        int a = scan.nextInt();

        System.out.println(a>0 ? a%2==0 ? "Cift Sayi" : "Tek Sayi" : a<-100 && a>-1000 ? "3 Basamakli Sayi" : "3 Basamakli degil");
        // Kodlar cok karisik oldugundan, tavsiye edilmez.


    }
}
