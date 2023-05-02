package ders29_PassByValue_Immutable;

import java.util.ArrayList;
import java.util.List;

public class C03_PassByValue {
    public static void main(String[] args) {
        /*
        bir list olusturalim,
        iki ayri method'dan birinde
        sadece elemanlari degistirelim

        digerinde, yeni bir list atayip,
        ayni sayida yeni eleman ekleyelim.

        ver her iki method call'dan sonra kendi listemizi
        main method icerisinde kontrol edelim.
         */

        List<String> list = new ArrayList<>();
        list.add("Ali");
        list.add("Veli");
        list.add("Can");

        System.out.println("Ilk bastaki list " + list); // [Ali, Veli, Can]

        elemanlariDegistir(list);
        System.out.println("elemanlariDegistir Methodu'ndan sonra" + list);
        // [Oguz, Murat, Fatih]

        ListDegistir(list);
        System.out.println("ListDegistir Methodu'ndan sonra " + list);
        // [Oguz, Murat, Fatih]
    }


    public static void ListDegistir(List<String> list) {
        list = new ArrayList<>();
        list.add("Nutella");
        list.add("Cay");
        list.add("Cokokrem");

        System.out.println("ListDegistir Methodu'nda " + list);
        // [Nutella, Cay, Cokokrem]
    }

    public static void elemanlariDegistir(List<String> list) {

        list.set(0, "Oguz");
        list.set(1, "Murat");
        list.set(2, "Fatih");
        System.out.println("elemanlariDegistir Methodu'nda " + list);
        // [Oguz, Murat, Fatih]
    }
}
