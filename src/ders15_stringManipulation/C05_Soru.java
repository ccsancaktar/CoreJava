package ders15_stringManipulation;

import java.util.Scanner;

public class C05_Soru {
    public static void main(String[] args) {
        /*
        SORU: Kullanicidan bir cumle alin
        - Cumlede ev geciyorsa "home home sweet home" yazdirin.
        - Cumlede is geciyorsa "calismak guzeldir"
        - ikisini de iceriyorsa "hem ev lazim hem is"
        - hicbirini icermiyorsa "cok calismam lazim cok" yazdirin.
         */

        Scanner scan = new Scanner(System.in);
        System.out.println("Bir cumle yaziniz");
        String cumle = scan.nextLine();
        cumle = cumle.toLowerCase();

        if (cumle.contains("ev") && cumle.contains("is")) {
            System.out.println("hem ev lazim hem is");
        } else if (cumle.contains("ev")){
            System.out.println("home sweet home!");
        } else if (cumle.contains("is")) {
            System.out.println("calismak guzeldir");
        } else {
            System.out.println("cok calisman lazim");
        }

    }
}
