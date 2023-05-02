package ders26_Constructor;

public class OgretmenRunner {
    public static void main(String[] args) {

        Ogretmen ogretmen1 = new Ogretmen();
        System.out.println("Ogretmen1: " + ogretmen1);

        Ogretmen ogretmen2 = new Ogretmen("Cagatay","Sancak", "1993", "Matematik", "Fizik");
        System.out.println("Ogretmen2: " + ogretmen2);

        Ogretmen ogretmen3 = new Ogretmen("Murat","Kara", "1980");
        System.out.println("Ogretmen3: " + ogretmen3);
    }
}
