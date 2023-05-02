package ders41_AbstractClass_Interfaces;

public abstract class EToyota extends DAraba{


    @Override
    protected void motor() {
        System.out.println("Toyota arabalar cevreci motor kullanir");
    }
    /*
    Parent classdaki standart belirleyici methodlar
    (abstract methodlar)'in tamami child class tarafindan override edilmelidir.

    concrete methodlarin override edilme mecburiyeti yoktur
    istersek override edebiliriz istemezsek etmeyiz.

    Aslinda toyota classi'da obje uretecegimiz bir class degil.
    bu durumda eger proje tasarimi yapiyorsaniz,
    Toyota class'ini da abstract yapmaniz onerilir.
    */
}
