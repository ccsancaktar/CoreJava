package ders42_AbstractClass_Interfaces;

public interface I03_Interfaces {

    int SAYI = 20;

    /* int sayi;
    Interface'lerde tüm variable'lar public static ve final'dir
    dolayisiyla sonradan deger atama sansimiz yoktur.
    Bunun icin variable olusturdugumuzda mutlaka deger atamaliyiz.
     */

    void yakit();
    /*
        Interface icindeki her method
        public ve abstract ozelliklere sahiptir. (yazsak da yazmasak da.)


     */

    public void motor();
    public abstract void teker();


}
