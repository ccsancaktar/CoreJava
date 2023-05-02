package ders32_StringBuilder;

public class C04_SubSequance {
    public static void main(String[] args) {

        StringBuilder sb = new StringBuilder("Kayra");

        sb.substring(0,3);
        // bu method String dondurdugu icin StringBuilder'in eski halini degistiremez
        System.out.println(sb); // Kayra

        sb.subSequence(0,3);
        System.out.println(sb); // Kayra
    }
}
