package ders14_stringManipulation;

public class C02_contains {
    public static void main(String[] args) {
        // Bu method "iceriyor mu" sorusuna cevap verir.
        // Cok Fazla Kullanilir!!!

        String str = "Java ogren, mutlu ol";

        // str mutlu iceriyor mu?
        System.out.println(str.contains("mutlu")); // true

        // charSquance : "char dizisi" demektir.

        // String konusuyorsak kesinlikle Case Sensitive
        System.out.println(str.contains("j")); //false
        System.out.println(str.contains("J")); // true
        System.out.println(str.contains(" ")); // true

        // contains methodu kac tane olduguna degil,
        // sadece var olup olmadigina bakar.

        System.out.println(str.contains("Java") && str.contains("mutlu")); // true




    }
}
