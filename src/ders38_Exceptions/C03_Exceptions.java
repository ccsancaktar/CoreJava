package ders38_Exceptions;

import java.util.Scanner;
import java.util.InputMismatchException;

public class C03_Exceptions {
    public static void main(String[] args) {
        /*
        - Marketteki tüm ürünleri bir array'de tuttugumuzu varsayalim.
        - Kullaniciya index sorup, index'deki urunu yazdiran bir
        program hazirlayalim.
        - Kullanici urun sayisindan buyuk bir index girerse,
        exception vermesinin onune gecelim.
         */

        String[] urunler = {"Nutella","Cokokrem","Süt","Cay", "Findik"};
        Scanner scan;

        int istenenSira = 0;
        boolean kontrol = true;

        while (kontrol){
            try {
                scan = new Scanner(System.in);
                System.out.println("Istediginiz urunun siraNo'sunu giriniz");
                istenenSira = scan.nextInt();
                kontrol = false;

            } catch (InputMismatchException deneme) {
                System.out.println("Urun indexi icin bir tam sayi girmeniz gerekli");
            }
        }

        /*
        Catch blogunun onundeki parantezde,
        exception class'inin ismi ve yaninda
        yakalanan exception'i atagimiz variable'in ismi olur (e)

        eger yakalanan exception ile ilgili bilgileri
        kulaniciya vermek isterseniy
        bu objeyi kullanabilirsiniz.

        eger exception ile bilgi verme ihtiyaci yoksa,
        "e" kullanilmasa da kod calisir.
         */

        try {
            System.out.println("Aradiginiz urun: " + urunler[istenenSira-1]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Girdiginiz sira listemizde bulunmuyor." +
                    "\nSira Numarasi en fazla: " + urunler.length + " olabilir");
        }
    }
}
