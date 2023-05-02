package ders19_DoWhileLoop_Scope;

import java.util.Scanner;

public class C04_doWhileLoop {
    public static void main(String[] args) {
        // kullanicidan toplanmak uzere sayilar alin
        // kullaniciya bitirmek icin sifira basmasini soyleyin
        // sifira basildiginda, sifir haric kac sayi girildigini ve toplamlarini yazdirin

        Scanner scan = new Scanner(System.in);

        int girilenSayi = 1;
        int toplam = 0;
        int sayiAdedi = 0;

        while(girilenSayi !=0){
            System.out.println("Toplanmak uzere tam sayi giriniz" +
                    "\nBitirmek icin sifira basiniz");
            girilenSayi = scan.nextInt();

            if (girilenSayi!=0){
                toplam += girilenSayi;
                sayiAdedi++;
            }

        }

        System.out.println("Girilen " + sayiAdedi + " adet sayinin toplami: " + toplam);

    }
}
