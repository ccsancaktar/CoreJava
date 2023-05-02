package ders32_StringBuilder;

public class C08_Equals {
    public static void main(String[] args) {

        StringBuilder sb1 = new StringBuilder("Java");
        StringBuilder sb2 = new StringBuilder("Java");
        String str = "Java";

        System.out.println(sb1.equals(sb2)); // false
        System.out.println(sb1.equals(sb1)); // true
        // StringBuilder'da equals methodu ancak ayni obje olursa true döner
        // String'deki gibi dusunmemek lazim.

        System.out.println(sb1.equals(str)); // false

        System.out.println(sb1.compareTo(sb2)); // 0 - esit

        StringBuilder sb3 = new StringBuilder("Jave");
        System.out.println(sb1.compareTo(sb3)); // -4

        /*
        compareTo methodu, iki StringBilder'i bastan baslayarak
        harf harf karsilastirir.
        Ilk harfler ayniysa, ikinciye, ikinciler esitse ücüncüye gecer
        Ilk farkli harfin oldugu yere kadar gider.
        Farkli olan iki harfin ascii kodlari arasindaki farki verir.

        Eger hic fark yoksa, sonuc olarak 0 döndürür.
         */
    }
}
