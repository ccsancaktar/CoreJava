package ders11_ternaryOperators;

import java.util.Scanner;

public class C04_ternary {
    public static void main(String[] args) {
        /*
        Kullanicidan 2 sayi alin.
        Buyuk olmayan sayiyi yazdirin.
         */

        Scanner scan = new Scanner(System.in);
        System.out.println("Birinci sayi");
        int sayi1 = scan.nextInt();
        System.out.println("Ikinci sayi:");
        int sayi2 = scan.nextInt();

        System.out.println(sayi1>sayi2 ? sayi1 : sayi2);

    }
}
