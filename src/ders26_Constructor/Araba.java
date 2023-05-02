package ders26_Constructor;

public class Araba {

    public String marka = "Marka Belirtilmedi";
    public String model = "Model Belirtilmedi";
    public int yil;
    public int fiyat;

    public Araba(String markaR, String modelR, int yilR, int fiyatR) {
        marka = markaR;
        model = modelR;
        yil = yilR;
        fiyat = fiyatR;
    }
    public Araba(){

    }
    /*
    biz herhangi bir constructor olusturdugumuzda,
    Java default constructoru siler.
    Eger biz projemizde bir sorun yasanmasini istemiyorsak
    mutlaka default constructor yerine, parametresiz bir cons. olusturmaliyiz.
     */


    public void benzinliAracMethodu(){
        System.out.println("Bu arac benzinli motora sahiptir.");
    }

    public void maksimumHiz(int hiz){
        System.out.println("Bu araba maksimum " + hiz + " km hiz yapar.");
    }


}
