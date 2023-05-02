package ders33_Encapsulation;

public class ArabaRunner {
    public static void main(String[] args) {

        Araba arb1 = new Araba();
        // arb1 objesi uzerinden marka variable'ina
        // ulasabildim, degistirebildim (set) ve yazdirabildim. (get)
        arb1.marka = "Toyota";
        System.out.println(arb1.marka);

        // access modifier kullanarak, marka variable'ina ulasimi
        // tamamen serbest yapabilir veya tamamen engelleyebilirim.
        // private yaptigimiz model'e ise hic ulasamayiz.
        // yani access modifier ya hep ya hic diyor.


        // model'i degistirelim ama göremeyelim,
        // yakit'i da gorelim ama degistiremeyelim.

        /*
        set ve get yetkilerini ozel olarak tanimamak isterseniz;
        1. Adim- özel yetki tanimlayacaginiz variable'lari provate yapin
                    (private bir dataya baska class'tan ulasmak mumkun olmadigindan.)
        2.Adim - set yetkisi icin setter ve get yetkisi icin getter methodlari olusturalim.
         */

        arb1.setModel("Corolla"); // Model Supra atandi.
        // Modeli yazdirma imkanimiz yok, cunku getter method'u yok
        System.out.println(arb1.getYakit()); // yakit olarak Elektrikli bilgisini yazdirdik.
        // Yakiti degistiremeyiz cünkü stter methodu yok.
    }
}
