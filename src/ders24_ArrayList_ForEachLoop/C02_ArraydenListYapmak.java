package ders24_ArrayList_ForEachLoop;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class C02_ArraydenListYapmak {
    public static void main(String[] args) {
        /*
        icinde 200 tane 1000'den kucuk pozitif tam sayi olan bir list olusturun
        kullanicidan bir sayi isteyip, listede var olup olmagidini kullaniciya yazin
         */

        Random rnd = new Random();
        int sayi = 0;
        List<Integer> sayiListesi = new ArrayList<>();

        while (sayiListesi.size()<200){
            sayi = rnd.nextInt(1000);
            if (!sayiListesi.contains(sayi)){
                sayiListesi.add(sayi);
            }
        }

        // Yukarida listeye 200 sayi ekledik.
        // Asagida ise kullanicidan sayi isteyip,
        // listede var olup olmadigini kontrol ettirdik.

        boolean bildiMi = false;
        int tahminSayisi = 1;

        Scanner scan = new Scanner(System.in);

        while (!bildiMi){ // yahut, "bildiMi==false"

            System.out.println("Lütfen bir sayi tahmininde bulunun:");
            sayi = scan.nextInt();

            if(sayiListesi.contains(sayi)){
                System.out.println("Tebrikler! " + tahminSayisi + " adet tahminde listeden bir sayi buldunuz.");
                bildiMi=true;
            } else {
                System.out.println(tahminSayisi + " adet sayi söylediniz fakat hicbiri listede yok.");
                tahminSayisi++;
            }
        }


    }
}
