package ders35_InheritancedaConstructorKullanimi;

public class KDizelCorolla extends HCorolla {
    KDizelCorolla(){
        System.out.println("DizelCorolla parametresiz Cons");
    }

    KDizelCorolla(String isim){
        super(isim);
        System.out.println("DizelCorolla parametreli Cons");
    }

    public static void main(String[] args) {

        KDizelCorolla obj1 = new KDizelCorolla("Sancak");
    }
}
