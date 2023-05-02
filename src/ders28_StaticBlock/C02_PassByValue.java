package ders28_StaticBlock;

public class C02_PassByValue {

    public static void main(String[] args) {

        double satisFiyati = 100;

        System.out.println(indirimliFiyat(satisFiyati)); // 90

        System.out.println(satisFiyati); // 100

        System.out.println(indirimliFiyat(satisFiyati)); // 90
        // 2 farkli methodda satisFiyati isminde variable olabilir
        // java buna itiraz etmez, cünkü Scope'lari farklidir.
    }

    public static double indirimliFiyat(double orjinalFiyat){
        // methodumuz %10 indirim yapip,
        //yeni fiyati main methoda dondursun.

        double satisFiyati = orjinalFiyat*0.9;;

        return satisFiyati*0.9;
    }
}
