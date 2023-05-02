package ders15_stringManipulation;

public class C02_Replace {
    public static void main(String[] args) {

        String str = "Java ogren adana ye :)";

        System.out.println(str.replace('a', 'A')); // JAvA ogren AdAnA ye :)
        System.out.println(str.replace(" ", "")); // Javaogrenadanaye:)
        System.out.println(str.replace("Java", "yazilim")); // yazilim ogren adana ye :)

        String telefon = "555 3451234";
        System.out.println(telefon.replace("555", "532")); // 532 3451234
        System.out.println(telefon.replace('3', '7')); // 555 7451274

        // Asagidaki arama sonucunun 10 Binden fazla oldugunu test edin;

        String sonuc = "1-16 of over 100,000 results for \"apple\"";

        int indexOver = sonuc.indexOf("over");
        int indexResults = sonuc.indexOf("results");

        String sonucSayiStr = sonuc.substring(indexOver+5, indexResults-1);
        System.out.println(sonucSayiStr); // 100,000

        sonucSayiStr = sonucSayiStr.replace(",","");
        System.out.println(sonucSayiStr); // 100000

        int sonucSayiInt = Integer.parseInt(sonucSayiStr); // String'i Int'e cevirir.

        if (sonucSayiInt > 10000) {
            System.out.println("Sayi 10 Binden Fazla! Passed");
        } else {
            System.out.println("Sayi 10 Binden az! Failed");
        }

    }


}
