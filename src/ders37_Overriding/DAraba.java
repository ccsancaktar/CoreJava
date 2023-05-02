package ders37_Overriding;

public class DAraba {

   private void yakit(){
        System.out.println("Tüm arabalar yakit kullanir.");
   /*
   Parent class'tan override edilmesini istemediginiz methodlari
   private, static veya final yapabilirsiniz.
    */
   }

    void marka(){
        System.out.println("Tüm arabalarin markasi vardir");
    }

    void motor(){
        System.out.println("Tüm arabalarin motoru vardir");
    }
}
