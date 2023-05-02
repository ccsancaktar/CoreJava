package ders16_ForLoop;

public class C11_NestedForLoop {
    public static void main(String[] args) {
        /*
            Verilen satir sayisina gore
            asagidaki sekli olusturan kod yaziniz
        *
        * *
        * * *
        * * * *

         */

        int satir = 4;

        for (int i = 1; i <= satir ; i++) { // satirlar Outer Loop / Dis Loop

            for (int j = 1; j <=i ; j++) {  // sutunlar - inner Loop / ic loop

                System.out.print("* ");
            }

            System.out.println("");
        }


    }

}
