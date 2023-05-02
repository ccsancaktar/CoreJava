package ders20_Scope_Arrays;

import java.util.Arrays;

public class C02_Arrays {
    public static void main(String[] args) {

        String[] isimler = {"Nurefsan","Berke","Mustafa"};
        int[] sayilar = {1,2,3,4,5,6,7};
        char[] karakterler = {'a','b','c'};

        // Array non-primitive data türlerindendir
        // Eger array'i liste seklinde olusturmayip
        // new keyword olusturuyorsak,
        // Uzunlugunu olusturmak ZORUNDAYIZ!

        String[] arr = new String[5];

        // bir array tanimlanan uzunluktan daha fazla yada az eleman alamaz.

        // bir array'i yazdirmak istersek
        // Array'ler direk yazdirilamaz
        System.out.println(isimler); // [Ljava.lang.String;@75bd9247

        System.out.println(Arrays.toString(sayilar)); // [1, 2, 3, 4, 5, 6, 7]

        System.out.println(Arrays.toString(arr)); // [null, null, null, null, null]

        int[] a = new int[7];
        System.out.println(Arrays.toString(a)); // [0, 0, 0, 0, 0, 0, 0]

        // Array'deki elementlere nasil ulasiriz? Index ile.

        a[0] = 4; // [4, 0, 0, 0, 0, 0, 0]
        a[3] = 7; // [4, 0, 0, 7, 0, 0, 0]
        //a[7] = 8; // ArrayIndexOutOfBoundsException
        System.out.println(Arrays.toString(a));

        // sayilar Array'inin 4. indexindeki elementi yazdirin
        System.out.println(sayilar[4]); // 5

        // isimler Array'inin 1. indexindeki ismi yazdirin
        System.out.println(isimler[1]); // Berke
    }
}
