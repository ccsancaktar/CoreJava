package ders32_StringBuilder;

public class C03_Reverse {
    public static void main(String[] args) {
        // verilen bir input'u tersine cevirip bize döndüren bir method'dur.

        String input = "Hey gidi for loop günleri";
        String tersInput = tersineCevir(input);

        System.out.println(tersInput); // irelnüg pool rof idig yeH

    }

    private static String tersineCevir(String input) {
        StringBuilder sb = new StringBuilder(input);
        return sb.reverse().toString();
    }
}
