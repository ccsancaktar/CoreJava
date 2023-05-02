package ders20_Scope_Arrays;

public class C01_Hastane {
    public static void main(String[] args) {

        ADoktor dok1 = new ADoktor();
        System.out.println(dok1.askerlikYaptiMi); // false
        dok1.isim = "Kemal";
        dok1.soyisim = "Yilmaz";
        dok1.dogumYili = 1980;

        System.out.println(dok1.isim); // Kemal


        ADoktor dok2 = new ADoktor();
        System.out.println(dok2.isim); // null
        dok2.soyisim = "Celik";
        System.out.println(dok2.soyisim); // Celik


        System.out.println(dok1.fakulte); // Tip
        System.out.println(dok2.fakulte); // Tip

        /*
        Asagida dok1 ismi degisti fakat instance oldugu icin
            dok2'yi etkilemedi.
        Fakat dok1 fakultesi degisince digerleri de degisti.
            Cunku fakulte Static ve herkesi etkiledi.
         */

        dok1.isim = "Burcu";
        System.out.println(dok2.isim); // null

        dok1.fakulte = "Tip fakultesi";
        System.out.println(dok2.fakulte); // Tip Fakultesi

        ADoktor dok3 = new ADoktor();
        System.out.println(dok3.dogumYili); // 0
        System.out.println(dok3.fakulte); // Tip Fakultesi

        System.out.println(ADoktor.fakulte);
        // static variable'lar icin tavsiye edilen erisim yontemi
        // classIsmi.staticUyeIsmi seklinde yazilir.
        // bu kullanima static yontem ismi verilir.
    }
}
