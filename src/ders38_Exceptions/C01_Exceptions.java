package ders38_Exceptions;

public class C01_Exceptions {
    public static void main(String[] args) {
    // Exception => Istisnai durumlar
    // Her sey olmasi gerektigi gibi => No Exception
    // Sorun var ama halledilebilir => No exception
    // Sorun var ve halledilemez => Throw Exception

        int a = 10000;
        int b = 50;
        int sayac = 1;

        /*
        Bir sorunla karsilasmayi dusundugunuzde
        if/else ile sorunu yakalayip
        bununla ilgili cozum uretebilirsiniz.

        Fakat sorunu her zaman if/else ile cözemezsiniz
        Bunun icin Java, "TRY / CATCH" block'lari olusturmustur.
         */

        while (sayac<100){
            if (b==0){
                System.out.println("Islem yapilirken payda 0 oldu dikkat ediniz");
            } else {
                System.out.println(a/b);
            }
            b--;
            sayac++;
        }

    }
}
