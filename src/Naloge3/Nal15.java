package Naloge3;

public class Nal15 {
    public static void main(String[] args) {
        nar(1);
    }

    public static int nar(int n) {
        System.out.print(n+", ");
        if(n == 44)
            return n;
        return nar(n+1);
    }
}
