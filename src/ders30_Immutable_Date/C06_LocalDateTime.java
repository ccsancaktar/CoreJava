package ders30_Immutable_Date;

import java.time.LocalDateTime;

public class C06_LocalDateTime {
    public static void main(String[] args) {

        LocalDateTime tarihSaat = LocalDateTime.now();

        System.out.println(tarihSaat); // 2023-03-26T19:35:42.303021

        System.out.println(tarihSaat.plusMonths(3).plusHours(21)); // 2023-06-27T16:37:23.255700

        System.out.println(tarihSaat.toLocalDate()); // 2023-03-26

        // Date ve Time classlariyla ayni methodlara sahip.
    }
}
