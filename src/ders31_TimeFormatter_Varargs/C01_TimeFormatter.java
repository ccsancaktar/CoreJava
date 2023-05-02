package ders31_TimeFormatter_Varargs;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class C01_TimeFormatter {
    public static void main(String[] args) {

        LocalDateTime tarihSaat = LocalDateTime.now();
        System.out.println("Ilk olusturulan tarih: " + tarihSaat);
        // Ilk olusturulan tarih: 2023-03-26T21:52:42.320331

        DateTimeFormatter dtf1 = DateTimeFormatter.ofPattern("dd/M/yy hh:mm");
        System.out.println(dtf1.format(tarihSaat)); // 26/3/23 09:55

        DateTimeFormatter dtf2 = DateTimeFormatter.ofPattern("d/MMM/yyyy HH:mm");
        System.out.println(dtf2.format(tarihSaat)); // 26/Mar/2023 21:57

    }
}
