package ders18_methodOverloading_whileLoop;

public class C05_ForLoop {
    public static void main(String[] args) {
        /*
        Baslangic ve bitis degeri belli olan veya
        kac kere tekrar edilecegi bilinen Looplarda
        ForLoop ideal olara kullanilabilir.

        Ancak, Tekrar sayisi belli olmayan.
        Baslangic ve bitisi baska bir variable'a bagli olan durumlarda
        ForLoop yerine WhileLoop tercih edilir.
         */

        // 50 ve 100 arasindaki (sinirlar dahil) sayilari toplayin

        int toplam = 0;

        for (int i = 50; i <= 100 ; i++) {
            toplam += i;
        }

        System.out.println("ForLoop ile Toplam: " + toplam);

        // Ayni soruyu WhileLoop ile yapalim;
        // ForLoop'da üc seyi takip ederiz;
        // Balnagic degeri, Bitis sarti ve Artis veya azalis sekli

        toplam = 0;
        int sayi = 50;

        while (sayi <= 100){

            toplam += sayi;

            sayi++;
        }

        System.out.println("While ile toplam: " + toplam);

    }
}
