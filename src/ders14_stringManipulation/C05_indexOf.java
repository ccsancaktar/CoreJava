package ders14_stringManipulation;

public class C05_indexOf {
    public static void main(String[] args) {

        String str = "Java ile kodlama cok kolay";

        // Str "cok" iceriyor mu?
        System.out.println(str.contains("cok")); // true

        // Kullanicidan aldigimiz cumlede "cok" ile baslayan ilk kelimeyi yazdirin

        System.out.println(str.indexOf('a')); // a'nin index'i = 1 (Char)
        System.out.println(str.indexOf("v")); // v'nin indexi = 2 (String)
        System.out.println(str.indexOf("cok")); // 17. index'te basliyor (String)

        System.out.println(str.indexOf("a",5)); // 13 - 5. indexten sonraki "a"

        // 2. "o"nun indexini yazdirin
        // once ilk "o"nun indexini buluruz,
        // sonra o indexten sonraki 2. o harfini aratiriz

        int ilkindex = str.indexOf("o"); // 11 ilk "o"
        int ikiniindex = str.indexOf("o",ilkindex+1);

        System.out.println(ilkindex + " " + ikiniindex); // 10 ve 18

    }
}
