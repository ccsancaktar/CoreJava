package ders46_Maps;

import java.security.KeyStore;
import java.util.*;

public class ReusableMethods {

    public static Map<Integer, String> mapOlustur(){

        Map<Integer,String> sinifMap = new HashMap<>();

        sinifMap.put(101,"Ali, Can, JDev");
        sinifMap.put(102,"Enes, Cem, Tester");
        sinifMap.put(103,"Cihan, Sancak, Java");
        sinifMap.put(104,"Derya, Deniz, Tester");
        sinifMap.put(105,"Enes, Can, Tester");
        sinifMap.put(106,"Taha, Deniz, Tester");
        sinifMap.put(107,"Derya, Cem, Tester");

        return sinifMap;
    }

    public static void tumValueSiraliYazdir(Map<Integer, String> ogrenciMap) {
        int sira = 1;
        for (String each: ogrenciMap.values()
             ) {
            System.out.println(sira+ " " + each);
            sira ++;
        }
    }

    public static List<String> isimSoyisimListesiOlustur(Map<Integer, String> ogrenciMap) {
        List<String> methoddakiList = new ArrayList<>();
        String [] eachArr;

        for (String each: ogrenciMap.values()
             ) {
           eachArr = each.split(", ") ;
           methoddakiList.add(eachArr[0] + " " + eachArr[1]);
        }
        return methoddakiList;
    }

    public static void bransOgrencisayisiYazdir(Map<Integer, String> sinifListMap) {

        // "brans = branstaki ogrenci sayisi"
        Map<String, Integer> bransOgrSayiMap = new TreeMap<>();

        Collection<String> valuesColl = sinifListMap.values();
        String[] valueArr;
        String brans;
        Integer branstakiOgrSayisi;

        for (String each: valuesColl
             ) {
            valueArr = each.split(", ");
            brans = valueArr[2];

        // bransin bransOgrSayiMap'inde key olarak daha onceden eklenip eklenmedigini
        // kontrol etmeliyiz.

         if (!bransOgrSayiMap.containsKey(brans)) {
             bransOgrSayiMap.put(brans,1);
         }else {
             branstakiOgrSayisi = bransOgrSayiMap.get(brans);
             bransOgrSayiMap.put(brans,++branstakiOgrSayisi);
         }

        }
        System.out.println(bransOgrSayiMap);

    }


    public static void entryYazdir(Map<Integer, String> sinifListMap) {

        Set<Map.Entry<Integer,String>> sinifListEntrySeti = sinifListMap.entrySet();

        for (Map.Entry<Integer,String> entry: sinifListEntrySeti
             ) {
            System.out.println(entry);
        }
    }
}
