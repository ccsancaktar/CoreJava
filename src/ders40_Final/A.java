package ders40_Final;

public class A {

    protected String isim = "Cagatay";
    final static String OKUL = "Sancak Koleji";
    /*
    Bir variable final olarak tanimlandiysa
    farkli classlardan veya icinde oldugumuz class'dan
    baska deger atanmasi mümkün degildir.

    Madem ki degeri degistirilemiyor,
    genellikle Static de yapilarak
    bu variable'a erisim kolaylastirilabilir.
    Static Final Variable isimleri de BÜYÜK YAZILMALIDIR.
     */


    final void finalMethod(){
        System.out.println("Final Methodlar override edilemez");
        /*
        bir methodu final olarak isaretlerseniz
        bu method degistirilemez demektir.
        (override edilemez)
         */
    }
}
