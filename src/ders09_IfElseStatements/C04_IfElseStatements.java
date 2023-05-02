package ders09_IfElseStatements;

import java.sql.SQLOutput;
import java.util.Scanner;

public class C04_IfElseStatements {
    public static void main(String[] args) {
    /*
    Soru 4- Kullanicidan kg ve boyunu isteyin
    Vucut kitle endeksini hesaplayiniz (kilo+1000 / (boy *boy))
    Vucut kitle endeksi 30'dan buyuk ise Obez
    25-30 arasiysa Kilolu
    20-25 arasiysa normal
    20'den kucuk ise zayif yazdirin.
     */

        Scanner scan = new Scanner(System.in);
        System.out.println("Kilonuz:");
        double kilo = scan.nextDouble();
        System.out.println("Boyunuz (cm):");
        double boy = scan.nextInt();

        double vke = kilo * 10000 / (boy *boy);
        System.out.println("Vucut kutle endeksiniz: " + vke);

        if (vke>=30){
            System.out.println("Obez");
        }else if (vke>=25){
            System.out.println("Kilolu");
        }else if (vke>=20){
            System.out.println("Normal");
        }else {
            System.out.println("Zayif");
        }

    }

}
