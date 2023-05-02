package ders15_stringManipulation;

public class C03_replaceAll {
    public static void main(String[] args) {

        // Bu metindeki sayilardan kurtulun
        String str = "Ja1va 56Guz,el-dir";

        System.out.println(str.replace("1","")
                                .replace("5","")
                                .replace("6",""));

        str = "Ja1va4 56G7uz,9el-dir8";

        /*
            replace() zaten istenilen deisikligi verilen ozellige uyan tüm degerler icin yapar

            eger genellemeyi bütün sayilari, bütün spaceleri, bütün özel karakterleri
            gibi genisletmek istersek replace() methodu yerine replaceAll() kullaniriz.

            Java bu genellemeleri yazabilmemiz icin regex (regular expressions) tanimlamistir.

            \\d  : Bütün digitler
            \\s  : Spaceler
            \\s+ : Yanyana birden fazla space
            \\w  : Harf veya rakam

            \\S  : Space olmayan hersey
            \\D  : Digit olmayan hersey
            \\W  : Harf veya rakam olmayan hersey

            */

        str = str.replaceAll("\\d","");
        System.out.println(str);

        // Özel karakterlerden de kurlutun
        // Space de ozel karakter oldugundan, bu durumda Space"in yok olmamasi icin
        // once space yerine metinde olmayan bir deger atayalim.

        str = str.replace(" ","5");

        str = str.replaceAll("\\W",""); // JavaGuzzeldir

        str = str.replace("5"," ");

        System.out.println(str);

        // buradaki harf sayisini bulun
        String input3 = "Ali Can, Merve Star, Mark Ton";

        input3 = input3.replaceAll("\\W","");
        System.out.println(input3.length()); // 22

    }
}
