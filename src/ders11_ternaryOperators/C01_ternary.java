package ders11_ternaryOperators;

import java.util.Scanner;

public class C01_ternary {
    public static void main(String[] args) {
        // Ternary, if ve else cumlelerini daha kisa yazmamizi saglar.
        // Basit bir if else varsa, Ternary kullanilabilir.

        /* Soru 1
        Kullanicidan bir sayi isteyin, sayi 5'e bolunuyorsa
        "Sayi 5in tam kati" yazdirin. Aksi halde, tam kati degil yazdirin.
         */

        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen bir tam sayi giriniz");
        int sayi = scan.nextInt();

        System.out.println(sayi % 5 == 0 ? "5'in tam kati" : "5'in tam kati degil");
        // ternay'de "if" = "?" , "else" = ":"



    }
}
