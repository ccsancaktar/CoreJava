package ders37_Overriding;

public class FSupra extends EToyota {

    void yakit(){
        System.out.println("Supra benzin kullanir.");
        /*
        Private methodlar override edilemez.
        Eger child class'ta parent class'taki private method ile
        ayni signature'da bir method olusturursaniz
        bu overriding method OLMAZ.
        */
    }

    @Override
    void motor() {
        /*
        @Override notasyonu Javaya bir gorev verir.
        Java bu notasyon ile birbirine bagli olan iki methodu sürekli kontrol eder.
        Eger parent class'daki overridden methodu silerseniz,
        CTE verir.

        @Override notasyonu kullanmak mecburei degildir.
        Eger overridde method silindiginde kodun CTE vermesini istersek
        @Override notasyonu kullanmaliyiz.
         */
    }
}
