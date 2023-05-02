package ders42_AbstractClass_Interfaces;

public class C01_AbstractClassOzet {
    /*
    1- Bir class'i abstract yapip yapmamaya karar bastan veririz.
    Eger bir class'dan obje olusturmayacaksak, o class'i child classlarinin
    uymasi gereken kurallari belirleyecek sekilde dizayn etmek istiyorsak, abstract class yapariz.

    2- Abstract bir class'da child class'larin mutlaka uymasi gereken kurallari
    abstract method'lar ile belirleriz.
    Abstract method'lar mutlaka child class'da override edilecegi icin
    body'e ihtiyac duymaz.

    3- Abstract olarak tanimlanan methodlarin body'si olmaz.

    4- Abstract class zincirinden sonra gelen ilk concrete class
    Parent'larinda bulunan ve concrete olmayan tüm method'lari override
    etmek ZORUNDADIR. Ancak parent abstract class'larda bulunan
    concrete methodlari override etmek ZORUNDA DEGILDIR

    5- Abstact class'in abstract child'i, parent'teki abstract methodlari
    override etmek zorunda degildir.

    6- Abstract class'lar constructor'a sahiptir fakat
    abstract class'lardan OBJE OLUSTURULAMAZ.
     */
}
