package ders16_ForLoop;

public class C06_Faktoriyel2 {
    public static void main(String[] args) {
        // Kullanicidan 20'den kucuk bir sayi alip,
        // bu sayinin faktoriyel degerini hesaplayin.
        // Konsola faktoriyel hesabin yapilisini yazdirin.
        // Or; 6! = 6 * 5 * 4 * 3... = 720

    int sayi = 6;
    int faktoriyel = 1;

        System.out.print(sayi+"!= ");
    for (int i = sayi; i >=1 ; i--) {

        faktoriyel *=i ;

    if (i!=1){
        System.out.print(i + " * ");
    } else {
        System.out.print(i + " ");
    }
    }

        System.out.print("= "+ faktoriyel);


    }
}
