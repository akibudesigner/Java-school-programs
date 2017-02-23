package Naloge3;

public class Nal7 {
    public static void main(String[] args) {
        System.out.println(power(11,2));
        System.out.println(power2(11,2));
    }

    public static int power(int n1, int n2) {
        if(n2 > 1)
            n1 *= power(n1,n2-1);
        return n1;
    }

    public static int power2(int n1, int n2) {
        if(n2 > 1)
            return Nal5.product(n1,power2(n1,n2-1));
        return n1;
    }
}
