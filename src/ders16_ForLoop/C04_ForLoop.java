package ders16_ForLoop;

public class C04_ForLoop {
    public static void main(String[] args) {
        // input olarak verilen sayidan baslayarak
        // 7'ser 7'ser artirarak input olarak verilen bitis sayisina kadar
        // - tum sayilari
        // - kac adet sayi oldugunu
        // - ve bu sayilarin toplaminin kac oldugunu yazdirin

        int inputBas = 34;
        int inpusBitis = 563;

        int sayac=0;
        int toplam=0;

        for (int i = 34; i <= 563 ; i+=7) {
            System.out.print(i + " ");
            sayac++;
            toplam+=i;
        }

        System.out.println(" ");
        System.out.println("Toplam " + sayac + " adet sayi var.");
        System.out.println("Bu sayilarin toplami: " + toplam);

    }
}
