package ders14_stringManipulation;

public class C07_lastIndexOf {
    public static void main(String[] args) {

        String str = "Javayi iyi ogrenmek icin cok calisman lazim cok.";

        // Ilk A'nin indexini yazdiralim.
        System.out.println(str.indexOf("a")); // 1

        // Son A'nin indexini yazdirin.
        System.out.println(str.lastIndexOf("a")); // 39

        System.out.println(str.lastIndexOf("a",15)); // 3

        // Verilen Str'da cok kelimesinin kullanimini kontrol edip
        // cok kelimesi kullanilmamis
        // bir kere kullanilmis
        // birden fazla kullanilmis
        // sonuclarindan uygun olanlari yazdirin.
        // STR = "Javayi iyi ogrenmek icin cok calisman lazim cok."

        int ilkCok = str.indexOf("cok");
        int sonCok = str.lastIndexOf("cok");

        if (!str.contains("cok")){
            System.out.println("Cok kelimesi kullanilmamis");
        } else if (ilkCok == sonCok) {
            System.out.println("Bir kere kullanilmis");
        } else {
            System.out.println("Birden fazla kullanilmis");
        }

    }
}
