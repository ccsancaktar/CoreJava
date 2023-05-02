package ders29_PassByValue_Immutable;

import java.util.Arrays;
import java.util.Random;

public class C02_PassByValue {
    public static void main(String[] args) {
        /*
        Birden fazla element iceren ve Array / Arraylist gibi yapilarda
        PassByValue gecerlidir.

        Eger method'da array veya listin kendisi degistirilirse
        passByValue ozelligi sebebiyle Java degisen degeri degil
        array veya Listin orjinal degerini alir.

        Ancak Array veya List cegistirilmeden
        sadece icindeki elemanlar degistirilirse,
        Java obje degismedigi icin (referans ayni)
        ayni array veya Listi bize döndürür.
        Ancak icindeki elementler degismis olacaktir.
         */

        /*
        Verilen 4 elemanli bir arrayi methoda gonderelim
        method'da 3 elemanli yeni bir array atayip,
        bu yeni array'e rastgele 100'den kucuk 3 sayi atayalim.
        Metohod'da array'i yazdiralim,

        main method'ta da Method Call'dan sonra yeniden method'u yazdiralim.
         */

        int[] arr = {3,5,8,10};

        arrayDegistir(arr);

        System.out.println("Method Call'dan sonra main method'daki array: " + Arrays.toString(arr));

    }

    public static void arrayDegistir(int[] arr) {

        arr = new int[3];
        Random rnd = new Random();
        arr[0] = rnd.nextInt(100);
        arr[1] = rnd.nextInt(100);
        arr[2] = rnd.nextInt(100);

        System.out.println("Method'da array: " + Arrays.toString(arr));
    }
}
