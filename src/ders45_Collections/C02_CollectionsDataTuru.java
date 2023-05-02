package ders45_Collections;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class C02_CollectionsDataTuru {
    public static void main(String[] args) {
        /*
        Collections <dataturu>'nu Object secmemiz durumunda
        Collections'a farkli data turleri koymamiza izin verir.
        Bu depolama acisindan bize esneklik saglar,
        Ancak islem yaparken tüm objeleri Object olarak tanimladigimizdan
        cok fazla Casting yapmamiz gerekebilir.
         */

        List<String> liste = new ArrayList();
        // liste.add(5);
        // liste.add('s');
        // liste.add(true);

        List<Object> list = new ArrayList();
        list.add(5);
        list.add('s');
        list.add(true);
        list.add("Ali");
        System.out.println(list); // [5, s, true, Ali]

        list.set(0,(Integer)list.get(0)+5); // [10, s, true, Ali]
        list.set(3,list.get(3)+" Can"); // [10, s, true, Ali Can]
        list.set(2,!(Boolean)list.get(2)); // [10, s, false, Ali Can]

        System.out.println(list);


        Set<Object> set1 = new HashSet<>();
        set1.add(5);
        set1.add('s');
        set1.add(true);

    }
}
