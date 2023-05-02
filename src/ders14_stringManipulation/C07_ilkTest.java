package ders14_stringManipulation;

public class C07_ilkTest {
    public static void main(String[] args) {

       // Gittigimiz web sayfasindan aldigimiz
       // String arama sonuclarinda
       // Arama sayisinin 50'den fazla oldugunu test edin.

        String input = "1<48 of 87 results for \"nutella\"";

        int indexOf = input.indexOf("of");
        int indexResults = input.indexOf("results");

        String sonucSayisiString = input.substring(indexOf+3,indexResults-1);

        // arama sayisinin 50'den fayla oldugunu test edin.
        int sonucsayisiInt = Integer.parseInt(sonucSayisiString);

        if (sonucsayisiInt > 50){
            System.out.println("Nutella arama testi PASSED!");
        } else {
            System.out.println("Istenen kadar sonuc yok, Nutella arama testi FAILED!");
        }


    }
}
