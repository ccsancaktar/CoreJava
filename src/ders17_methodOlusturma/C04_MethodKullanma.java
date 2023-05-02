package ders17_methodOlusturma;

import java.util.Scanner;

public class C04_MethodKullanma {
    public static void main(String[] args) {
        // Kullanicidan iki pozitif tam sayi alip,
        // faktoriyel degerlerini toplayin

        Scanner scan = new Scanner(System.in);
        System.out.println("10'dan kucuk iki adet pozitif tam sayi girin:");
        int sayi1 = scan.nextInt();
        int sayi2 = scan.nextInt();

        int sonuc = C03_FaktöryelMethodu.faktoriyelHesapla(sayi1)
                + C03_FaktöryelMethodu.faktoriyelHesapla(sayi2);

        System.out.println(sonuc);

    }
}
