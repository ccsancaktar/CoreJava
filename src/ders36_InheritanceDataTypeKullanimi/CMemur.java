package ders36_InheritanceDataTypeKullanimi;

import java.util.ArrayList;

public class CMemur extends BMuhasebe {

    protected int saatUcreti = 12;
    protected int gunlukMesai = 9;

    protected void maas (){
        System.out.println("Memurlar: " + (30*gunlukMesai*saatUcreti) + " maas alir.");
    }

    protected void ozelSigorta (){
        System.out.println("Memurlar %60 indirimli ozel sigorta yaptirabilir.");
    }

    public static void main(String[] args) {

        CMemur mmr1 = new CMemur();
        System.out.println(mmr1.gunlukMesai); // 9
        System.out.println(mmr1.saatUcreti); // 12

        mmr1.maas(); // Memurlar: 3240 maas alir.
        mmr1.ozelSigorta(); // Memurlar: 3240 maas alir.
        
        mmr1.sigorta(); // Personel Parent
        System.out.println(mmr1.isim); // Personel Parent
        System.out.println(mmr1.soyisim); // Personel Parent
        System.out.println(mmr1.departman); // Personel Parent



        BMuhasebe mhsb1 = new BMuhasebe();
        /*
        Her ne kadar Memur Class'inin icinde olsam da
        olusturdugum obje Muhasebe Class'indan.
        Cünkü data türü ve Constractor ayni => BMuhasebe.

        String str = "Murat";
        ArrayList<Integer> list = new ArrayList<>();
        Integer sayi = 20;
        BMuhasebe Class'i da obje olusturulabilen bir Class, yani data türüdür.
         */

        System.out.println(mhsb1.gunlukMesai); // 8 - Muhasebe Parent
        System.out.println(mhsb1.saatUcreti); // 10 - Muhasebe Parent

        mhsb1.maas(); // 2400 maas alir. - Muhasebe Parent
        mhsb1.ozelSigorta(); // %50 indirimli ozel sigorta yapilir - Muhasebe Parent

        mhsb1.sigorta(); // Tüm personele sigorta yapilir - Personel Parent
        System.out.println(mhsb1.isim); // Personel Parent
        System.out.println(mhsb1.soyisim); // Personel Parent
        System.out.println(mhsb1.departman); // Personel Parent

    }
}
