package ders16_ForLoop;

public class C05_Faktoriyel {
    public static void main(String[] args) {
        // Verilen sayinin faktoriyelini hesaplayiniz
        // 5! = 5+4+3+2+1

        int input = 5;
        int carpim=1;

        for (int i = input; i >=1 ; i--) {
            carpim*=i;
        }

        System.out.println("Verilen " + input + " sayisinin faktoriyeli: " + carpim);

    }
}
