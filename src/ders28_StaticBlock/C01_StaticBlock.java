package ders28_StaticBlock;

public class C01_StaticBlock {

    static int sayi;
    static {
        /*
        Static Block, Class üyelerinin tamamindan önce calisir.
        (main method'tan bile önce.)

        Static Block, class olusturuldugunda calisir.
        Genellikle class'la ilgili ön ayarlamalar ya da,
        static variable'lara deger atamak icin kullanilir.

         static blocklarin class icerisinde nerede oldugu önemli degildir.
         önce static blocklar calisir.

         birden fazla static block varsa yukaridan asagi dogru calsiir.
         */

        System.out.println("static blok calisti");
        sayi = 10;
    }

    public static void main(String[] args) {
        System.out.println("main method calisti");
        System.out.println(sayi);
    }

    static {
        System.out.println("main method altindaki static block calisti.");
    }
}
