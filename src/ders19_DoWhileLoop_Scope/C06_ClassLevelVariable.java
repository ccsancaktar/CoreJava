package ders19_DoWhileLoop_Scope;

public class C06_ClassLevelVariable {
    /*
    Bir class icinde tüm methodlarin erisebilecegi variable'lar istenirse
    Class Level'da (Class icinde ama tüm methodlarin disinda) olusturulmalidir.

     1- Class Level'da olusturulan variable'larin Scope'u tüm class'tir.
     2- Class Level'da olusturulan variable'lara deger atanmasa bilE,
        Java onlar icin tanimlanmis "DEFAULT DEGERLER" atar.
     3- Class Level'da olusturulan Variable'lar static veya instance(static olmayan) olabilir.
     4- Static olan tanimlanan variable'lar tüm methodlarda kullanilabilir
     5- Method static ise icinde static olmayan hicbir sey almaz.
    */

    static int sayi = 10;
    static String isim;
    static boolean bl;
    static char chr;
    static int in1;
    int in2;
    boolean bl2;

    public static void main(String[] args) {
        System.out.println(sayi);
        System.out.println("String: " + isim); // non primitive turler icin null
        System.out.println("Boolean: " + bl); // false
        System.out.println("Char " + chr); // hiclik
        System.out.println("Int " + in1); // sayisal turler icin 0
        // System.out.println(bl2); // instance
        staticMethod();
        // staticOlmayanMethod();
    }

    public static void staticMethod(){
       sayi++;
        System.out.println(sayi); // s
        //System.out.println(in2); // instance
        //System.out.println(bl2); // instance
    }

    public void staticOlmayanMethod(){
       sayi--;
        System.out.println(sayi); // s
        System.out.println(in2); // instance
    }
}
