package ders21_Arrays;

public class C02_EnUzunVeKisaKelime {
    public static void main(String[] args) {
        // SORU - Verilen String bir array'de
        // en uzun ve en kisa String'leri yazdiran bir method olusturun.

        String[] isimler = {"Ali", "Veli", "Cagatay", "Osman"};

        enUzunEnKisa(isimler);

    }

    public static void enUzunEnKisa(String[] isimler) {

        String kisa = isimler[0];
        String uzun = isimler[0];

        for (int i = 1; i < isimler.length ; i++) {
            if (isimler[i].length() > uzun.length()) {
                uzun = isimler[i];
            }
            if (isimler[i].length() < kisa.length()){
                kisa = isimler[i];
            }
        }

        System.out.println("Array'deki En Kisa Kelime: " + kisa);
        System.out.println("Array'deki En Kisa Kelime: " + uzun);

    }
}
