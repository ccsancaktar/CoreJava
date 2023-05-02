package ders21_Arrays;

import java.util.Arrays;

public class C09_BinarySearch {
    public static void main(String[] args) {
        /*
        binarySearch methodu siralanmis array'de aradigimiz elementin indexini döndürür.

        Ya aradigimiz element array'de yoksa ?
        (String'de indexOf bize olmayan elementler icin -1 döndürürdü.)

        Aradigimiz element arrayde yoksa, Java hem olmadigini,
        hem de olsaydi nerede olacagini bize döndürür.

        Olmadigini ifade etmek icin "-" (eksi isareti) kullanir.
        olsaydi nerede olacagini ifade etmek icin index degil siralama kullanir.
        Sira, indexteki sifirdan degil 1'den baslar.

        */

        int[] sayilar = {3,7,15,4,27,10};

        Arrays.sort(sayilar);

        System.out.println(Arrays.toString(sayilar)); // [3, 4, 7, 10, 15, 27]

        // !!! Arrayde var olanlarda index, yok olanlarda -sira gecerli. !!!

        System.out.println(Arrays.binarySearch(sayilar,5)); // -3

        System.out.println(Arrays.binarySearch(sayilar,11)); // -5

        System.out.println(Arrays.binarySearch(sayilar,6)); // -3

        System.out.println(Arrays.binarySearch(sayilar,-100)); // -1
    }
}
