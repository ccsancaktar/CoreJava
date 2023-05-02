package ders23_ArrayLists;

import java.util.ArrayList;
import java.util.List;

public class C01_Lists {
    public static void main(String[] args) {

        List<Integer> sayilar = new ArrayList<>();
        sayilar.add(5);
        sayilar.add(6);
        sayilar.add(7);
        sayilar.add(8);

        System.out.println("Listenin Boyutu: " + sayilar.size()); // 4

        sayilar.add(9);
        sayilar.addAll(sayilar);
        System.out.println(sayilar); // [5, 6, 7, 8, 9, 5, 6, 7, 8, 9]
        System.out.println("Listenin Yeni Boyutu: " + sayilar.size()); // 10

        sayilar.set(2,12); // ikinci indexteki elementi Sekize cevir.
        System.out.println(sayilar); // [5, 6, 12, 8, 9, 5, 6, 7, 8, 9]

        System.out.println(sayilar.set(0,12)); // 5
        System.out.println(sayilar); // [12, 6, 12, 8, 9, 5, 6, 7, 8, 9]
        /*
        Set methodu istenen indexteki eski elementi silip
        yerine verdigimiz yeni elementi set eder.

        eger eski elementi silmek istemiyorsak,
        add methodu (index,deger) kullanabiliriz.

        set() methodu sildigi eski elementi bize döndürür.
         */
    }
}
