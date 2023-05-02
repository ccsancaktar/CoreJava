package ders18_methodOverloading_whileLoop;

public class C01_AsalSayiYazdir {
    public static void main(String[] args) {
        // Verilen pozitif bir tam sayiniN
        // Asal sayi olup olmadigini yazdiran bir method olusturun

        asalMiYazdir(20);
        asalMiYazdir(35);
        asalMiYazdir(23);

    }

    public static void asalMiYazdir(int sayi){

        int flag = 0;

        for (int i = 2; i < sayi ; i++) {

            if (sayi % i == 0){
                flag ++;
                break;
            }
        }

        if (sayi == 2) {
            System.out.println("Girilen 2 sayisi Asal sayidir");
        }
        else if (flag == 0){
            System.out.println("Girilen " + sayi + " sayisi Asal sayidir.");
        } else {
            System.out.println("Girilen " + sayi + " sayisi Asal degildir.");
        }

    }

}
