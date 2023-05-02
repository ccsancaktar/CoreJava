package ders43_interfaces_iterators;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class M03_Iterator {
    public static void main(String[] args) {

        List<Integer> liste = new ArrayList<>();
        liste.add(10);
        liste.add(20);
        liste.add(30);

        System.out.println(liste); // [10, 20, 30]

        // Liste'deki tüm elementleri INDEX KULLANMADAN 3 artirin.
        for (Integer each:liste
             ) {
            each += 3;
            System.out.print(each + " "); // 13, 23, 33
        }

        System.out.println("");
        System.out.println(liste); // 10, 20, 30

        /*
        Java index yapisi olmayan Collection'lardaki elementlere
        ulasmak ve degistirmek icin, Iterator interface'ini olusturmustur.

         Iterator interface oldugundan, ondan obje uretmemiz mumkun degildir.
         Bunun yerine bize iterator döndüren, Liste,iterator methodunu kullaniyoruz.
         */

        System.out.println(liste); // 10, 20, 30

        Iterator it1 = liste.listIterator();
        System.out.println(it1.next()); // 10
        System.out.println(it1.next()); // 20
        System.out.println(it1.next()); // 30
        //System.out.println(it1.next()); // 30'dan sonra element oladigindan next() RTE verir.

        // Iterator'da geri olmadigindan, adim adim sona ulastiktan sonra
        // basa gelmek isterseniz, yeniden bir iterator olusturmak gerekir.

        // 10, 20, 30
        Iterator it2 = liste.iterator();
        // yeni itarator (it2) kullanarak, listenin tüm elementlerini silelim.
        it2.next();
        it2.remove();
        it2.next();
        it2.remove();
        it2.next();
        it2.remove();
        System.out.println(liste); // iterator ile elementleri gezip remove yapinca
                                   // liste kalici olarak degisti.


        liste.add(10);
        liste.add(20);
        liste.add(30);
        System.out.println("yeniden liste: " + liste); // [10, 20, 30]

        Iterator it3 = liste.iterator();
        while (it3.hasNext()){
            it3.next();
            it3.remove();
        }
        System.out.println("loop'dan sonra liste: " + liste); // []

        /*
        Görüldügü gibi Iterator kullanarak yapabildigim
        1- tüm collection elemntlerini yazdirmak
        2- tüm collection elemntlerini silmek
        Bu da bize yetmez.
         */

    }
}
