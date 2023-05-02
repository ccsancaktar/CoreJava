package ders19_DoWhileLoop_Scope;

public class C05_LocalVariable {
    public static void main(String[] args) {
        /*
            1- Bir method icerisinde olusturulan variable'in scope'u o methoddur.
                baska bir methoddankullanilamaz.
                bu variable'lara Local Variable denir.

            2- Her ne kadar bir method icinde olsalar da,
                Loop'larin da bir scope'u vardir.
                Loop icerisinde olusturulan variable'lar
                Loop disinda kullanilamazlar.

            3- Local Variable'lari deger atamadan olusturabiliriz
                ancak deger atamadan kullanamayiz.
         */

        String isim = "Ali Can";
        // sayi++;

        for (int i = 0; i < 10; i++) {
            int j = i + 1;
        }
        // System.out.println(i + j);

    }

    public static void baskaMethod(){
        //System.out.println(isim);
        int sayi = 5;
    }

}
