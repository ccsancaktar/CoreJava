package ders12_SwitchStatements;

import java.util.Scanner;

public class C04_switchSoru3 {
    public static void main(String[] args) {
        // Kullanicidan ay numarasini alip Mevsimini yazdiralim.
        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen ay numarasi giriniz;");
        int ay = scan.nextInt();

        switch (ay){
            case 1:
            case 2:
                System.out.println("Kis");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("Ilkbahar");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("Yaz");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("Sonbahar");
            case 12:
                System.out.println("Kis");
            default:
                System.out.println("Gecersiz ay");
        }

    }
}
