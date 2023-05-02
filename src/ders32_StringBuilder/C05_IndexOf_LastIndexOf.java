package ders32_StringBuilder;

public class C05_IndexOf_LastIndexOf {
    public static void main(String[] args) {

        StringBuilder sb = new StringBuilder("Pay attention please");

        System.out.println(sb.indexOf("Pay")); // 0
        System.out.println(sb); // Pay attention please

        // ilk indexten sona dogru
        System.out.println(sb.indexOf("e")); // 7
        System.out.println(sb.indexOf("e", 10)); // 16

        // Son indexten basa dogru
        System.out.println(sb.lastIndexOf("e")); // 19
        System.out.println(sb.lastIndexOf("e", 10)); // 7
    }
}
