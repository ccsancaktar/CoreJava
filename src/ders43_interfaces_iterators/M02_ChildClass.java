package ders43_interfaces_iterators;

public class M02_ChildClass implements I01_InterfaceBodyOlanMethod {

    @Override
    public void motor() {

    }

    @Override
    public void yakit() {

    }

    @Override
    public String aku() {
        return null;
    }

    /*
    Parent interface'de abstract olan 3 method'u implement ettigimizde
    Java, itirazini durdurur.
    Sonradan ekledigimiz, default ve static keyword ile tanimladigimiz
    methodlari, implement etmememiz sorun olusturmadi.

    O zaman nicin 2 keyword (static ve default) tanimlanmistir?
    Bu iki farkli kelimenin amaci,
    Child class'lardan bu method'a nasil erisilebilecegini belirlemek icindir.
    InterfaceAdi.methodAdi yeterli olur.

    default keyword kullanilirsa, method'a ulasmak icin obje olusturulmalidir.

     */

    public static void main(String[] args) {

        I01_InterfaceBodyOlanMethod.direksiyon();

        M02_ChildClass obj = new M02_ChildClass();
        obj.teker();
    }


}
