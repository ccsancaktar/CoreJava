package ders41_AbstractClass_Interfaces;

public class GCorolla extends EToyota{
    @Override
    protected void yakit() {

    }

    @Override
    protected void kaporta() {

    }
    /*
    Corolla class'ini iki tane parent'i var.
    Corolla, parentlarinin ikisinin de standartlarina (abstract method)
    uymak zorundadir.

    Concrete class, parent'i olan tüm abstract classlarda
    abstract olan methodlari, implement etmek zorundadir.
    Ancak Parent silsilesinde, override edilerek concrete yapilan
    methodlari override etmek zorunda DEGILDIR.
    */
}
