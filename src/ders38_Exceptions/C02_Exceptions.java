package ders38_Exceptions;

public class C02_Exceptions {
    public static void main(String[] args) {

        int a = 10000;
        int b = 50;
        int sayac = 1;

        while (sayac<100){

        /*
        Try blogu, yapmaya calistigimiz ama risk oldugunu dusundugumuz
                    islemleri yazmak icin kullanilir.

         Catch'den sonraki parantez, karsilasmayi bekledigimiz exception
                    türünü Javaya söylemek icin kullanilir.

         Catch blogu  :  Javaya soyledigimiz exception gerceklesirse
                    Javanin yapmasini istedigimiz islem.

         catch blogunun onundeki paranteze karsilasmayi bekledigimiz
         exception'i yazabilir veya hertürlü exception'da devreye girmesini
         istiyorsak, tüm exception'larin parent'i olan "Exception" yazabiliriz.
         */

            try {
                System.out.println(a/b);
            } catch (ArithmeticException e) {
                System.out.println("payda 0 oldu, dikkatli ol");
            }

            b--;
            sayac++;
        }

    }
}
