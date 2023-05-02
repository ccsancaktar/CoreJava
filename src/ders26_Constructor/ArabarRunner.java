package ders26_Constructor;

import ders25_Constructor.Car;

public class ArabarRunner {
    public static void main(String[] args) {

        // Bir gun önceki Car Class'indan obje olusturalim
        /*
        Farkli bir package'daki bir class'tan obje olusturdugumuzda
        access modofierlari da dikkate almaliyiz
         */
        Car car1 = new Car();
        System.out.println(car1.fiyat);

        /*
        Araba class'indan bir obje olusturdugumda
        eger default constructor kullanildiysa
        tüm ozellikler icin tek tek deger atamak zorunda kaliriz
         */

        Araba araba1 = new Araba();

        araba1.fiyat = 100000;
        araba1.marka = "Mercedes";
        araba1.yil = 2010;
        araba1.model = "C180";

        System.out.println("Araba1 Bilgileri" +
                "\nMarka : " + araba1.marka +
                "\nModel :" + araba1.model +
                "\nYil: " + araba1.yil +
                "\nFiyat: " + araba1.fiyat);

        /*
        Eger bir objeyi olustururken bazi ozelliklerini
        argument olara belirtip o ozelliklerde bir obje olusturmak istersek
        Java itiraz eder.
        Cünkü her class'ta default constructor vardir
        ama o da parametresizdir.
        Bizim yeni ve parametreli constructorlara ihtiyacimiz var.
         */
        Araba araba2 = new Araba("BMW", "5.20", 2011, 15000);
        System.out.println("Araba2 Bilgileri" +
                "\nMarka : " + araba2.marka +
                "\nModel :" + araba2.model +
                "\nYil: " + araba2.yil +
                "\nFiyat: " + araba2.fiyat);


        Araba araba3 = new Araba("Opel", "Astra", 2015, 78000);
        System.out.println("Araba3 Bilgileri" +
                "\nMarka : " + araba3.marka +
                "\nModel :" + araba3.model +
                "\nYil: " + araba3.yil +
                "\nFiyat: " + araba3.fiyat);


        Araba araba4 = new Araba("Audi", "A5", 2020, 50000);
        System.out.println("Araba4 Bilgileri" +
                "\nMarka : " + araba4.marka +
                "\nModel :" + araba4.model +
                "\nYil: " + araba4.yil +
                "\nFiyat: " + araba4.fiyat);

    }
}
