package ders19_DoWhileLoop_Scope;

public class C02_RakamlarToplamiBulMethodu {

        // Verilen pozitif bir tam sayinin
        // rakamlar toplamini döndüren method olusturun

    public static int rakamlarToplaminiBul(int verilenSayi){

        int sayi = verilenSayi;
        int birlerBasamagi = 0;
        int rakamlarToplami = 0;

        int basamakSayisi = (sayi+"").length();

        for (int i = 1; i <= basamakSayisi; i++) {

            birlerBasamagi = sayi%10;
            rakamlarToplami += birlerBasamagi;
            sayi /= 10;

        }
        return rakamlarToplami;

    }
}
