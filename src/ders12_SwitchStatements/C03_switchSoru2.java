package ders12_SwitchStatements;

import java.util.Scanner;

public class C03_switchSoru2 {
    public static void main(String[] args) {

        // Kullanicidan gun numarasi alin, Hafta ici veya Hafta Sonu yazdirin.

        Scanner scan = new Scanner(System.in);
        System.out.println("Bir sayi giriniz;");
        int sayi = scan.nextInt();

        switch (sayi){
            case 1 :
            case 2 :
            case 3 :
            case 4 :
            case 5 :
                System.out.println("Hafta ici");
                break;
            case 6 :
            case 7 :
                System.out.println("Hafta Sonu");
                break;
            default:
                System.out.println("Gecersiz gun numarasi");
        }


    }
}
