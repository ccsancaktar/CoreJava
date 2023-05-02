package ders16_ForLoop;

public class C09_NestedForLoop {
    public static void main(String[] args) {

        // Dinamik olarak verilen satir sütun sayisina gore
        // Yildizlardan bir diktortgen olusturun

        /*
         * * * * *
         * * * * *
         * * * * *
         */

        int satirsayisi = 3;
        int sutunsayisi = 5;


        //////////////////////////////////////////////

        for (int k = 1; k <= satirsayisi; k++) { // satir sayisini kontrol ediyor

            for (int i = 1; i <= sutunsayisi; i++) { // sutun sayisini kontrol ediyor
                System.out.print("* ");
            }
            System.out.println(""); // bir satirdaki tum sutunlar bitince alt sutuna geciyor
        }

        //////////////////////////////////////////////

        System.out.println("========");

        for (int i = 1; i <= satirsayisi ; i++) { // satirlar

            for (int j = 1; j <= sutunsayisi ; j++) { // sutunlar

                System.out.print("* ");
            }
            System.out.println("");
        }


    }
}
