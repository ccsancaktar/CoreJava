package ders47_Maps;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class C02_TekrarSayisiBulma {
    public static void main(String[] args) {
        // verilen bir string'deki kullanilan harfleri,
        // ve kullanilan harflerin tekrar sayisini,
        // Örnek; "H = 20" seklinde yazdirin.

        String str = "Heeeelloooooo Woooorrrrllldddddd.";
        str = str.replaceAll("\\W",""); //spaceleri saymamasi icin once onlari yok edelim.

        String[] harflerArr = str.split("");

        System.out.println(Arrays.toString(harflerArr));
        // [H, e, e, e, e, l, l, o, o, o, o, o, o, W, o, o, o, o, r, r, r, r, l, l, l, d, d, d, d, d, d]
        // Harfleri key, kullanim adetini de value yaparak bir map olusturalim.
        Map<String, Integer> harfKullanimSayiMap = new HashMap<>();
        Integer harfkullanimSayisi;

        for (String each: harflerArr
             ) {
            if (!harfKullanimSayiMap.containsKey(each)){
                harfKullanimSayiMap.put(each,1);
            } else{
                harfkullanimSayisi = harfKullanimSayiMap.get(each);

                harfKullanimSayiMap.put(each,++harfkullanimSayisi);
            }
        }
        System.out.println(harfKullanimSayiMap);


    }
}
