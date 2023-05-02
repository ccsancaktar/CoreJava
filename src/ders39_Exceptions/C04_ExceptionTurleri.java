package ders39_Exceptions;

public class C04_ExceptionTurleri {
    public static void main(String[] args) {

        String str;
        /*
        System.out.println(str);
        Deger atamasi yapmadan bir variable'i kullanmaya calisirsaniz
        Java bunu Compile Time'da fark eder ve size izin vermez.
         */

        str = null;

        // System.out.println(str.length());
        // NullPointerException => Run Time Exception

        Object obj = "Java, Java, Java";
        int sayi = (Integer)obj; // ClassCastException

        /*
        String str2 = "Hava civa";
        Integer sayi2 = str2;
        Java bazi casting islemlerini Compile Time'da izin vermez.
        Ancak bazen syntax uygun olabilir ve bu durumda
        Java kodun calismasina itiraz etmez.
         */
    }
}
