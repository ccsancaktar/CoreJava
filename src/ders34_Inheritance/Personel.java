package ders34_Inheritance;

public class Personel {
    /*
    Eger parent class olacak sekilde tasarladiginiz bir class varsa
    veya ileride bu class'i parent yapmak isteyenler olabilir diyorsaniz,
    o zaman variable ve methodlarin access modifierlerini "Protected" yapmalisiniz.
     */

    protected int personelNo;
    protected String isim = "Isim Belirtilmedi";
    protected String departman = "Departman Belirtilmedi";

    protected  void maas(){
        System.out.println("Tüm Personelin Maasi Vardir");
    }

    protected  void mesai(){
        System.out.println("Tüm personel statüsüne göre mesai yapar");
    }

    protected  void fazlaMesaiUcreti(){
        System.out.println("Personel fazla mesai ucretini statüsüne gore alir");
    }

}
