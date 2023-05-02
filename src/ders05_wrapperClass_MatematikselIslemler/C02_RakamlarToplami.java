package ders05_wrapperClass_MatematikselIslemler;
import java.util.Scanner;
public class C02_RakamlarToplami {
    public static void main(String[] args) {
        // Kulanicidan alinan 3 basamakli pozitif bir tam sayinin
        // rakamlar toplamini bulun

        System.out.println(23 / 5); // 4,6 ==> 4

        System.out.println( 123%10); // 3
        System.out.println(123/10); // 12.3 ==> 12

        Scanner scan= new Scanner(System.in);
        System.out.println("Lutfen 3 basamakli tam sayi giriniz");
        int sayi= scan.nextInt(); // mesela 123

        int birlerBas=0;
        int rakamlarToplami = 0;

        // 3 basamak icin islemi 3 kere yapmaliyiz.
        // girien sayinin birler basamagindaki 3 icin

        birlerBas=sayi%10; // 3
        rakamlarToplami=rakamlarToplami+birlerBas; // 3
        sayi= sayi / 10; // 12,3 bulacak int oldugu icin 12 atayacak

        // girien sayinin onlar basamagindaki 2 icin
        birlerBas=sayi%10; // 12 % 10 ==> 2
        rakamlarToplami=rakamlarToplami+birlerBas; // 3 + 2 = 5
        sayi=sayi/10; // 12/10 = 1.2 ==> 1

        // girilen sayinin yuzler basamagindaki 1 icin
        birlerBas=sayi%10; // 1 % 10 = 1
        rakamlarToplami=rakamlarToplami+birlerBas; // 5 + 1 = 6
        sayi=sayi/10;// 1 / 10 = 0,1 == intiger degeri 0 verecek.

        System.out.println("Sayinin rakamlar toplami= " + rakamlarToplami);

    }
}
