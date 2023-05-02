package ders24_ArrayList_ForEachLoop;

public class C06_ArraydekiSayilarinKareToplami {
    public static void main(String[] args) {
        // SORU - Bir arraydeki tüm sayilarin karesinin toplamini
        // ForEachLoop ile bulunuz ve sonucu ekrana yazdiriniz

        int[] sayilar = {2,3,4,1,5,7,6,5,4,3};
        int toplam = 0;

        for (int each: sayilar
             ) {
            toplam += each * each;
        }

        System.out.println("Kareler Toplami: " + toplam);
    }
}
