package ders29_PassByValue_Immutable;

import java.util.Arrays;
import java.util.Random;

public class C01_PassByValue {
    public static void main(String[] args) {
        /*
        4 Elemanli bir array olusturalim,
        sonra ayri bir method'da,
        bu arrayin 2. ve 4. elemanlarini
        100'den kucuk rastgele bir sayi ile degistirelim.
        ve yeni halini direk yazdiralim.
         */

        int[] arr={5,7,8,10};

        elemanDegistir(arr);

        System.out.println("Main method icinde diger method calistiktan sonra: " + Arrays.toString(arr));
    }

    public static void elemanDegistir(int[] arr) {

        Random rnd = new Random();
        arr[1]= rnd.nextInt(100);
        arr[3]= rnd.nextInt(100);
        System.out.println("Method'un icinde: " + Arrays.toString(arr)); // (88 ve 7)
    }

}
