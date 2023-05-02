package ders24_ArrayList_ForEachLoop;

import java.util.ArrayList;
import java.util.List;

public class C07_OrtakElemanlariBul {
    public static void main(String[] args) {

        // SORU - Iki string array olusturunuz ve bu arraylerdeki
        // ortak elemanlari ForEach kullanarak bulunuz. Sonucu ekrana yazdirin
        // ortak eleman yoksa, Ortak eleman yok yazdirin.

        String[] arr1 = {"Cagatay", "Murat", "Veli", "Mehmet"};
        String[] arr2 = {"Ahmet", "Mehmet", "Ayse", "Cagatay"};

        List<String> ortakIsimler = new ArrayList<>();

        for (String each1: arr1
             ) {
            for (String each2: arr2
                 ) {

               if (each1.equalsIgnoreCase(each2)){
                   ortakIsimler.add(each1);
               }
            }
        }

        if (ortakIsimler.isEmpty()){
            System.out.println("Hic ortak eleman yok");
        } else {
            System.out.println("Her iki arraydeki ortak isimler: " + ortakIsimler);
        }
    }
}
