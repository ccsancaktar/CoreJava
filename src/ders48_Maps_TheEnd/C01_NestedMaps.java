package ders48_Maps_TheEnd;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;


public class C01_NestedMaps {
    public static void main(String[] args) {
        /*
         Eger bir element ile ilgili tutacagimiz bilgiler coksa ve kompleks ise,
         bu defa ic ice map kullanmayi tercih edebiliriz.

         ic ice map kullandiginizda daha fazla detayi
         daha duzenli olarak tutma imkanimiz olur.
         Ancak, bilgiye ulasmak ve manipule etmek zorlasacaktir.

         Ornek olarak map'imizi map'lerden olusan bir map olarak olusturalim
         sinifMap.put(no=101,isim= Enes, soyisim= Cem, brans= Tester");
         sinifMap.put(102,"Cihan, Sancak, Java");
         sinifMap.put(103,"Derya, Deniz, Tester");
        */

        Map<String, String> ogr101 = new HashMap<>();
        ogr101.put("isim","Enes");
        ogr101.put("soyisim","Cem");
        ogr101.put("brans","Tester");

        Map<String, String> ogr102 = new HashMap<>();
        ogr102.put("isim","Cihan");
        ogr102.put("soyisim","Sancak");
        ogr102.put("brans","Java");

        Map<String, String> ogr103 = new HashMap<>();
        ogr103.put("isim","Derya");
        ogr103.put("soyisim","Deniz");
        ogr103.put("brans","Tester");

        Map<Integer,Map<String,String>> ogrenciNestedMap = new HashMap<>();
        ogrenciNestedMap.put(101,ogr101);
        ogrenciNestedMap.put(102,ogr102);
        ogrenciNestedMap.put(103,ogr103);

        Set<Map.Entry<Integer,Map<String,String>>> ogrenciEntrySet = ogrenciNestedMap.entrySet();
        for (Map.Entry each: ogrenciEntrySet
             ) {
            System.out.println(each);
        }

        // 102 nolu kisinin ismini yazdiralim
        System.out.println(ogrenciNestedMap.get(102).get("isim"));

    }
}
