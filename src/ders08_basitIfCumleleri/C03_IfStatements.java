package ders08_basitIfCumleleri;

import java.util.Scanner;

public class C03_IfStatements {
    public static void main(String[] args) {

        // Soru 3- Kullanicidan bir sayi alin.
        // Sayi 3 ile bolunuyorsa "3 ile bolunebilen sayi"
        // 5 ile bölunuyorsa "5 ile bolunebilen sayi" yazdirin.

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen bir sayi giriniz:");
        int sayi = scan.nextInt();

        /*
        If cumlesinden sonra {} kullanilirsa;
        if sarti saglandiginda {} ici tamamen calistirilir
        sart saglanmazsa {} ici hic calistirimaz.
        Ancak {} kullanilmazsa, java if body'si olarak if sartindan sonra
        Ilk ; kadar olan kismi alir, geri kalan kodlar if ile ilgili olmaz
         */

        if (sayi % 3 == 0) {
            System.out.println("3 ile bolunebilen sayi");
        }

        if (sayi % 5 == 0){
            System.out.println("5 ile bolunebilen sayi");
        }


    }
}
