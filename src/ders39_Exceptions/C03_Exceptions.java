package ders39_Exceptions;

public class C03_Exceptions {
    public static void main(String[] args) {

        String str = "123a5";
        int sayi = 0;

        try {
            sayi = Integer.parseInt(str);
        } catch (NumberFormatException e) {
            System.out.println("Yazdiginiz deger sadece rakamlardan olusmalidir");

        }catch (Exception e) {
            System.out.println("Ongurelemeyen bir hata olustu");
        }

        System.out.println("Sayinin karesi = " + sayi*sayi);

        /*
        Kullanicidan String olarak bir deger aliyor
        ve bunu Integer'a ceviriyorsak,
        NumberFormatException ile karsilasabilecegimizi ongoruruz.

        Bu hatayi aldigimizda kodun durmamasini istersek
        Try/Catch ile cevreleyebiliriz.

        Eger bilmedigim bir Exceptions daha olusursa ve kodun durmamasini istiyorsak,
        Bir kez daha Catch ekleyerek, en genis Exception'i yazabiliriz.
         */
    }
}
