package ders17_methodOlusturma;

public class C05_StringiTerseCevirme {
    public static void main(String[] args) {

        // Verilen bir Stringi tersine cevirip,
        // bize döndüren bir method olusturun.

        System.out.println(stringTersineCevir("Java Candir"));
        System.out.println(stringTersineCevir("Anlasildi mi"));
        System.out.println(stringTersineCevir("Baytaktaroglu"));

    }

    public static String stringTersineCevir(String metin){ // Java

        String tersMetin=""; // avaJ

        for (int i = metin.length()-1; i >= 0; i--) {

            tersMetin += metin.charAt(i);
        }

        return tersMetin;
    }
}
