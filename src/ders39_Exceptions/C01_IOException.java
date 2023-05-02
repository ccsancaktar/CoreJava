package ders39_Exceptions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class C01_IOException {
    public static void main(String[] args) throws FileNotFoundException {

        /*
        Java'dan bilgisayarimizdaki bir dosyaya erismek istersek
        FileInputStream class'indan yardim aliriz.
        Ayni sekilde, Java'dan PC'ye doya ekleme veya update yapmak istesek
        FileOutputStream class'indan yardim aliriz.
         */

        FileInputStream fis = new FileInputStream("src/ders39_Exceptions/tester.txt");

        /*
        Görüldügü gibi Compile Time'da altini kirmizi cizen her durum,
        Compile Time Error degildir.
        Javada bazi exceptionlarda Compile Time Exception'dir.
        Ozellikle dosya okuma ve yazma ile ilgili exceptionlar
        Compile Time Exception'dir.

        Compile Time Exception olustugunda Java cozum icin 2 ihtimal onerir.
        1- Try / Cath ile cevrelemek
        2- Method signature'ina Throws keyword ile beklenen Exception türünü yazmak.

         Throws Exceptions, sadece olayin farkinda oldugumuzun deklerasyonudur.
         Exception'in Handle edilmesinde hicbir rolü yoktur.
         Yani, Try / Catch ile handle ettigimiz exceptionlarda kod calismaya devam ediyordu.
         Ancak, throws Exception yazdigimizda bir exception ile karsilasirsa,
         hicbir sey yapmamisiz gibi hata mesaji yayinlayip, calismayi durdurur.
         */
    }
}
