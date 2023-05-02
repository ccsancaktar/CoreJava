package ders33_Encapsulation;

public class OgretmenRunner {
    public static void main(String[] args) {

        Ogretmen ogr1 = new Ogretmen();
        ogr1.setIsim("Tülay");
        System.out.println(ogr1.getIsim());
        /*
        Buy yöntemle Data Hiding ile
        daha anlasilir bir kod amaclanmis olur.
         */
    }
}
