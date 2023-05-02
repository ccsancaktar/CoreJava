package ders39_Exceptions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class C02_IcIceTryCatch {
    public static void main(String[] args) {

        int k;

        try {
            FileInputStream fis = new FileInputStream("src/ders39_Exceptions/tester.txt");

            while ((k=fis.read()) != -1){
                System.out.print((char) k);
            }

        } catch (FileNotFoundException e) {
            System.out.print("Doya bulunamadi veya dosya bozuk");
        } catch (IOException e) {
            System.out.print("Dosyadan bilgiler okunamadi");
        }

    }
}
