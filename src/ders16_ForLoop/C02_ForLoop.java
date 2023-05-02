package ders16_ForLoop;

public class C02_ForLoop {
    public static void main(String[] args) {
        // 1 ile 1000 arasindaki sayilari yan yana yazdirin
        // yazdirma islemi bittiginde, tüm sayilarin toplami = diyerek
        // sayilarin toplamini yazdirin

        int sayilarinToplami=0;

        for (int i = 1; i <= 1000 ; i++) {

            System.out.print(i + " ");
            //sayilarinToplami = sayilarinToplami+i;
            sayilarinToplami +=i;
        }
        System.out.println("");
        System.out.println("Sayilar Toplami= " + sayilarinToplami);

    }
}
