package ders44_Collections;

import java.util.LinkedList;
import java.util.Queue;

public class C04_LinkedList_QueueDataTuru {
    public static void main(String[] args) {

        Queue<String> ll3 = new LinkedList<>();
        ll3.add("Adem");
        ll3.add("Havva");
        ll3.add("Cihan");
        ll3.add("Sancak");

        // Queue, kuyruk demektir. Sira onemlidir.
        // gelen sona gelir, giden bastan gider.

        System.out.println(ll3); // [Adem, Havva, Cihan, Sancak]

        System.out.println(ll3.remove()); // Adem (bastakini sildi)

        System.out.println(ll3); // [Havva, Cihan, Sancak]

        System.out.println(ll3.remove("Cihan")); // true

        System.out.println(ll3); // [Havva, Sancak]

        System.out.println(ll3.element()); // Havva - Siranin basinda kim var?
        System.out.println(ll3.peek()); // Havva - ayni gorev.


        Queue<String> ll4 = new LinkedList<>();
        // System.out.println(ll4.element()); // trows exception
        System.out.println(ll3.peek()); // null
        // peek ve element silmeden ilk elementi bize dondurur
        // bos liste olursa, peek null dondurur, element ise exception

        ll3.offer("Ahmet");
        System.out.println(ll3); // [Havva, Sancak, Ahmet] => .add ile ayni

        System.out.println(ll4.poll()); // null (bos degilse, bastakini getirir ve siler)
        System.out.println(ll4.remove()); // throws Exception

    }
}
