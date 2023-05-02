package ders13_stringManipulation;

import java.util.Locale;
import java.util.Scanner;

public class C01_StringManipulation {
    public static void main(String[] args) {
 // Kullancidan gün ismini girmeyi isteyin
 // Girilen g+n hafta ici ise "Simdi calsima zamani tatile... gün var"
 // Girilen gün hafta sonu ise " Simdi dinlenme zamani" yazdirin.

        Scanner scan=new Scanner(System.in);
        System.out.println("Bir gün ismi giriniz:");
        String girilenGun = scan.next();
        String kullaicilacakGun = girilenGun.toLowerCase();

        /*
        String ifadeler "Case Sensitive"dir.
        Kullanicinin Pazar, PAzar, PAzAr.. gibi cok sekilde yazma ihtimali var
         */

        switch (kullaicilacakGun) {
            case "pazartesi":
                System.out.println(girilenGun + " calisma zamani, tatile 5 gün var.");
                break;

            case "sali":
                System.out.println(girilenGun + " calisma zamani, tatile 4 gün var.");
                break;

            case "carsamba":
                System.out.println(girilenGun + " calisma zamani, tatile 3 gün var.");
                break;

            case "persembe":
                System.out.println(girilenGun + " calisma zamani, tatile 2 gün var.");
                break;

            case "cuma":
                System.out.println(girilenGun + " calisma zamani, tatile 1 gün var.");
                break;

            case "cumartesi" :
            case "pazar" :
                System.out.println("Simdi dinlenme zamani");
                break;
            default:
                System.out.println("Yanlis gün ismi");
        }
    }
}
