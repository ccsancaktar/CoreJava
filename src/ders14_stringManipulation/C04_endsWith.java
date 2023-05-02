package ders14_stringManipulation;

import java.util.Scanner;

public class C04_endsWith {
    public static void main(String[] args) {
        // ile biter mi? sorusuna cevap verir...

        String str = "Java ogrenen issiz kalmaz";

        System.out.println(str.endsWith("kalmaz")); // true
        System.out.println(str.endsWith("java ogrenen issiz kalmaz")); // true
        System.out.println(str.endsWith("")); // true

        //SORU: kullanicidan bir mail alin
        // mail @ isareti icermiyorsa "gecersiz" yazdirin
        // mail @gmail.com icermiyorsa "mail gmail olmali" yazdirin
        // mail @gmail.com ile bitmiyorsa "mailde yazim hatasi var" yazdirin.

        Scanner scan = new Scanner(System.in);
        System.out.println("Mail adresi giriniz");
        String girilenmail = scan.nextLine();

        if (!girilenmail.contains("@")){
            System.out.println("gecersiz mail");
        } else if (!girilenmail.contains("@gmail.com")) {
            System.out.println("mail gmail olmali");
        } else if (!girilenmail.endsWith("@gmail.com")){
            System.out.println("mailde yazim hatasi var");
        } else {
            System.out.println("Tesekkurler!");
        }


    }
}
