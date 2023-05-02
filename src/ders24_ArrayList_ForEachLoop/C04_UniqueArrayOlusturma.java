package ders24_ArrayList_ForEachLoop;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class C04_UniqueArrayOlusturma {
    public static void main(String[] args) {
        // SORU - Verilen bir arraydeki tekrar eden elementleri, tek bir defa barindiran
        // yeni bir array olarak döndüren method olusturun

        int[] arr = {2, 3, 4, 5, 6, 4, 7, 8, 9, 6, 2, 1, 6};
        int[] uniqueArray = uniqueArrayOlustur(arr);

        System.out.println(Arrays.toString(uniqueArray));

    }


    public static int[] uniqueArrayOlustur(int[] arr) {

        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr)); // [1, 2, 2, 3, 4, 4, 5, 6, 6, 6, 7, 8, 9]
        List<Integer> benzersizList = new ArrayList<>();

        // yanindaki elementi kontrol edip, yok ise listeye ekliyor
        for (int i = 0; i < arr.length-1; i++) {
            if (arr[i] != arr[i+1]) {
                benzersizList.add(arr[i]);
            }
        }
        // son elementi kontrol edip, yok ise listeye ekliyoruz
        if (!benzersizList.contains(arr[arr.length-1])){
            benzersizList.add(arr[arr.length-1]);
        }

        // benzersizList ==> [1, 2, 3, 4, 5, 6, 7, 8, 9]
        // benzersiz listenin size bilgisini kullanarak bir array olusturdum
        int[] tekrarsizArr = new int[benzersizList.size()];

        // benzersiz listedeki tüm elemntleri yeni bir array'e atadik
        for (int i = 0; i < tekrarsizArr.length; i++) {
            tekrarsizArr[i] = benzersizList.get(i);
        }

        // olusturdugumuz yeni array'i main methoda dondurduk.
        return tekrarsizArr;
        }
    }
