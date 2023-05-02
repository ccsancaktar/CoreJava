package ders27_StaticKeyword;

public class C01 {

    static int sayi = 10; // static variable (Class'la baslar Class'la ölür)
    int rakam = 5; // instance variable (Objeyle baslar, objeyle ölür)

    public static void main(String[] args) {

        /*
        Class levelda 2 tür variable olusturabiliriz;
            static (class) variable
            instance (obje) variable
        Static variablelar tüm class'tan kullanilabilirken
        instance olanlar sadece static olmayan methodlarda direk kullanilabilir
        instance variablelara static method'dan ulasmak istersek
        obje olusturmamiz gerekir.

        instance variable'lar obje variable'i oldugu icin,
        herhangi bir satirda, instance variable'in degerinin ne oldugunu bulmak icin
        OBJE OLUSTURULAN SATIRDAN itibaren kod incelenmelidir.

        static variablelar class variable'i oldugu icin,
        herhangi bir satirda, static variable'in degerini bulmak icin
        CLASS'IN BASINDAN itibaren kod incelenmelidir.
         */

        C01 obj1 = new C01();
        System.out.println("obj1'in rakam degeri: " + obj1.rakam); // 5
        System.out.println("obj1'in sayi degeri: " + sayi); // 10

        obj1.rakam += 1; // 5 + 1 = 6
        obj1.sayi += 1; // 10 + 1 = 11

        System.out.println("1 artirdikdan soonra obj1'in rakam degeri: " + obj1.rakam); // 6
        System.out.println("1 artirdiktan sonra obj1'in sayi degeri: " + obj1.sayi); // 11


        C01 obj2 = new C01();
        System.out.println("obj2'in rakam degeri: " + obj2.rakam); // 5
        System.out.println("obj2'in sayi degeri: " + obj2.sayi); // 11

        obj2.rakam ++; // 5 + 1 = 6
        obj2.sayi ++; // 11 + 1 = 12

        System.out.println("1 artirdikdan soonra obj2'in rakam degeri: " + obj2.rakam); // 6
        System.out.println("1 artirdiktan sonra obj2'in sayi degeri: " + obj2.sayi); // 12

    }
}
