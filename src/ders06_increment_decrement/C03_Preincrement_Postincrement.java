package ders06_increment_decrement;

public class C03_Preincrement_Postincrement {
    public static void main(String[] args) {

        int sayi = 10;
        sayi++;
        System.out.println(sayi); // 11

        ++sayi;
        System.out.println(sayi); // 12

        System.out.println(sayi++); // Post oldugu icin eski degerini yazdiracak (12)
                                    // sonra sayiyi 1 artiracak. (13)
        System.out.println(sayi); // 13


        System.out.println(++sayi); // Pre oldugu icin once artiracak (14)
        System.out.println(sayi); // 14

    }
}
