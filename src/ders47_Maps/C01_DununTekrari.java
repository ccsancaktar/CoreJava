package ders47_Maps;

import ders46_Maps.ReusableMethods;

import java.util.Map;

public class C01_DununTekrari {
    public static void main(String[] args) {
        Map<Integer,String> sinifListMap = ReusableMethods.mapOlustur();
        System.out.println(sinifListMap);

        // ogrenci listesini isim soyisim brans olarak yazdirin
        ReusableMethods.tumValueSiraliYazdir(sinifListMap);

        // Kac farkli brans varsa "bransIsmi = branstakiOgrencisayisi" seklinde yazdirin
        ReusableMethods.bransOgrencisayisiYazdir(sinifListMap);

    }
}
