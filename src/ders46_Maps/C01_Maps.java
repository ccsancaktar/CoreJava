package ders46_Maps;

import java.util.*;

public class C01_Maps {
    public static void main(String[] args) {

        Map<Integer,String> sinifList = new HashMap<>();

        sinifList.put(101,"Ali, Can, JDev");
        sinifList.put(102,"Enes, Cem, Tester");
        sinifList.put(103,"Cihan, Sancak, Java");
        sinifList.put(104,"Derya, Deniz, Tester");

        System.out.println(sinifList);
        // {101=Ali, Can, JDev, 102=Enes, Cem, Tester, 103=Cihan, Sancak, Java, 104=Derya, Deniz, Tester}

        System.out.println(sinifList.keySet()); // KEY DEGERLERINI VERIR - [101, 102, 103, 104]
        System.out.println(sinifList.values());    // VALUE DEGERLERINI VERIR
        System.out.println(sinifList.values().size()); // ELEMENT ADEDI 4

        // Tüm ogrencilerin isim ve soyisimlerini sira no ile birlikte alt alta yazdirin.

        Collection<String> tumValueColl = sinifList.values();

        String[] eachArr;
        int sira = 1;

        for (String each : tumValueColl
             ) {
            // buradaki each bize her bir ogrenciye ait
            // ayni yapidaki isim, soyisim, brans bilgilerini iceren String'ler getiriyor.
            eachArr = each.split(", ");
            System.out.println(sira + "- " + eachArr[0] + " " + eachArr[1]);
            sira ++;
        }


        // Map'de bulunan ogrencilerin isim ve soyisimlerini birlestirerek
        // bir sinif listesi olusturun

        List<String> sinifIsimSoyisimList = new ArrayList<>();

        for (String each : tumValueColl
             ) {
            eachArr = each.split(", ");
            sinifIsimSoyisimList.add(eachArr[0] + " " + eachArr[1]);
        }

        System.out.println(sinifIsimSoyisimList);


    }

}
