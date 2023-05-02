package ders30_Immutable_Date;

import java.time.LocalDate;

public class C03_Date {
    public static void main(String[] args) {

        LocalDate tarih = LocalDate.now();
        System.out.println(tarih); // 2023-03-26

        System.out.println(tarih.getDayOfYear()); // 85 - Yilin 85. günü
        System.out.println(tarih.getDayOfWeek()); // SUNDAY - Haftanin günü
        System.out.println(tarih.getMonthValue()); // 3 - Kacinci ay
        System.out.println(tarih.isLeapYear()); // false - Artik yil mi

        LocalDate tarih2 = LocalDate.of(2001,5,15);
        System.out.println(tarih2); // 2001-05-15

        LocalDate tarih3 = LocalDate.of(2007,8,10);
        System.out.println(tarih3); // 2007-08-10

        System.out.println(tarih.plusDays(100)); // 2023-07-04 - Yüz gün sonra
        System.out.println(tarih.plusYears(5).plusMonths(3).plusDays(15)); // 2028-07-11

        System.out.println(tarih.minusDays(200)); // 2022-09-07 - Ikiyüz gün önce
        System.out.println(tarih.minusWeeks(5)); // 2023-02-19 - 5 hafta önce

        System.out.println(tarih.isAfter(tarih2)); // true - tarihimiz tarih2'den sonra mi?

        // iki farkli dogum gunu girildiginde
        // hangisinde doganin daha buyuk oldugunu bulunuz
        // tarih2 ve tarih3 icin yapalim

        if (tarih2.isAfter(tarih3)){
            System.out.println(tarih + " tarihinde dogan daha büyük");
        } else if (tarih2.isBefore(tarih3)){
            System.out.println(tarih2 + " tarihinde dogan daha büyük");
        } else {
            System.out.println("iki taih birbiri ile ayni");
        }

    }
}
