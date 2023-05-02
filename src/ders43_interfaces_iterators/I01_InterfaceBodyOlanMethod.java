package ders43_interfaces_iterators;

public interface I01_InterfaceBodyOlanMethod {

    void motor();
    public void yakit();
    public abstract String aku();

    /*
    Normal bir class'da olsak,
    iki tane Access Modifier kullanma IHTIMALI OLMAZ.

    Asagidaki method'da gorulecegi gibi
    Interface'de istisnai olarak body'si olan methodlar olabilir.
    Bu ozellik Java8'den sonra kullanilmaya baslandi.
    Bu ozellikten once, bir interface'e yeni bir method eklemeniz gerektiginde
    eskiden beri bu interface'i implement edn tüm class'lara gidip
    yeni eklenen method'u override etmemiz gerekirdi.

    bu ozellik sayesinde, basina default veya static keyword ekleyerek
    interface'de yeni ve body'si olan bir method olusturursak,
    bu method'un child class'lar tarafindan override edilmesi MECBURIYETI OLMAZ.
    ve eskiden implement etmis class'lari degistirmemiz gerekmez.

    bu istisnai bir durumdur ve interface icin olusturulan
    genel kurallari bozmaz.

    Bu methodlarin bodysi olsa da bunlara concrete method denmez.
    ama override edilme mecburiyeti yoktur.

    buradaki default kelimesi access modifier degil,
    istisnai durumun belirtilmesi icindir.

    O zaman nicin 2 keyword (static ve default) tanimlanmistir?
    Bu iki farkli kelimenin amaci,
    Child class'lardan bu method'a nasil erisilebilecegini belirlemek icindir.
    InterfaceAdi.methodAdi yeterli olur.

    default keyword kullanilirsa, method'a ulasmak icin obje olusturulmalidir.
     */

    public default void teker(){
        System.out.println("default... Tüm araclarin tekerleri vardir");
    }

    public static void direksiyon(){
        System.out.println("static... Tüm arabalarin direksiyonu vardir");
    }
}
