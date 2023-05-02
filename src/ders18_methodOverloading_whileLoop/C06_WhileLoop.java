package ders18_methodOverloading_whileLoop;

import java.util.Scanner;

public class C06_WhileLoop {
    public static void main(String[] args) {
        // Kullanicidan toplanmak üzere sayilar alin,
        // toplam 500'ü asinca kac sayi girdigini ve sayilarin toplamini yazdirin

        Scanner scan = new Scanner(System.in);

        int girilenSayi= 0;
        int toplam = 0;
        int girilenSayiAdeti= 0;

        while (toplam < 500){ // Toplam 500'den oldugu sürece
        System.out.println("Toplanmak uzere bir tamsayi giriniz");
        girilenSayi = scan.nextInt();

        toplam += girilenSayi;
        girilenSayiAdeti++;
        }

        System.out.println("Toplam " + girilenSayiAdeti + " adet sayi girildi ve toplami: " + toplam);



    }
}
