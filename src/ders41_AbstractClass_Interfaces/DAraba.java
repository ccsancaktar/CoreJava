package ders41_AbstractClass_Interfaces;

public abstract class DAraba {
    public static void main(String[] args) {
    /*
     Abstract class'da main method opsiyoneldir.
     Eger abstract class sadece child class'larin
     tasimak zorunda oldugu ozellikleri belirlemek ici olusturuluyorsa
     main method'a gerek duyulmaz
     sadece abstract method'lar bulunur.

     ama bir abstract method'da
     standart belirlemek disinda da methodlar calisabilir
     bu durumda ihtiyac olursa main method olusturulabilir.
     */

    }

    protected abstract void yakit();
    protected abstract void kaporta();
    protected abstract void motor();
    /*
    Sadece child class'larin mecburi tasiyacaklari
    ozellikleri belirleyen methodlar abstract method olur
    ve bu methodlarin body'si ({}) olmaz.
     */

    public void klima(){
        System.out.println("Bazi arabalarda klima olabilir");
    /*
    Abstract olmayan methodlara concrete method denir.
    Abstract bir methodu abstract keyword ile belirtmek zorunludur.
    Ancak abstract olmayan methodlara concrete yazmamiza gerek yoktur.
    Biz sadece abstraction ile ilgili konustugumuzda abstract olmayanlardan
    bahsetmek icin concrete kullaniriz.
     */
    }

}
