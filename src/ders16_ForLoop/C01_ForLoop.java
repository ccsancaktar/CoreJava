package ders16_ForLoop;

public class C01_ForLoop {
    public static void main(String[] args) {

        /*
        Forloop, belirli sayida calistirilmasi gereken bir döngüyü
        verimli bir sekilde yazmamiza olanak taniyan bir tekrar kontrol yapisidir.
         */


        // 10 kere "Hello World" yazdiralim.
        // ama her yazisinda 1'den 10'a kadar (10 dahil) yazdiralim.

        // For döngüsü bir gorevin kac kez tekrarlanacagini bildiginizde kullanislidir

        for (int i = 1; i <= 10; i++) {
            System.out.println(i + "- Hello World");
        }

    }
}
