package ders40_Final;

final public class B extends A {

    public static void main(String[] args) {

        B obj = new B();
        obj.isim = "Murat";

        System.out.println(A.OKUL);

        System.out.println(Integer.MAX_VALUE);
        System.out.println(Integer.MIN_VALUE);

        /*
        Bir class final olarak belirlenirse
        O Class inherit edilemez.
         */
    }
}
