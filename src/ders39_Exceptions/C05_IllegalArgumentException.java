package ders39_Exceptions;

import java.util.Scanner;

public class C05_IllegalArgumentException {
    public static void main(String[] args) {
        // SORU: Kullanicidan yasini girmesini isteyin.
        // Sifirdan kucuk bir sayi girerse, Exception firlatin.

        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen yasinizi giriniz;");
        int yas = scan.nextInt();

        try {
            if (yas <= 0){
                throw new IllegalArgumentException();
            } else {
                System.out.println("Yasiniz " + yas);
            }
        } catch (IllegalArgumentException e) {
            e.printStackTrace();
            System.err.println("Yas negatif olamaz.");
        }

    }
}
