package ders24_ArrayList_ForEachLoop;

import java.util.ArrayList;
import java.util.List;

public class C01_ArraydenArrayListYapmak {
    public static void main(String[] args) {

        String[] arr = {"Ahmet", "Mehmet", "Veli", "Murat"};
        /*
        Uzun listeler olusturmak gerektiginde
        tek tek eklemek yerine, bunlari List'e cevirmek
        daha pratik olacaktir.
         */

        List<String> sinifListesi = new ArrayList<>();

        for (int i = 0; i < arr.length; i++) {
            sinifListesi.add(arr[i]);
        }
        System.out.println(sinifListesi); // [Ahmet, Mehmet, Veli, Murat]
    }
}
