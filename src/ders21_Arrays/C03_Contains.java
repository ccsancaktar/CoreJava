package ders21_Arrays;

import java.util.Scanner;

public class C03_Contains {
    public static void main(String[] args) {
        // Kullanicidan alginiz bir ismin, verilen array'de olup olmadigini kontrol edip,
        // bize true yada false donduren bir method olusturun.

        String[] isimler = {"Ali", "Fatma", "Cagatay", "Fatih", "Sevda"};

        Scanner scan = new Scanner(System.in);
        System.out.println("Bir isim giriniz:");
        String arananIsim = scan.nextLine();

        boolean geciyorMu = contains(isimler,arananIsim);

        if(geciyorMu){
            System.out.println("Girilen isim listede var.");
        } else {
            System.out.println("Girilen isim listede yok.");
        }
    }

    private static boolean contains(String[] isimler, String arananIsim) {

        boolean methodSonuc = false;

        for (int i = 0; i < isimler.length; i++) {

            if (isimler[i].equalsIgnoreCase(arananIsim)){
                methodSonuc=true;
            }
        }


        return methodSonuc;
    }

}
