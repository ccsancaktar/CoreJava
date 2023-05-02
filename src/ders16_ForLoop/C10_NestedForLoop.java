package ders16_ForLoop;

public class C10_NestedForLoop {
    public static void main(String[] args) {
        /*
        1               1. Satir 1'den 1'e kadar yazdir
        1 2             2. Satir 1'den 2'e kadar yazdir
        1 2 3           3. Satir 1'den 3'e kadar yazdir
        1 2 3 4         4. Satir 1'den 4'e kadar yazdir
         */

        int satir = 4;

        for (int i = 1; i <= satir ; i++) { // satirlar

            for (int j = 1; j <= i ; j++) {
                System.out.print(j + " ");
            }
            System.out.println("");
        }
    }
}
