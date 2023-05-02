package ders13_stringManipulation;

public class C05_charAt {
    public static void main(String[] args) {
        String str = "Java guzeldir"; // 13 karakter var (space dahil)

        // Javada index 0'dan baslar
        // J harfi 0'Ci indextir. r==12. index
        // charAt(index) ile istedigimiz indexteki char'a ulasabiliriz

        // ilk a'yi yaziralim
        System.out.println(str.charAt(1));

        // sondan 2. harfi yazdiralim
        System.out.println(str.charAt(13-2)); // karakter sayisi -2. indexteki eleman

        // sondan 4. karakteri BUYUK harf olarak versin
        System.out.println(str.toUpperCase().charAt(13-4)); // L (BUYUK)

        // charaT() methodu bize char dondurugu icin toUpperCase calismaz
        // String Merhodlarini chataT() ile kullanmak istersek
        // charAt() methodundan once kullanmaliyiz

        // eger index olarak karakter sayisi veya daha buyuk deger girersek
        // o indexi bulamayacagi icin hata verir.

    }
}
