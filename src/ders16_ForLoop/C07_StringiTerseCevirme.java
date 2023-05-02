package ders16_ForLoop;

public class C07_StringiTerseCevirme {
    public static void main(String[] args) {
        // Kullanicidan bir string isteyin
        // ve Stringi tersine cevririp kaydedin.

      String input = "Java Candir";

      // Output: ridnaC avaJ

      String output ="";

        for (int i = input.length()-1; i >=0 ; i--) {
            output += input.charAt(i);
        }
        System.out.println(output);

    }
}
