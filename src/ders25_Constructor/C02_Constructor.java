package ders25_Constructor;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class C02_Constructor {
    public static void main(String[] args) {

        C01         obj1        = new           C01()   ;
   // class adi, objenin adi,   keyword     constructor

        Scanner scan = new Scanner(System.in);
        Random rnd = new Random();
        List<String> list = new ArrayList<>();

        /*
        Javada bir obje olusturabilmek icin
        mutlaka constructor kullanmalisiniz.

        Ayni kalibi (class) kullanarak,
        constructorlar ile birden fazla obje uretebiliriz.
         */


        System.out.println(obj1.sayi); // 0
        obj1.deneme(); // C01'den deneme mthodu calisir
    }
}
