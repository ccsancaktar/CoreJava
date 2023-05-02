package ders14_stringManipulation;

import java.util.Scanner;

public class C06_indexOf {
    public static void main(String[] args) {
        // SORU: Kullanicidan aldigimiz cumlede "cok" ile baslayan ilk kelimeyi yazdirin
        // Cumlede cok kelimesi gecmiyorsa; "cok ile baslayan kelime yok" yazdirin.

        Scanner scan = new Scanner(System.in);
        System.out.println("Bir cumle giriniz");
        String girilenCumle = scan.nextLine();

        // Sinavlarimizda coktan secmeli sorular kullanmiyoruz
        // Javayi cok seviyoruz
        // Bu kadar coklu secenek olur mu?

        if (!girilenCumle.contains("cok")){
            System.out.println("Cumlede cok ile baslayan kelime yok");
        } else {
            int cokIndexi = girilenCumle.indexOf("cok");
            int boslukIndexi = girilenCumle.indexOf(" ",cokIndexi+1);

            System.out.println(girilenCumle.substring(cokIndexi, boslukIndexi));
        }



    }
}
