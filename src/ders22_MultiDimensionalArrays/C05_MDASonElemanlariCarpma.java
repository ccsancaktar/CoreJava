package ders22_MultiDimensionalArrays;

import java.util.Arrays;

public class C05_MDASonElemanlariCarpma {
    public static void main(String[] args) {
        /*
        Asagidaki multi dimensional array'in
        ic arraylerindeki son elemanlarin carpimini
        ekrana yazdiran bir program yaziniz
        Örnegin; { {1,2,3} , {4,5} , {6} }
         */

        int[][] arr = { {1,2,3} , {4,5,2} , {6,3} };

        int carpim = 1;

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {

                if (j==arr[i].length-1){

                    carpim *= arr[i][j];
                }
            }
        }
        System.out.println("Son Elemanlarin carpimi: " + carpim);
    }
}
