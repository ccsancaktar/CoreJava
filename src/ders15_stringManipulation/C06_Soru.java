package ders15_stringManipulation;

import java.util.Scanner;

public class C06_Soru {
    public static void main(String[] args) {

        /*
        SORU: Kullanicidan bir sifre isteyin,
        Asagidaki sartlari kontrol ederek, kullaniciya duzeltmesi gereken
        tüm eksikleri soyleyin. Eger her sart tamamsa "Sifre Kaydedildi" yazdirin
        - Ilk harf kucuk olmali
        - Son karakter rakam olmali
        - Sifre bosluk icermemeli
        - Uzunlugu en az 10 karakter olmali
         */

        Scanner scan = new Scanner(System.in);
        System.out.println("Bir parola olusturun;");
        String sifre = scan.nextLine();

        /*
        Bu soruda bagimsiz if cumlesi ile yapmak
        yahut if-else ile yapmka mumkundur

        Eger if-else ile yaparsak ilk hatada, hatayi yazdirip geridekilere bakmaz
        Avantaji ise hata yoksa otomatik olarak basarili sekilde olutruruldu mesaji verir

        Bagimsiz if cumlelerinde tüm hatalari tek seferde soyleyebiliriz
        Ancak bagimsiz if cumleleri kodun geri kalani ile ilgilenmediginden.
        Basarili sifre olusturuldugunu, bizim ayri bir mekanizma ile kontrol etmemiz gerekir.
         */

        /*
        Sonucta basarili sifre olusturuldu demek icin bir kontrol mekanizmasi yaratmak gerekir
        Ya her adimda artiracagimiz bir sayac yapip en son 4 oldu ise basarili deriz
        veya basta verdigimiz deger olumsuz bir durum oldugunda artirilir,
        en sonda kontrol edip, eger bastaki degeri hala koruyorsa, basarili olmustur diyebiliriz.
         */

        int flag = 0;

        // Ilk harf kucuk olmali
        if(!(sifre.charAt(0)>='a' && sifre.charAt(0)<='z')){ // ilk harf kucuk degilse hatayi yazdir
            System.out.println("ilk harf kucuk olmali");
            flag++; // bir ceza puani aldi
        }


        // Son karakter rakam olmali
        if (!(sifre.charAt(sifre.length()-1)>='0' && sifre.charAt(sifre.length()-1)<='9')){
            System.out.println("son karakter rakam olmali");
            flag++;
        }

        // Sifre bosluk icermemeli
        if (sifre.contains(" ")){
            System.out.println("Sifre bosluk icermemeli");
            flag++;
        }

        // Uzunlugu en az 10 karakter olmali
        if (!(sifre.length()>=10)){
            System.out.println("Sifre uzunlugu en az 10 karakter olmali");
            flag++;
        }

        if(flag==0){
            System.out.println("Sifre Olusturuldu!");
        }

    }
}
