package ders25_Constructor;

public class Car {
    /*
    Bu Class bizim kalip hanemiz;
    Bir araba olusturmak icin ihtiyacimiz olan
    Variable ve methodlari bu class'da belirleriz

    sonra farkli class'larda araba olsturmamiz gerekirse
    o classta bir obje olusturup, burada belirlenen
    Variable ve methodlara göre araba uretiriz.
     */

    public String marka = "Marka Belirtilmedi";
    public String model = "Model Belirtilmedi";
    public int yil;
    public int fiyat;


    public void benzinliAracMethodu(){
        System.out.println("Bu arac benzinli motora sahiptir.");
    }

    public void maksimumHiz(int hiz){
        System.out.println("Bu araba maksimum " + hiz + " km hiz yapar.");
    }
}
