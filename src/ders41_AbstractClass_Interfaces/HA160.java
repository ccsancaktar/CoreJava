package ders41_AbstractClass_Interfaces;

public class HA160 extends FMercedes{

    /*
    Abstract parent silsilesinden gelen
    ilk concrete class
    Parent'i olan tüm class'lardaki abstract methodlari
    concrete hale donusturmek (override) ZORUNDADIR.

    Bu kuralin istisnasi
    parent class'lardan herhangi birinde
    concrete hale donusturulmus, abstract class'lardir.
     */

    public static void main(String[] args) {
        HA160 arb1 = new HA160();
        // Concrete bir class'tan istedigimiz objeyi uretebiliriz.

        FMercedes ab2 = new FMercedes();
        // Mercedes de concrete.

        // EToyota arb3 = new EToyota();
        // Abstract class'lar construcor baridirir ama obje uretemezler.
        // Toyota class'i abstract oldugundan, obje uretilemez.

    }
}
