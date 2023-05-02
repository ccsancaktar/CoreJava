package ders34_Inheritance;

public class Isci extends Personel {
    /*
    Normal hayatta parent cocuk sahibi olmaya karar verebilir.
    Java'da ise Child class'lar ozelliklerini Inherit etmek istedikleri
    Class'i kendilerine parent edinirler.

    Mesela isci class'ini olusturunca nelere ihtizaci var diye dusunursek,
    Personel Class'indaki tüm variable ve method'lara ihtiyaci
    oldugunu gorebiliriz.
    Bu durumda yeniden yeniden variable ve method olusturmak yerine,
    Personel Class'ini kendimize parent ediniriz.

    Bir class'i parent edinmek icin extends keyword kullanmaliyiz.

     Bir class baska bir class'i parent edindiginde;
     1- Parent Class'daki tüm ozelliklere (variable+method) sahip olur.
     2- Parent Class'daki ozelliklerden bazilarini kendine uyarlayabiir.
     3- Parent Class'da olmayan bazi yeni ozellikler olusturabilir.
     not: Parent Class'daki ozellikler reddedilemez ama degistirilebilir.
     */
    int personelNo = 1001;

    public static void main(String[] args) {
        Isci Isci1 = new Isci();
        // Kendi class'imizda isim yok, o yüzden parent'e gider.
        System.out.println(Isci1.isim); // Isim Belirtilmedi
        Isci1.isim = "Sancak";
        System.out.println(Isci1.personelNo); // 1001 - kendi classimizda varsa onu kullaniriz.

        Isci1.maas(); // Isciler minimum 15 euro maas ücreti alir.
    }

    public void maas(){
        System.out.println("Isciler minimum 15 euro maas ücreti alir.");
    }

    public void ozelSigorta (){
        System.out.println("Iscilere %50 indirimli sigorta yaptirilir");
    }

}
