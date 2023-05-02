package ders21_Arrays;

import java.util.Arrays;

public class C07_Sort {
    public static void main(String[] args) {

        int[] sayilar = {5,7,1,5,7,9};

        // Array'i Arrays Classini kullanarak natural sirali hale getirebiliriz.
        Arrays.sort(sayilar);
        System.out.println(Arrays.toString(sayilar)); // [1, 5, 5, 7, 7, 9]


    }
}
