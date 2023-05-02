package ders36_InheritanceDataTypeKullanimi;

public class EYanHizmetliler extends BMuhasebe {

    protected int saatUcreti = 9;
    protected int gunlukMesai = 8;

    protected void maas (){
        System.out.println("Yan Hizmetliler: " + (30*gunlukMesai*saatUcreti) + " maas alir.");
    }

    protected void issizlikSigorta(){
        System.out.println("Yan hizmetliler %30 indirimli issizlik sigortasi yaptirabilir.");
    }

    public static void main(String[] args) {
        /*
        Overriding Child Class'daki bir Methodun
        parent Class'daki ayni isimdeki methodu
        etkisiz hale getirerek,
        kendisinin spesifik ozelligini ortaya cikarmasidir.

        !!! Overriding'i Nerede dikkate aliyoruz? !!!
        Bir obje olusturulurken,
        data türü ve cons. farkli ise dikkate aliyoruz.

        Eger bir obje olusturulurken data türü ve cons
        farkli ise objenin ozelliklerini belirlerken
        3 konuya dikkat cekmeliyiz.

        1- Obje, Constructor'un oldugu class'ta olusur.
        2- Objenin ozelliklerini aramaya data türünün oldugu Class'Dan baslariz
                bu class'da aranan ozellik bulunamazsa, Parent Class'a bakilir.
                orada da bulamazsak o zaman CTE verir.
        3- Eger aranan ozellik "variable' ise buldugumuz ilk degeri yazdiririz.
               Eger aranan ozellik method ise degeri yazdirmadan once
               override edilmis mi diye kontrol etmemiz gerekir.
               eger override edildiyse en güncel degeri yazdiririz.
         */

        BMuhasebe yh1 = new EYanHizmetliler();

        System.out.println(yh1.gunlukMesai); // M 8
        System.out.println(yh1.saatUcreti); // M 10
        yh1.maas(); // YH Yan Hizmetliler: 2160 maas alir.
        yh1.ozelSigorta(); // M %50 indirimli ozel sigorta yapilir
        yh1.sigorta(); // P Tüm personele sigorta yapilir
        System.out.println(yh1.isim); // P
        System.out.println(yh1.soyisim); // P
        System.out.println(yh1.departman); // P
        // System.out.println(yh1.issizlikSigorta);
        // Aramaya Muhasebeden basladigimizdan
        // issizlikSigortasi bulamadigimiz icin CTE verir.
    }
}
