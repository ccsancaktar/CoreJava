package ders22_MultiDimensionalArrays;

import java.util.ArrayList;
import java.util.List;

public class C08_AddAll {
    public static void main(String[] args) {

        List<Integer> sayilar = new ArrayList<>();
        sayilar.add(5);
        sayilar.add(3);
        sayilar.add(2);

        List<Integer> sayilar2 = new ArrayList<>();
        sayilar2.add(10);
        sayilar2.add(15);
        sayilar2.add(16);
        sayilar2.add(20);

        sayilar.addAll(sayilar2);
        System.out.println(sayilar); // [5, 3, 2, 10, 15, 16, 20]

        sayilar.addAll(1,sayilar2);
        System.out.println(sayilar); // [5, 10, 15, 16, 20, 3, 2, 10, 15, 16, 20]

        // bir listenin sonuna veya istedigimiz bir indexine,
        // baska bir collection ekleyebiliriz.
    }
}
