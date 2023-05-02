package ders25_Constructor;

public class C01 {
    /*
    Java OOP Konsept kullandigi icin, olusturulan her bir classin,
    ihtiyac oldugunda, obje uretebilmesine uygun dizayn edilmistir.
    Ama her Class'tan obje üretilmeyebilir.

    Bunun icin, Java ihtiyac halinde kullanilabilmesi icin
    her class'da default bir contructor koymustur.

    vu default constructor,
    class'tan obje olusturuldugunda otomatik olara calisir.

    Örnegin bu class'ta constructor gorunmemesine ragmen
    C02 Class'inda, icinde oldugumuz C01 Class'indan obje uretebildik.
     */

    int sayi;

    public void deneme(){
        System.out.println("C01'den deneme mthodu calisir");
    }
}
