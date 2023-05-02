package ders42_AbstractClass_Interfaces;

public interface I02_Interfaces {

    int SAYI = 30;
    String ISIM = "Sancak";

    /*

    Interface bir class degildir.

    Abstract class'lar java'da abstraction (soyutlastirma / kural koyma)
    isini yapiyordu. Ancak abstract bir class'da abstract olmayan methodlarda olabilir.
    Bu da full abstraction yapmaya izin vermez.

    Eger java'da icinde hic concrete method olmasin
    dedigimiz bir class olusturmak istiyorsaniz,
    bunu class degil, interface yapmalisiniz.

    1- INTERFACE'DE CONCRETE METHOD OLMAZ!
    2- Interace'ler full abstraction yaptigindan, interface'lerden obje olusturulamaz.

        Hatirladigimiz gibi interface olan List'ten direk obje olusturamiyorduk.
        List<String> liste = newList<>(); => calismaz.
        Bunun yerine constructor'i list'in child'i olan ArrayList'den seceriz.
        List<String> liste = new ArrayList<>(); => calisir

    3- Class'larda bir child birden fazla parent edinemez.
       Ancak, interface'lerde concrete method olmadigindan,
       biz her methodu, child class'ta override etmek zorundayiz.
       Override ederken, kimin soyledigini override ettigimizin onemi yoktur.

    4- Interface'ler neyin yapilmasi gerektigini soyler,
        ama nasil yapilacagina karismaz.

    */

}
