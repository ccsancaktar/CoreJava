package ders30_Immutable_Date;

import java.time.LocalDate;
import java.time.Period;

public class C07_Period {
    public static void main(String[] args) {
        // iki tarih arasindaki sureyi bulma

        LocalDate tarih1 = LocalDate.of(1993,9,6);
        LocalDate bugun = LocalDate.now();

        Period period = Period.between(bugun, tarih1);
        System.out.println(period); // P-29Y-6M-20D

        System.out.println(period.getYears()); // -29
    }
}
