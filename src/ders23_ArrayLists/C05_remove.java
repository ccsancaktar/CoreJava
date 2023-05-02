package ders23_ArrayLists;

import java.util.ArrayList;
import java.util.List;

public class C05_remove {
    public static void main(String[] args) {

        List<Integer> sayilar = new ArrayList<>();
        sayilar.add(5);
        sayilar.add(3);
        sayilar.add(2);
        sayilar.add(1);

        System.out.println(sayilar); // [5, 3, 2, 1]

        sayilar.remove(1);
        /*
        Sayilardan olusan bir list varsa
        Java remove methodunda sayi yazdigimizda direk index olarak kabul eder.
         */

        System.out.println(sayilar); // [5, 2, 1]

        // illa da 5'i silsin istiyorum.
        // Silinecek objeyi bir variable'a atar öyle remove calistiririm.

        Integer sil = 5;
        sayilar.remove(sil);
        System.out.println(sayilar); // [2, 1]

        // veya indexOf methodundan yardim alabilirim
        // Örnegin 2yi silmek icin 2'nin indexini bulup onu remove"a yazabiliriz.

        sayilar.remove(sayilar.indexOf(2));
        System.out.println(sayilar); // [1]

    }
}
