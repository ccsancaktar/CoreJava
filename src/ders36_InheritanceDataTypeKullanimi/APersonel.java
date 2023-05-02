package ders36_InheritanceDataTypeKullanimi;

public class APersonel {

    protected String isim = "Isim berlirtilmedi";
    protected String soyisim = "Soyisim belirtilmedi";
    protected String departman = "Departman belirtilmedi";

    protected void maas (){
        System.out.println("Tüm personel maas alir");
    }

    protected void sigorta (){
        System.out.println("Tüm personele sigorta yapilir");
    }
}
