package ders09_IfElseStatements;

import javax.sound.midi.Soundbank;
import java.util.Scanner;

public class C03_IfElseStatements {
    public static void main(String[] args) {
       /* Soru 3- Eger ogrencinin notu 85 ve ustu ise AA.
                  65 ve üstü ise BB
                  50 ve üstü ise CC
                  Altinda ise DD not alacaktir.
        */

        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen notunuzu giriniz;");
        double not = scan.nextDouble();

        if (not>100 || not<0){
            System.out.println("Gecersiz Not");
        } else if (not>=85){
            System.out.println("AA");
        } else if (not>=65){
            System.out.println("BB");
        } else if (not>=50){
            System.out.println("CC");
        }
        else{
            System.out.println("DD");
        }

    }
}
