package ders11_ternaryOperators;

import java.util.Scanner;

public class C03_ternary {
    public static void main(String[] args) {
        /*
        Soru 3 - Kullanicidan ders notunu alin
        50 ve üstüyse "Gectin" , alti ise "Kaldin" yazdirin.
         */

        Scanner scan = new Scanner(System.in);
        System.out.println("Ders notunuzu giriniz;");
        double not = scan.nextDouble();

        System.out.println(not >= 50 ? "Gectiniz" : "Kaldiniz");

    }
}
