package ders41_AbstractClass_Interfaces;

public class FMercedes extends DAraba {

    @Override
    protected void yakit() {
        /*
        Abstract bir parent, concrete child class inherit ederse
        parent, abstract class'daki, tüm abstract method'lari
        concrete etmek zorundadir.

        Abstract class, baska bir abstract class'i parent ednirise
        parent class'daki tüm abstract methodlari,
        override etmek ZORUNDA DEGILDIR.
         */
    }

    @Override
    protected void kaporta() {

    }

    @Override
    protected void motor() {

    }
}
