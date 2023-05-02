package ders18_methodOverloading_whileLoop;

public class C04_MethodOverloading {
    public static void main(String[] args) {
        /*
        Java overloading kurallari;
        1- Isim ve parametreleri ayni olan birden fazla method olusturulamaz.
        2- Data türleri farkli olan parametrelerin yerlerini degistirirsek
            java yeni bir method olarak kabul eder. (int, double) (double, int)

        Overloading olan classlarda,
        Java hangi methodun calistirilacagina su sekilde karar verir

        1- Cagirilan isimde method var mi?
        2- Method Call'da kullanilan arguments ile methodlardaki
            parametrelerin %100 uyumlu oldugu var mi?
        3- Argument ile parametre ayni olmasa bile,
            verilen argumentleri kabul edecek parametre var mi?
        4- Casting ile birden fazla methodu kullanabiliyorsa
            daha az casting ile calisacak methodu kullanir.
         */

        topla(3,5); // 8
        topla(3.4,2.3); // 5.7

        // topla ("ali", "veli"); CTE / Bu argumentleri kabul edecek parametre yok.

        topla('a','b'); // Char olsa da iki int 195 verir.
        // Char degerler ASCI tablosuna göre int davranabilirler.

        topla(3f,4f); // 7.9
        // Float, Double'dan kucuk oldugu icin double/double calisir.

        topla(3f , 4); // Double ve Int toplami 7.0
        // Kendisini en az yoracak methodu kullanir.

    }


    public static void topla(int a, int b){
        System.out.println("Iki tamsayinin toplami: " + (a+b));
    }

    public static void topla(double a, double b){
        System.out.println("Iki double sayinin toplami " + (a+b));
    }

    public static void topla(int sayi1,double sayi2){
        System.out.println("Int ve Double sayilarin toplami " + (sayi1+sayi2));
    }

    public static void topla (double sayi1, int sayi2){
        System.out.println("Double ve Int sayilarin toplami " + (sayi1+sayi2));
    }

}
