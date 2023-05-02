package ders04_dataCasting;

import javax.sound.midi.Soundbank;
import java.util.Scanner;

public class C03_DataCastingChar {

    public static void main(String[] args) {

        int a= 'a' + 'b';
        System.out.println(a); // 97+98=195 Verecek

        System.out.println('a' + 'b'); // Yine 195 Verecek

        System.out.println(""+'a'+'b');

        // kullanicidan bir char alin
        // ascii tablosundan bu karakterden sonraki 3 karakteri yazdirin.

        Scanner scan= new Scanner(System.in);
        System.out.println("Bir Karakter Giriniz:");

        char girilenKarakter= scan.next().charAt(0);
        System.out.println("Girilen Karakter: " + girilenKarakter );

        System.out.println("Girilen karakterin bir sonrasi: " + (char)(girilenKarakter+1));
        System.out.println("Girilen karakterin iki sonrasi: " + (char)(girilenKarakter+2));
        System.out.println("Girilen karakterin uc sonrasi: " + (char)(girilenKarakter+3));


    }

}
