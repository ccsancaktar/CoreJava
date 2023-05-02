package ders15_stringManipulation;

public class C01_NullPointer {
    public static void main(String[] args) {

        String str1 = "";
        String str2 = "    ";
        String str3;
        String str4 = null;

        System.out.println(str1.length()); // 0
        System.out.println(str2.length()); // 4

        System.out.println(str1.isEmpty()); // true
        System.out.println(str2.isEmpty()); // false

        System.out.println(str1.isBlank()); // true
        System.out.println(str2.isBlank()); // true

        // Null bir deger degil isaretcidir. "Null Pointer"
        // Null Pointer, non-primitive bir objenin olusturuldugunu
        // Ancak bilincli olarak deger atanmadigini isaretler.
        // str4'ün degeri Null'dir cumlesi yanlis, Null olarak isaretlenmistir dogru.

        //System.out.println(str3.length());
        //System.out.println(str3.concat("Ali Can"));
        //System.out.println(str3.substring(3, 4));

        /*
            Java bir variable'i olusturup, deger atanmamasina izin verir.
            Bir variable'i deger atamadan olusturabilirisiniz fakat kullanamazsiniz.
            Kullanmaya calisirsaniz, java CTE verir.

            Null Pointer ise bu variable'a bir deger atanamadigini ve
            bunun bilincli bir tercih oldugunu Javaya soyler,
            dolayisiylsa Java kodlarin calismasina izin verir.
            Ancak deger atanamadigi icin methodlrla kullanmaya calisirsaniz NPE verir.
         */

        str4 = null;
        //System.out.println(str4.length()) // Null Pointer Exception
        //System.out.println(str4.substring(3, 4)); // Null Pointer Exception

        System.out.println(str4); // null yazdirir
        System.out.println(str4 + "Ali Can"); // nullAli Can yazdirir
        System.out.println(str4.concat("Ali Can")); // Null Pointer Exception
    }
}
