package ders35_InheritancedaConstructorKullanimi;

public class BParent extends AGrandParent {
    protected String isim = "isim belirtilmedi";
    protected String parentKlupAdi = "Parent Klubü";

    BParent(){
        System.out.println("Parent constructor calisti");
    }
}
