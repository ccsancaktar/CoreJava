package ders09_IfElseStatements;

import java.util.Scanner;

public class C05_IfElseStatements {
    public static void main(String[] args) {
        /*
        Kullanicidan bir tam sayi alin
        sayi 3 ile bolunuyorsa "uc ile bolunen sayi"
        5 iel bolunuyorsa "5 ile bolunen sayi"
        hem 3 hem de 5 ile bölünüyorsa "super sayi" yazdirin.
         */

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen bir tamsayi giriniz:");
        int sayi = scan.nextInt();


        // Dar kapsamli sartlari en basa yazmak zorundayiz (ilk sart gibi)
        if (sayi%5==0 && sayi%3==0) {
            System.out.println("süper sayi");
        }
        else if (sayi% 3 == 0) {
            System.out.println("3'e bolunuyor");
        }
        else if (sayi%5 == 0) {
            System.out.println("5'e bolunuyor");
        }


    }
}
