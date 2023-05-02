package ders09_IfElseStatements;

import java.util.Scanner;

public class C02_IfElseStatement {
    public static void main(String[] args) {
        // Soru 2- Kullanicidan notunu alin
        // 50 veya daha büyükse "sinifi gectin"
        // 50'den kucukse "malesef kaldin" yazdirin.

        Scanner scan=new Scanner(System.in);
        System.out.println("Notunuzu giriniz;");
        double sayi=scan.nextDouble();

        if (sayi>=50){
            System.out.println("Sinifi gectiniz!");
        } else {
            System.out.println("Malesef kaldiniz");
        }


    }
}
