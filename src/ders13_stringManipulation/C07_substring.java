package ders13_stringManipulation;

public class C07_substring {
    public static void main(String[] args) {
        // COK KULLANILACAK METHOD

        String str = "Java ogren, isi kap";

        System.out.println(str.length()); // karakter sayisi: 19

        // Metnin tam ortasindaki karakter nedir?

        System.out.println(str.charAt(str.length()/2)); // n

        // Son karakteri yazdir

        System.out.println(str.charAt(str.length()-1)); // p

        // Bir karakteri degil de verilen Stringin icerdigi bir metin parcasini elde et
        // Ornek; "ögren" kelimesini yazdiralim

        System.out.println(str.substring(5, 9)); // ogre
        // Substring (baslangic,bitis) methodunda
        // baslangic olarak yazilan index dahil (inclusive),
        // bitis olarak yazilan index haric (exclusive)'dir.
        System.out.println(str.substring(5, 10)); // ogren

        // str'dan "Java" kelimesini yazdiralim
        System.out.println(str.substring(0,4)); // Java

        // str'dan "kap" yazdiralim
        System.out.println(str.substring(16,19)); // kap
        System.out.println(str.substring(16)); //kap
        System.out.println(str.substring(str.length()-3)); // kap

        // substring kullanarak sadece J harfini yazdirin.
        System.out.println(str.substring(0,1)); // J

        // substring kullanarak 9. indexdeki harfi Büyük olarak yazdir
        System.out.println(str.substring(9,10).toUpperCase()); // N
        System.out.println(str.toUpperCase().charAt(9)); // N
        //char(at) yerine substring kullanmak daha avantajli olabilir.
        // cunku substring kullaninca ifade hala string oldugundan
        // method kullanmaya devam edebiliriz

        System.out.println(str.substring(5,5)); // HICLIK YAZDIRIR (bos satir)
        System.out.println("========");

        System.out.println(str.substring(str.length())); // YINE HICLIK
        System.out.println("========");

    }
}
