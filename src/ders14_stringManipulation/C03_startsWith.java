package ders14_stringManipulation;

public class C03_startsWith {
    public static void main(String[] args) {
        // Bu method "... ile baslar mi?" Sorusuna cevap verir.

        String str = "Java mutluluktur";

        System.out.println(str.startsWith("Java")); // Java ile baslar? true
        System.out.println(str.startsWith("j")); // Kücük J ile baslar? false

        System.out.println(str.startsWith("Java mutluluktur")); // true

        System.out.println(str.startsWith("")); // hiclik ile baslar? true

        System.out.println(str.contains("mutlu")); // icerir? true
        System.out.println(str.startsWith("mutlu")); // baslar? false

        System.out.println(str.startsWith("mutlu" , 5)); // "5. index Mutlu ile baslar?" true
        System.out.println(str.startsWith("v" , 2)); // true


    }
}
