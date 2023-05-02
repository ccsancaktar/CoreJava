package ders19_DoWhileLoop_Scope;

public class C03_DoWhileLoop {

    public static void main(String[] args) {
        /*
        While Loop'da bitis sarti kontrolü her zaman bodyden 1 fazla calisir
        While loop'da kullanicidan alacagimiz degerlere once bizim deger atamamiz gerekir
            bu da bazen hatalara sebep olur.
         */

        int sayi = 13;
        int toplam = 0;

        while (sayi > 0){
            toplam += sayi*sayi;
            sayi--;
        }

        System.out.println("while toplam: " + toplam);

        ////////////////////////////////////////////////

        sayi = 13;
        toplam = 0;

        do {
            toplam += sayi*sayi;
            sayi--;
        } while (sayi>0);

        System.out.println("DoWhile toplam: " + toplam);

    }
}
