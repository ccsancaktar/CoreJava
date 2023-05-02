package ders04_dataCasting;

public class C01_DataCasting {
    public static void main (String[] args) {

        int a= 134;
        double b= 23.4;
        short c= 34;
        byte d= 14;

        double e = a;

        int f= c; // Variable'in data turu > Degerin Data Turu

        short g=d; // short > byte - Otomatik cevirir. Auto Widening

        short h= (short) b; // Variable Data < B'nin data turu Double - CEVIRMEZ
        System.out.println("double 23,4'un short karsiligi: " + h); // 23

        byte l= (byte) a; // Variable Data Byte < A Data turu int - CEVIRMEZ
        System.out.println("int 134'ün byte karsiligi: " + l); // -122

    /* Biz daha kapsamli data turundeki bir degeri, daha dar kapsamli bir variable'a atamak istersek
    Java bunu otomatik yapmayacak.
    Cunku daha kapsamliyi daha dar kapsamli bir ture cevirmek istiyorsunuz.
    Data kayiplari olabilir. veya Java datayi yeni data turune cevirmek icin degistirebilir.
     */


    }

}
