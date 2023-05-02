package ders09_IfElseStatements;

import java.util.Scanner;

public class C01_IfElseStatements {
    public static void main(String[] args) {

     // Soru 1- Kullanicidan bir ucgenin 3 kenar uzunlugu alin
     // Ucgen eskenar ise 'Eskenar Ucgen' yazdirin, degilse 'Eskenar degil' yazdirin.

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen ucgenin kenarlarini girin, \nher kenardan sonra entera basin");

        double kenar1=scan.nextDouble();
        double kenar2=scan.nextDouble();
        double kenar3=scan.nextDouble();


       /* Java ikili karsilastirma yapmaz, 3lü karsilastirma icin
       && kullanmamiz gerekir. Yani AND kullaniyoruz asagidaki gibi.
        */

        if (kenar1==kenar2 && kenar2==kenar3) {
            System.out.println("Eskenar Ucgen!");
        } else {
            System.out.println("Eskenar ucgen Degil");
        }

    }
}
