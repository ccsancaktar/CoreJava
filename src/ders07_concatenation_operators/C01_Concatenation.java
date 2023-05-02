package ders07_concatenation_operators;

public class C01_Concatenation {
    public static void main(String[] args) {

        int a=10;
        int b=20;

        System.out.println("Verilen iki degerin toplami: "+(a+b));

        // girilen 10 ve 20 sayilarinin toplami : 30 yazdiralim...
        System.out.println("Girilen "+a+" ve "+b+" sayilarin toplami : "+(a+b));


        System.out.println("sayilarin toplami : "+a+b); // sayilarin toplami: 1020 (YANLIS)
        // bir string ile baska bi variable toplarsaniz stringe dahil eder
        // sayilarin toplami string oldugu icin hatali sonuc verecektir.
        // isin icinde bir tane bile String varsa sonuc stringdir.



    }


}
