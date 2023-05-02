package ders20_Scope_Arrays;

import java.util.Arrays;

public class C03_ArrayElementleriniYazdirma {
    public static void main(String[] args) {

       int[] arr = {3, 5, 6, 7, 8, 1, 2};

        // Tüm Array'i yazdirin.

        System.out.println(Arrays.toString(arr)); // [3, 5, 6, 7, 8, 1, 2]

        // Array'in tüm elementlerini yanyana, arada bir bosluk olarak yazdirin.

        for (int i = 0; i < arr.length ; i++) {
            System.out.print(arr[i]+" ");
        }

    }
}
