package ders22_MultiDimensionalArrays;

public class C02_MDATumElementleriYazdirma {

    public static void main(String[] args) {
        // Verilen bir Multi Dimensional Array'in
        //tüm elementlerini yazdiran bir method hazirlayin

        int[][] sayilar = {{1,5,6,9,4},{2,5,5,8},{3,1,6}};

        elementleriYazdir(sayilar);

    }


    public static void elementleriYazdir(int[][] sayilar) {

        for (int i = 0; i < sayilar.length; i++) { // 1- "0,1,2" degerleri alacak

            for (int j = 0; j < sayilar[i].length; j++) { // inner arraylerin uzunluguna bagladik
                System.out.print(sayilar[i][j]+ " "); // 1 5 6 9 4 2 5 5 8 3 1 6
            }

        }

    }
}
