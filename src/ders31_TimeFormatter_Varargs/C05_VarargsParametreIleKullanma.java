package ders31_TimeFormatter_Varargs;

public class C05_VarargsParametreIleKullanma {
    public static void main(String[] args) {

        enUzunKelimeyiYazdir(5,"Ali","Ayse","Ismail", "Babayigit","Cihan");
        /*
        Varargs teorik olarak sonsuz sayida elemnet alabilir
        Bir method'da parametre olarak varargs varsa
        Varargs'in sinirlarini bilebilmesi icin
        parametlerin sonuncusu olmalidir.
        Oncesinde farkli parametreler olabilir fakat
        Varargs'tan sonra parametre OLAMAZ.

        Bundan ötürü bir method'da sadece 1 tane Varargs olabilir.
         */

    }

    public static void enUzunKelimeyiYazdir(int kelimeSayisi, String... kelime){

        String enUzunKelime = kelime[0];

        for (String each: kelime
        ) {
            if (each.length()>enUzunKelime.length()){
                enUzunKelime = each;
            }
        }
        System.out.println("Girilen kelimelerden en uzunu: " + enUzunKelime);
    }
}
