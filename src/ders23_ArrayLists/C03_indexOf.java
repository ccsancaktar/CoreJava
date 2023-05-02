package ders23_ArrayLists;

import java.util.ArrayList;
import java.util.List;

public class C03_indexOf {
    public static void main(String[] args) {

        List<String> urunler = new ArrayList<>();
        urunler.add("Nutella");
        urunler.add("Ikram");
        urunler.add("Cekirdek");
        urunler.add("Cay");

        System.out.println(urunler);
        System.out.println(urunler.indexOf("Ikram")); // 1
        System.out.println(urunler); // [Nutella, Ikram, Cekirdek, Cay]

        /*
        indexOf methodu bize sadece bilgi donduren bir methoddur.
        Listemizi degistirmez.
         */

        System.out.println(urunler.lastIndexOf("Ikram"));
        /*
        indexOf methodu ürünü aramaya Sifirinci indexten
        lastIndexOf methodu ise aramaya son indexten baslar.

        arama bitip ürün bulundugunda
        ikiside bulunan ürünün indexini verir.
         */

        urunler.add("Ikram");
        System.out.println(urunler); // [Nutella, Ikram, Cekirdek, Cay, Ikram]
        System.out.println(urunler.indexOf("Ikram")); // 1
        System.out.println(urunler.lastIndexOf("Ikram")); // 4


        System.out.println(urunler.indexOf("Seftali")); // -1 (yok)
        System.out.println(urunler.lastIndexOf("Seftali")); // -1 (yok)

    }
}
