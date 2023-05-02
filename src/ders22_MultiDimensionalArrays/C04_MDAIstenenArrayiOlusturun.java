package ders22_MultiDimensionalArrays;

import java.util.Arrays;

public class C04_MDAIstenenArrayiOlusturun {
    public static void main(String[] args) {

        /*
        Asagidaki Multi Dimensional Arrayin,
        ic arraylerindeki tüm elemanlarin toplamlarini birer birer bulan
        ve her bir sonucu yeni bir arrayin elemani yapan,
        ve yeni arrayi ekrana yazdiran bir program yaziniz.

        Örnek; { {1,2,3}, {4,5} , {6,7} } ==> 2+2+3=6 4+5=9 6+7=13 ==> output: {6, 9, 13}

         */

        int[][] input = {{1,2,3},{4,5},{6,7}};
        int[] yeniArray = new int[input.length];
        int toplam = 0;

        for (int i = 0; i < input.length; i++) { // dis loop outer Array'de etkili.
            for (int j = 0; j < input[i].length; j++) { // ic loop ise inner Arrayleri gezer.

               toplam += input[i][j];
            }
            yeniArray[i] = toplam;
            toplam = 0;
        }

        System.out.println("Istenen yeni array: " + Arrays.toString(yeniArray));

    }
}
