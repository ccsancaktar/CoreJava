package ders26_Constructor;

public class Kamyon {

    public String marka = "Marka Belirtilmedi";
    public String model = "Model Belirtilmedi";
    public int yil;
    public int fiyat;

    public Kamyon(String marka, String model, int yil, int fiyat) {
        this.marka = marka;
        this.model = model;
        this.yil = yil;
        this.fiyat = fiyat;
        /*
        Bizim temel amacimiz, KamyonRunner'da argument olarak girilen degerin
        Kamyon classinda Instance variable'a atanmasi.
        Ancak Scope konusunda ogrendigimiz gibi,
        Kamyon Constructor scopu'unda Marka oldugu icin
        Instance marka'ya gitmiyor.

        Bu karisikligi gidermek icin instance variable'lari
        belirli hale getirmemiz lazim.
        Java bunun icin "this" keyword'u olusturmustur.

        Genel kullanim acisindan this keywordu kodu herkesin
        anlamasini kolaylastirdigi icin tercih edilir.
         */
    }

    public Kamyon(String marka, String model) {
        this.marka = marka;
        this.model = model;
    }

    public Kamyon(){

    }

    @Override
    public String toString() {
        return
                "\nmarka= " + marka +
                "\nmodel= " + model +
                "\nyil= " + yil +
                "\nfiyat= " + fiyat;
    }
}
