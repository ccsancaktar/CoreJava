package ders08_basitIfCumleleri;
import java.util.Scanner;
public class C01_IfStatements {
    public static void main(String[] args) {

        // Soru 1 - Kullanicidan bir sayi isteyin,
        // Sayiyi kontrol edip 5 ile bölünebiliyorsa 'Sayi 5'in tam kati' yazdirin.

        Scanner scan = new Scanner(System.in);
        System.out.println("lUTFEN POZITIF BIR TAM SAYI GIRIN");
        int girilenSayi= scan.nextInt();

        if (girilenSayi % 5 == 0) {
            System.out.println("Sayi 5in Tam Kati");
        }
    }
}
