package ders44_Collections;

import java.util.Deque;
import java.util.LinkedList;

public class C05_LinkedList_DequeDataTuru {
    public static void main(String[] args) {

        Deque<String> ll4 = new LinkedList();
        ll4.add("Cavidan");
        ll4.add("Mesut");
        ll4.add("Selim");
        ll4.add("Tevfik");
        ll4.add("Selim");

        ll4.removeLastOccurrence("Selim"); // sondaki Selim'i sildi
        System.out.println(ll4); // [Cavidan, Mesut, Selim, Tevfik]

        // Queue ile herseyi aynidir.
        // Tek farki, queue de sadece sondan ekleyip bastan siliyordu.
        // Fakat Deque'te ise ister bastan ister sondan tum islemler yapilabilmekte.

    }
}
