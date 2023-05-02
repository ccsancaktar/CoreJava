package ders22_MultiDimensionalArrays;

import java.lang.reflect.Array;
import java.util.Arrays;

public class C01_MDA {
    public static void main(String[] args) {
        /*
        Tek katli arraylerde Array'i direk yazdiramiyoruz.
        Cünkü, array Non-Primitive datatürüdür ve
        her non-primitive data direk yazdirilamayabilir.

        Ancak, Array icerisindeki elementleri direkt yazdirabiliyorduk.
        Cünkü genelde primitive data türü veya String elementler kullaniliyordu.

        Multi Dimensional Arraylerde en dikkat edeceigimiz konu,
        ulasmak istedigimiz elementin bir Array mi yoksa
        Primitive data mi oldugudur.
         */

        int[][] sayilar = {{1,2,4,5},{3,4}};

        /*
        Burada sayilar arrayini dusunursek icinde 2 tane inner Array var
        sayilar[0] ==> [1,2,4,5]

        Tek array icin Arrays.toString(sayilar) demek yeter fakat
        Birden fazla ic ice array var ise inner array indexi belirtmeliyiz.
        Örnek;    Arrays.toString(sayilar[0])
         */

        System.out.println(sayilar[0]); // [I@75bd9247
        System.out.println(Arrays.toString(sayilar[0])); // [1, 2, 4, 5]

        //Ancak en icerideki elementlere ulasirsak direk yazdirabiliriz.
        System.out.println(sayilar[0][1]); // 2
        // sifirinci inner arrayin, birinci indexindeki element.

        System.out.println(sayilar[1][0]); // 3
        // birinci inner arrayin, sifirinci indexindeki element

        System.out.println(Arrays.deepToString(sayilar)); // [[1, 2, 4, 5], [3, 4]]
        // Tüm multi arrayi yazdirmak icin. "Arrays.deepToString"


        /*
        Arrayi 2 sekilde deklare edebiliyorduk.
        1- elemanlari direk yazabiliriz.
        int[][] sayilar = {{1,2,4,5},{3,4}};

        2 - Outer ve Inner Arraylerin uzunluklarini belirterek olusturabiliriz.
         int[][] sayilar = new int[3][4]

         Ancak ikinci yöntem ile yaptigimizda, inner arraylarin farkli uzunlukta olma ihtimali kalmaz.
         Ikinci örnek icin, outer arrayin 3 tane inner arrayi vardir.
         Her bir inner arrayin ise 4er elemani vardir.

         Eger inner arraylari farkli uzunluka olusturmak istersek,
         ilk yontemi kullanmak zorundayiz.
         */

    }
}
