package ders18_methodOverloading_whileLoop;

public class C02_isAsal {
    public static void main(String[] args) {
        // Verilen 1'den büyük bir tamsayi icin
        // sayi asal ise True
        // sayi asal degil ise False dönen bir method olusturun

        System.out.println(isAsal(20)); // false
        System.out.println(isAsal(43)); // true

        boolean sonuc = isAsal(57); // sonuc variableina "false" degeri atar

    }

    public static boolean isAsal (int sayi){

        int flag = 0;

        for (int i = 2; i < sayi ; i++) {

            if (sayi % i == 0){
                flag ++;
                break;
            }
        }

        if (sayi == 2) {
            return true;
        }
        else if (flag == 0){
            return true;
        } else {
            return false;
        }

    }

}
