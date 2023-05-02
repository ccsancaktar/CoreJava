package ders44_Collections;

import java.util.Deque;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class C03_LinkedList_ListDataTuru {
    public static void main(String[] args) {

        LinkedList<String> ll1 = new LinkedList();

        List<String> ll2 = new LinkedList();

        Queue<String> ll3 = new LinkedList();

        Deque<String> ll4 = new LinkedList();


        ll2.add("Berk");
        ll2.add("Cihan");
        ll2.add("Ayse");
        ll2.add("Cagatay");

        System.out.println(ll2); // [Berk, Cihan, Ayse, Cagatay]
        System.out.println(ll2.remove(3)); // Cagatay cikti.
        // Eger listemiz integer elementlerden olusuyorsa,
        // direkt sayi yazarsak index olarak kabul eder.
        // ama bir variable'a atama yapar ve remove'da o variable ismini yazarsak obje olarak kabul eder.
        System.out.println(ll2.remove("Murat")); // false
        System.out.println(ll2.isEmpty()); // false

        ll2.set(0,"Serap");
        System.out.println(ll2); // [Serap, Cihan, Ayse]

        ll1.add("Serap");
        ll1.add("Ismail");
        System.out.println(ll1); // [Serap, Ismail]

        ll2.retainAll(ll1); // ll2'deki tüm elementleri, ll1 ile karsilastirir
                            // ll1'de olmayanarin hepsini siler.
        System.out.println(ll2); // [Serap]


    }
}
