package ders23_ArrayLists;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class C08_equals {
    public static void main(String[] args) {
        // equals() methodu ==> ... ile ... esit mi? sorusunu cevaplar

        List<String> urunler = new ArrayList<>();
        urunler.add("Nutella");
        urunler.add("Ikram");
        urunler.add("Cekirdek");
        urunler.add("Cay");

        List<String> urunler2 = new ArrayList<>();
        urunler2.add("Cekirdek");
        urunler2.add("Nutella");
        urunler2.add("Cay");
        urunler2.add("Ikram");

        System.out.println(urunler.equals(urunler2)); // false
        // Siralar esit olmadigindan "false verdi.
        // Sort ile siralari esitler ve sonra equals kullanirsak "true" aliriz.

        Collections.sort(urunler);
        Collections.sort(urunler2);

        System.out.println(urunler.equals(urunler2)); // true

    }
}
