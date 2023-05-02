package ders22_MultiDimensionalArrays;

import java.util.ArrayList;
import java.util.List;

public class C09_Get {
    public static void main(String[] args) {

        List<Integer> sayilar = new ArrayList<>();
        sayilar.add(10);
        sayilar.add(15);
        sayilar.add(16);
        sayilar.add(20);

        List<String> isimler = new ArrayList<>();
        isimler.add("Cihan");
        isimler.add("Cagatay");
        isimler.add("Sancak");

        System.out.println(isimler.get(2)); // Sancak
        System.out.println(sayilar.get(3)); // 20
    }
}
