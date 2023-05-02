package ders05_wrapperClass_MatematikselIslemler;

public class C01_WrapperClasses {

    public static void main(String[] args) {

        String str="Java";

        System.out.println(str.toUpperCase()); // Buyuk Harfe Cevirecek


        int sayiP= 20;
        //Primitive data turlerinin hazir methodlari yoktur. Sadece deger icerirler

        // Wrapper Classlar primitive data turleriyle ayni degerleri barindirirken
        // degerlerin yaninda hazir methodlar da kullanmamiza imkan veren Classlardir

        Integer sayiW=30;

        System.out.println(Integer.MAX_VALUE);
        System.out.println(Integer.MIN_VALUE);

        char karakP='a';
        Character karakW='b';

        System.out.println(Character.isDigit(karakP)); // false
        System.out.println(Character.isLowerCase(karakP)); // true

        String str2="1234";
        String str3="1000";

        System.out.println(str2+str3); // 12341000 yani toplamadi
        System.out.println(Integer.valueOf(str2) + Integer.valueOf(str3)); // 2234 toplar!

        

    }

}
