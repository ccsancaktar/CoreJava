package ders13_stringManipulation;

import java.util.Random;

public class C06_Length {
    public static void main(String[] args) {

        String str = "Java her gecen gun daha da guzellesiyor";

        // sondan 3. karakteri yazdirin

        System.out.println(str.charAt(str.length()-3)); // y

        System.out.println(str.length()); // 39

        // rastgele bir karakteri yazdiralim (KONU DISI)

        Random rnd = new Random(); // rnd degeri icin 0 ile 1 arasinda Rastgele bir deger olusturur
        int index = rnd.nextInt(str.length()); // str.length'den kucuk bir int uretir

        System.out.println(str.charAt(index));
    }
}
