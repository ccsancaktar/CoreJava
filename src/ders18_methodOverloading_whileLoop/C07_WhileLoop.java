package ders18_methodOverloading_whileLoop;

import java.util.Scanner;

public class C07_WhileLoop {
    public static void main(String[] args) {
        // Kullanicidan bir sifre isteyin
        // asagidaki sartlari saglayana kadar
        // her seferinde hatalari soyleyip yeni sifre isteyin
        // sartlari saglayan sifre oldugunda
        // 5'inci denemenizde basarili sifre olusturuldu yazin

        /*
        Ilk harf kucuk harf olmali
        Son harf buyuk harf olmali
        Bosluk icermemeli
        8 karakter veya daha uzun olmali
         */

        Scanner scan = new Scanner(System.in);

        String sifre = "";
        int flag = 0;
        int denemeSayisi = 0;

        while (flag != 4){
            flag = 0;
            System.out.println("Lutfen bir sifre giriniz");
            sifre = scan.nextLine();

            //Ilk harf kucuk harf olmali
            if (sifre.charAt(0)>='a' && sifre.charAt(0) <= 'z' ){
                flag++;
            } else {
                System.out.println("Ilk karakter kucuk olmali");
            }

            // Son harf buyuk harf olmali
            if (sifre.charAt(sifre.length()-1)>='A' && sifre.charAt(sifre.length()-1)<='Z'){
                flag++;
            } else {
                System.out.println("Son karakter büyük olmali");
            }

            // Bosluk icermemeli
            if (sifre.contains(" ")){
                System.out.println("Sifre bosluk icermemeli");
            } else {
                flag++;
            }

            // 8 karakter veya daha uzun olmali
            if (sifre.length()>=8){
                flag++;
            } else {
                System.out.println("Uzunluk en az 8 karakter olmali");
            }
            denemeSayisi++;
        }

        System.out.println("Tebrikler! " + denemeSayisi + " denemede, sifreniz basarili sekilde  kaydedildi.");

    }
}
