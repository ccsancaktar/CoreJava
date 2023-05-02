package ders21_Arrays;

import java.util.Arrays;

public class C08_BinarySearch {
    public static void main(String[] args) {
        /*
        binarySearch, javada eleman aramanin kisa yoludur.
        Ancak, binarySearch'ün calismasi icin önce
        Array'in sirali hale getirilmesi gerekir.
        Eger siralamadan binarySearch yaparsak,
        sonucu bulamayabilir yada yanlis bulabilir.
         */

        String[] harfler = {"Y", "B", "D", "G", "O", "A"};

        String arananHarf = "Y";

        System.out.println(Arrays.binarySearch(harfler,arananHarf)); // -7 Yanlis

        // binarySearch bize aradigimiz elemanin indexini döndürür (int).
        // Array sirali olmadigi icin arama sonucunu dogru buamayabilir.
        // emin olmak icin önce SORT yapmaliyiz.

        Arrays.sort(harfler); // Siraladik
        System.out.println(Arrays.toString(harfler));
        System.out.println(Arrays.binarySearch(harfler, arananHarf)); // 5 Dogru
    }
}
