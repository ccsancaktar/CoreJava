package ders48_Maps_TheEnd;

import ders46_Maps.ReusableMethods;
import java.util.Map;

public class C02_MapMethodlari {
    public static void main(String[] args) {

        Map<Integer,String> sinifListMap = ReusableMethods.mapOlustur();
        ReusableMethods.entryYazdir(sinifListMap);

        sinifListMap.clear();
        System.out.println("Clear'dan sonra: " + sinifListMap); // Clear'dan sonra: {}

        sinifListMap = ReusableMethods.mapOlustur();
        System.out.println(sinifListMap.getOrDefault(104, "Aradiginiz key yok"));
        // Derya, Deniz, Tester
        System.out.println(sinifListMap.getOrDefault(134, "Aradiginiz key yok"));
        // Aradiginiz key yok

        System.out.println(sinifListMap.isEmpty()); // false

        sinifListMap.putIfAbsent(104,"Derya, Okyanus, Developer");
        sinifListMap.putIfAbsent(108,"Aysun, Can, DevOps");
        ReusableMethods.entryYazdir(sinifListMap);

        /*
        SinifListMap"e, key 106 yoksa, value "Mevlut, Han, Tester" ekleyin
        daha onceden var ise, eski datayi degistirmek istediginizden emin misiniz yazdirin.

         106'nin oldugunu kontrol etmek icin containsKey daha mantikli ama biz
         yeni ogrendigimiz method ile yapalim.

         map.putIfAbsent (key, value) ==> key varsa
         ekleme yapmaz, bize o key ile kayitli olan value'yi döndürür
         ==> key daha onceden map'e eklenmemisse
         eklemeyi yapar ve bize null dondurur.
         */

        System.out.println(sinifListMap.putIfAbsent(106,"Mevlut, Han, Tester"));
        // Taha, Deniz, JDev

        if (sinifListMap.putIfAbsent(106,"Mevlut, Han, Tester")==null){
            System.out.println("Kayit Basarili");
        } else {
            System.out.println("Eski degeri degistirmek istediginizden emin misiniz?");
        }
        System.out.println(sinifListMap.putIfAbsent(109,"Mevlut, Han, Tester"));
        ReusableMethods.entryYazdir(sinifListMap);

        sinifListMap.remove(106); // 106'yi silip bana sildigini dondurur.
        sinifListMap.remove(107,"Derya, Can, Tester"); // silerse true, silmezse false dondurur.
        ReusableMethods.entryYazdir(sinifListMap);

    }
}
