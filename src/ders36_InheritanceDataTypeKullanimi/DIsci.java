package ders36_InheritanceDataTypeKullanimi;

import javax.swing.tree.DefaultMutableTreeNode;

public class DIsci extends BMuhasebe {
    protected int saatUcreti = 11;
    protected int gunlukMesai = 7;

    protected void maasIsci (){
        System.out.println("Isciler: " + (30*gunlukMesai*saatUcreti) + " maas alir.");
    }

    protected void ozelSigortaIsci (){
        System.out.println("Isciler %70 indirimli ozel sigorta yaptirabilir.");
    }

    public static void main(String[] args) {
        BMuhasebe isc1 = new DIsci();
        // Iscinin, Muhasebedeki ozellikleri

        /*
        Bir obje olusturulurken
        data türü ve constractor ayni class'tan ise,
         direkt o class'a gidiyorduk.

         Eger data türü ve constractor farkli ise,
         Obje, Constructor'un oldugu class'in objesidir.
         ancak bizden istenen,
         Isci class'indaki ozellikleri degil,
         Bir iscinin Muhasebe Class'indaki
         tüm calisanlarla birlikte sahip oldugu
         genel ozellikleri yazdirir.
         */

        System.out.println(isc1.gunlukMesai); // M 8
        System.out.println(isc1.saatUcreti); // M 10
        isc1.maas(); // M Personel minimum: 2400 maas alir.
        isc1.ozelSigorta(); // M %50 indirimli ozel sigorta yapilir
        isc1.sigorta(); // P
        System.out.println(isc1.isim); // P
        System.out.println(isc1.soyisim); // P
        System.out.println(isc1.departman); // P

        APersonel isc2 = new DIsci();

        // System.out.println(isc2.gunlukMesai); // M 8
        // System.out.println(isc2.saatUcreti); // M 10
        isc2.maas(); // M Personel minimum: 2400 maas alir.
        // isc2.ozelSigorta(); // M %50 indirimli ozel sigorta yapilir
        isc2.sigorta(); // P
        System.out.println(isc2.isim); // P
        System.out.println(isc2.soyisim); // P
        System.out.println(isc2.departman); // P

        /*
        Eger data türü olan class'ta aradigimiz ozellik yoksa
        parentine gidebilir (Parnt varsa.)
        ama Child'a donus olmaz.
        Aradigi ozelligi bulamazsa CTE verir.
         */
    }
}
