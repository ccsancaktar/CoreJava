package ders17_methodOlusturma;

public class C03_FaktöryelMethodu {
    public static void main(String[] args) {
        // METHOD BASKA BIR CLASS'DAN DA CAGIRILABILIR
        // C02_MethodOlusturma.ikiSayiTopla();

        // Verdigimiz bir sayinin faktoriyelini hesaplayip
        // Sonucu bize donduren bir method olusturun

        int sonuc = faktoriyelHesapla(5);
        System.out.println(sonuc);
        /*

        Method olusturma asamalari
        1- Public Static standart (simdilik)
        2- olusturdugumuz method bize bir sonuc dondurecekse;
            dondurecegi sonucun data turunu yaziyoruz.
        3- Method ismi
        4- Method parantezi () icine methoda gondermemiz gereken bilgileri
            hangi variable ile gonderecegimizi yaz. (parametre)
        5- Döndürülmesi istenen islemi yap
        6- return keyword kullanarak dondurulmesi istenen degeri dondur

         */

    }

    public static int faktoriyelHesapla(int sayi){   // 5

        int faktoriyel = 1;
        for (int i = sayi; i >= 1 ; i--) {

            faktoriyel *= i;
        }
        return faktoriyel;

    }

}
