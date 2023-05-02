package ders24_ArrayList_ForEachLoop;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class C03_TekrarEdenSayilar {
    public static void main(String[] args) {
        // SORU - Verilen bir array'deki tekrar eden elementleri yazdirin

        int[] arr = {2,3,4,5,6,7,8,9,5,6,2,7,5,0,4,6};

        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr)); // [0, 2, 2, 3, 4, 4, 5, 5, 5, 6, 6, 6, 7, 7, 8, 9]

        List<Integer> tekrarEdenler = new ArrayList<>();

        for (int i = 0; i < arr.length-1; i++) {

            if(arr[i]==arr[i+1] && !tekrarEdenler.contains(arr[i])){
                System.out.print(arr[i] + " "); // 2 4 5 6 7
                tekrarEdenler.add(arr[i]);
            }

        }

    }
}
