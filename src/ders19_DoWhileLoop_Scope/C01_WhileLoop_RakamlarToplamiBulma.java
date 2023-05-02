package ders19_DoWhileLoop_Scope;

import java.util.Scanner;

public class C01_WhileLoop_RakamlarToplamiBulma {
    public static void main(String[] args) {
        // Kullanicidan alinan sayinin rakamlar toplamini bulma

        Scanner scan = new Scanner(System.in);
        System.out.println("Bir sayi giriniz");
        int girilenSayi = scan.nextInt();

        int sayi = girilenSayi;
        int birlerBasamagi = 0;
        int rakamlarToplami = 0;

        while (sayi > 0){
            birlerBasamagi = sayi%10;
            rakamlarToplami += birlerBasamagi;
            sayi /= 10;
        }

        System.out.println("Girilen " + girilenSayi + " 'nin rakamlari toplami: " + rakamlarToplami);

        System.out.println(C02_RakamlarToplamiBulMethodu.rakamlarToplaminiBul(girilenSayi));
    }
}
