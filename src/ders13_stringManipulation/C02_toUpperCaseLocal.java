package ders13_stringManipulation;

import java.util.Locale;

public class C02_toUpperCaseLocal {
    public static void main(String[] args) {

        String str = "JAVA CANDIR";
        System.out.println(str.toLowerCase()); // java candir

        str = str.toLowerCase(Locale.forLanguageTag("Tr"));
        System.out.println(str); // java candır

    }
}
