package ders45_Collections;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class C01_Set {
    public static void main(String[] args) {
        // Verilen bir array'deki, tekrar eden elementleri silip
        // tekrarsiz halini array'e atayan bir kod yaziniz.

        int[] arr = {2,5,8,3,7,4,4,7,2,6,9,0,7,5,3,1,5,3,6,7};
        Set<Integer> tekrarsizSet = new HashSet<>();

        for (int each : arr
             ) {
            tekrarsizSet.add(each);
        }
        System.out.println("Set: " + tekrarsizSet);


        int[] tekrarsizArr = new int[tekrarsizSet.size()];
        int i = 0;
        for (Integer each : tekrarsizSet
             ) {
            tekrarsizArr[i]=each;
            i++;
        }

        arr = tekrarsizArr;
        System.out.println("Bizim array'in son hali: " + Arrays.toString(arr));

    }
}
