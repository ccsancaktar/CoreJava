package ders30_Immutable_Date;

import java.time.LocalTime;

public class C04_LocalTime {
    public static void main(String[] args) throws InterruptedException {

        LocalTime time1 = LocalTime.now();
        System.out.println(time1); // 19:12:50.227401
        /*
        Bizim olsturdugumuz date ve time
        canli saat veya tarih degildir.
        LocalTime.now(); kullandigimiz satirda
        o anki tarih veya saati alip
        bizim variable'imiza store eder.
        time1 variable'imizin degeri SABITTIR.
         */

        Thread.sleep(3000); // 3000ms Bekler

        time1 = LocalTime.now();
        System.out.println(time1); // anlik zamani ver

        System.out.println(time1.getSecond()); // anlik saniyeyi ver

        System.out.println(time1.plusSeconds(10000)); // 10bin saniye sonra

        System.out.println(time1.minusMinutes(10000)); // 10 bin dakika önce

        System.out.println(time1.withHour(3)); // saati 3 yaparak yazdi.
    }
}
