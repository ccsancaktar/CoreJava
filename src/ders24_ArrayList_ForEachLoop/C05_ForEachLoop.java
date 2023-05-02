package ders24_ArrayList_ForEachLoop;

import java.util.ArrayList;
import java.util.List;

public class C05_ForEachLoop {
    public static void main(String[] args) {

        // Bir Loop'da herhangi bir siralamaya ihtiyaciniz yoksa (index lazim degilse!)
        // Amac tüm Array veya Listedeki tüm elemanlara ulasmak ise
        // Sira gözetmeksizin hepsine ulasmak icin ForEachLoop kullanilabilir

        int[] arr = {2,3,4,6,23,6,8,9,1};
        List<Integer> liste = new ArrayList<>();

        // Array'deki tüm elemanlari inceleyelim ve tek sayi olanlari List'e atayalim.

        for (int each: arr // 1- gelecek datalarin türü(int), 2- loop icindeki ismi(each) ve 3- nereden aldigim(arr)
             ) {

            if (each % 2==1){
                liste.add(each);
            }
        }

        System.out.println(liste);

    }
}
