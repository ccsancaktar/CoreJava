package ders04_dataCasting;

import java.util.Scanner;
public class C04_DataCasting {
    public static void main(String[] args) {

        // Kullanicidan iki tam sayi alip bunlari birbirine bolun
        // Sounucu double olarak yazdirin.

        Scanner scan= new Scanner(System.in);
        System.out.println("Bolunecek tam sayiyi girin");
        int a= scan.nextInt();

        System.out.println("Bolecek tam sayiyi girin");
        int b= scan.nextInt();

        System.out.println("Bolumu double'a atama yaparsak:" + (a/b)); // 3
        // iki bolumdeki sayi da int oldugundan sonucta int cikar

        double dogruSonuc= (double)a/b; // 15.0/4= 3.75 yapar.
        System.out.println("Dogru Sonuc icin bir sayiyi Double Cast yapinca; "+ dogruSonuc);

    }
}
