package ders23_ArrayLists;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class C09_ArraydenListYapmak {
    public static void main(String[] args) {

        /*
        List ile calisirken en kötü özellik
        elemanlarin tek tek eklenmesidir.
         */

        Integer[] arr = {2,3,5,6,8,4,2,6,9,8,1,3,6,4,2,7,8};
        /*
        Bu kadar cok elemanli bir listeyi
        tek tek eleman olarak girmek yerine
        array olusturup, forLoop ile
        olusturdugumuz list'e tasiyabiliriz
         */

        List<Integer> sayilar = new ArrayList<>();

        for (int i = 0; i < arr.length; i++) {
            sayilar.add(arr[i]);
        }

        System.out.println(sayilar); // [2, 3, 5, 6, 8, 4, 2, 6, 9, 8, 1, 3, 6, 4, 2, 7, 8]

        /*
        Bu islemi yapmasi icin javanin olusturdugu bir method da var
        ancak bu yontemin cok yan etkisi var.

        1- Bu sekilde olusturulan listede add. remove. gibi size'i degistiren methodlar KULLANILAMAZ.
        2- AsList methodu ile olusturulan liste ve kaynak olan Array
        birbiri ile ilisik olarak hayatlarina devam ederler.
        Birinde yaptigimiz degisiklik, otomatik olarak digerine de isler.
         */

        List<Integer> sayilar2 = Arrays.asList(arr);
        System.out.println(sayilar2); // [2, 3, 5, 6, 8, 4, 2, 6, 9, 8, 1, 3, 6, 4, 2, 7, 8]

        sayilar.add(5);
        System.out.println(sayilar); // [2, 3, 5, 6, 8, 4, 2, 6, 9, 8, 1, 3, 6, 4, 2, 7, 8, 5]

        /*
         sayilar2.add(5); // KULLANILAMAZ!
         System.out.println(sayilar2);
         Exception verdigi icin yoruma aldik.
         */

        arr[0]=20;
        System.out.println(Arrays.toString(arr)); // [20, 3, 5, 6, 8, 4, 2, 6, 9, 8, 1, 3, 6, 4, 2, 7, 8]
        System.out.println("Array'de degisiklik yapinca Sayilar2 = " + sayilar2); // [20, 3, 5, 6, 8, 4, 2, 6, 9, 8, 1, 3, 6, 4, 2, 7, 8]

    }
}
