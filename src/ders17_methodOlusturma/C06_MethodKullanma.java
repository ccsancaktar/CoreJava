package ders17_methodOlusturma;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class C06_MethodKullanma {
    public static void main(String[] args) {

    // Verilen bir String'in Polidrome olup olmadigini yazdirin
    // Polidrome : düzden ve tersten ayni sekilde yazilan.
    // madam, 12321, kabak vb...

    Scanner scan = new Scanner(System.in);
    System.out.println("Lütfen bir metin giriniz;");

    String metin = scan.nextLine();
    String tersMetin = C05_StringiTerseCevirme.stringTersineCevir(metin);

    if (metin.equals(tersMetin)){
        System.out.println("Girilen metin Polidrom");
    } else {
        System.out.println("Girilen metin Polidrom degil.");
    }


    }
}
