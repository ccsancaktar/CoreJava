package ders07_concatenation_operators;

public class C02_Operators {
    public static void main(String[] args) {

        int a = 20;

        a = a+10;

        /*
        tek esittir isareti (assigment isaretidir)
        java bu isareti gordugunde once sagdaki islemi yapar
        sonra bulunan degeri soldaki variable'a assign eder.
         */

        int b=20;

        // a ile b esit ise.....
        // a ile b esit mi? sorusu yerine == kullanilir

        System.out.println(a==b); // false 30 == 20
        System.out.println(a == b+10); //true 30 == 30

        boolean c= 20==b;
        System.out.println(c);

        /*
        Esit Degildir isareti javada !=
        Javada herhangi bir mantiksal degerin basina koyulan !
        o mantiksal ifadenin degerini tersine cevirir.
         */


        /*
        And Operatorü && , &
        && "hem hem de" anlami verir, birlestirilen iki boolean ifade de
        dogru ise sonucu true yapar bunun disindaki hepsini false yapar
        && operatoru mükemmeliyetcidir.

        & operatoru ise tüm islemi sonuna kadar yapip ayni sonucu verir.
        Tek AND cifte görece yavastir.
         */


        /*
        OR Operatorü ||
        Birlestirdigi iki boolean ifadenin ikisi de false ise sonucu false yapar
        Bunun disindaki tum durumlari true yapar. Bir tane True görse bile.
        OR Operatoru iyimserdir.
         */

    }
}
