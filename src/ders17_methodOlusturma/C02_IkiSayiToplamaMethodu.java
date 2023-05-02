package ders17_methodOlusturma;

import java.util.Scanner;

public class C02_IkiSayiToplamaMethodu {
    public static void main(String[] args) {

        // Method "main methodun" disinda olusturulur!!!
        // iki cesit method vardir.
        // Birincisi, sonuc donduren,
        // ikincisi ise sonuc dondurmeyip,
        // herhangi bir islemi yazdiran methodlar (void)

        // kullanicidan iki sayi alip,
        // toplamlarini yazdiran bir method olusturun.

        ikiSayiTopla();

    }



    public static void ikiSayiTopla(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Toplamak üzere iki sayi giriniz:");
        double sayi1 = scan.nextInt();
        double sayi2 = scan.nextInt();

        System.out.println("Toplam: " + (sayi1 + sayi2));

    }

}
