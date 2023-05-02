package ders21_Arrays;

import java.net.Socket;
import java.util.Arrays;

public class C06_ArrayElemanEkleme {
    public static void main(String[] args) {
        // C05'deki method'u kullanarak array'e eleman ekleyelim

        String[] takimListesi = {"Ali", "Veli"};
        String eklenecekIsim = "Timur";

        takimListesi = C05_ArrayElementEkleme.elemanEkle(takimListesi,eklenecekIsim);

        System.out.println(Arrays.toString(takimListesi));
    }
}
