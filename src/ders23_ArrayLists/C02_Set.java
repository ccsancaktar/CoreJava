package ders23_ArrayLists;

import java.util.ArrayList;
import java.util.List;

public class C02_Set {
    public static void main(String[] args) {
        /*
        Elimizde urunlerin buundugu bir liste var.
        ürün listesindeki istenen siradaki urunu,
        istegidimiz yeni ürünle degistirip,
        eski urunu, var olan eski urunler listesine ekleyelim.
         */

        List<String> urunler = new ArrayList<>();
        urunler.add("Nutella");
        urunler.add("Ikram");
        urunler.add("Cekirdek");
        urunler.add("Cay");

        List<String> eskiUrunler = new ArrayList<>();
        // Listedeki "ikram" yerine "biskrem" koyalim
        // Ikram'i da eskiUrunler listesine ekleyelim

        String yeniUrun = "Biskrem";
        String silinecekUrun = "Ikram";

        int temp = urunler.indexOf(silinecekUrun);
        String silinenUrun = urunler.set(temp,yeniUrun);

        eskiUrunler.add(silinenUrun);

        System.out.println("Urunler Listesi: " + urunler);
        System.out.println("Eski Urunler Listesi: " + eskiUrunler);

        System.out.println("===============================");

        yeniUrun = "Kahve";
        silinecekUrun = "Cay";

        temp = urunler.indexOf(silinecekUrun);
        silinenUrun = urunler.set(temp,yeniUrun);

        eskiUrunler.add(silinenUrun);

        System.out.println("Urunler Listesi: " + urunler);
        System.out.println("Eski Urunler Listesi: " + eskiUrunler);

        System.out.println("===============================");

        yeniUrun = "Findik";
        silinecekUrun = "Cekirdek";

        temp = urunler.indexOf(silinecekUrun);
        silinenUrun = urunler.set(temp,yeniUrun);

        eskiUrunler.add(silinenUrun);

        System.out.println("Urunler Listesi: " + urunler);
        System.out.println("Eski Urunler Listesi: " + eskiUrunler);
    }
}
