package ders23_ArrayLists;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class C07_sort {
    public static void main(String[] args) {

        List<String> urunler = new ArrayList<>();
        urunler.add("Nutella");
        urunler.add("Ikram");
        urunler.add("Cekirdek");
        urunler.add("Cay");

        Collections.sort(urunler);
        System.out.println(urunler); // [Cay, Cekirdek, Ikram, Nutella]

        /*
        List ile gelen sort methodunda siralama özelligini girmek gerekiyor
        Bunun yerine Collections classindan sort methodunu kullaniyoruz.
        Bu method listemizi natural order'a göre siralar. (Alfabetik sira)
         */

    }
}
