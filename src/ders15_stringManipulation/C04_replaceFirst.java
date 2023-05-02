package ders15_stringManipulation;

public class C04_replaceFirst {
    public static void main(String[] args) {

        String str = "Java heyecandir";

        // eger tüm a'lari degil de sadece ilk a'yi degistirmek istersek

        System.out.println(str.replaceFirst("a", "A")); // JAva heyecandir

        // ilk harf veya rakami yildiz yap

        System.out.println(str.replaceFirst("\\w", "*"));
    }
}
