package ders25_Constructor;

public class C03 {
    /*
    Proje olustururken bazi Class'lar run etmek icin degil,
    Variable ve method olusturup, bunlari baska Classlardan
    kullanmak icin olusturulur.

    Default constructor, parametresizdir.
    Göremesek bile ihtiyac oldugunda calisir.

    Class icierisinde parametereli veya parameteresiz
    herhangi bir Consturctor olusturursak, java Default olani siler.
     */

    C03(){

    }

    /*
    Yukarida  olusturdugumuz parametresiz bu constructor
    default constructor ile birebir aynidir.
    Ama biz olusturdugumuz icin buna Default Cons. demeyiz.
    Parametresiz Constructor deriz.
     */

    String isim = "Etka";

    public void method01(){
        System.out.println("C03 Method Calisti");
    }

}
