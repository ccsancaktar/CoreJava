package ders12_SwitchStatements;

import java.util.Scanner;

public class C01_ifElseCozum {
    public static void main(String[] args) {
        /*
        If else if ile cozulen sorularda sartlar arttikca
        yapinin ve kurgunun bozulmamasi icin Switch kullanilir
        If Else'e gore daha anlasilirdir.
         */

        // Simdi bu soruyu If Else ile cozuyoruz
        // Kullanicidan gun numarasi al, hangi gun oldugunu yazdir.

        Scanner scan = new Scanner(System.in);
        System.out.println("Bir gun sayisi giriniz");
        int sayi = scan.nextInt();

        if (sayi<=0 || sayi>7){
            System.out.println("Gecersiz gün");
        } else if (sayi==1) {
            System.out.println("Pazartesi");
        } else if (sayi==2) {
            System.out.println("Sali");
        } else if (sayi==3) {
            System.out.println("Carsamba");
        } else if (sayi==4) {
            System.out.println("Persembe");
        } else if (sayi==5) {
            System.out.println("Cuma");
        } else if (sayi==6) {
            System.out.println("Cumartesi");
        } else if (sayi==7) {
            System.out.println("Pazar");
        }

    }
}
