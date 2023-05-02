package ders35_InheritancedaConstructorKullanimi;

public class AGrandParent {

    protected String isim = "Grandpa ismi belirtilmedi";
    /*
    Her class'ta görünmese de bir constructor vardir.
    Bu class'dan obje olusturmak istedigimizde,
    Default Constructor devreye girecektir.

    Default Constructor'u gözlemleyemeyecegimiz icin
    onun yerine kullanilabilecek parametresiz bir constructor olusturalim.
     */
    protected String grandpaKlupAdi = "Grandpa Klubu";

    AGrandParent(){
        System.out.println("Grandpa constructor calisti");
    }
}
