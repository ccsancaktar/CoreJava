package ders30_Immutable_Date;

import java.time.LocalTime;

public class C05_StringVsStringBuilder {
    public static void main(String[] args) {
        /*
        String mi yoksa String Builder mi daha hizlidir?
        bunun icin bir String olusturup, sonuna 1000 adet nokta ekleyelim.
        Önceki ve sonraki zamani alip ortadaki farki görelim.

        Ayni islemi String builder icin de yapalim ve farki gorelim.
         */

        LocalTime baslangic = LocalTime.now();

        String str = "Ahhh Java";
        for (int i = 0; i < 1000; i++) {
            str+=".";
        }

        LocalTime bitis = LocalTime.now();

        System.out.println(baslangic);
        System.out.println(bitis);

        System.out.println("String Zaman: " + (bitis.getNano() - baslangic.getNano()));



        ///// String Builder /////

        baslangic = LocalTime.now();

        StringBuilder sb = new StringBuilder("Ahhh Java");
        for (int i = 0; i < 1000; i++) {
            sb.append(".");
        }

        bitis = LocalTime.now();

        System.out.println(baslangic);
        System.out.println(bitis);

        System.out.println("String Builder Zaman: " + (bitis.getNano() - baslangic.getNano()));
    }
}
