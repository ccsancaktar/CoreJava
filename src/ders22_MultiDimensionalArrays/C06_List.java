package ders22_MultiDimensionalArrays;

import java.util.ArrayList;
import java.util.List;

public class C06_List {
    public static void main(String[] args) {

        /*
        Array'i array yapan sembol [] idi.
        arrayList'te ise <> diamond(elmas) kullaniyoruz.
         */

        List<String> isimler = new ArrayList<>();
        System.out.println(isimler); // []

        // Bir list'e eleman eklemek istersek;
        isimler.add("Basak");

        System.out.println(isimler.add("Ayse")); // true döner

        /*
        String'De bir method calistirdigimizda
        assign yapmazsak, String degismiyordu.

        String isim = "Sancak"
        isim.toUpperCase(); // SANCAK
        sout(isim) ==> Sancak

         */

        System.out.println(isimler); // [Basak, Ayse]

        /*
        List'in tek kötü tarafi Array altyapisini kullandigi icin
        elemanlari birer birer eklemek zorunda olmamizdir.
         */


    }
}
