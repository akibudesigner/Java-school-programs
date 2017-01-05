package Naloge3;

public class Nal8 {
    public static void main(String[] args) {
        System.out.println(difference(14,2));
    }

    public static int difference(int n1, int n2) {
        if(n2 == 0)
            return n1;
        return 1-difference(n1-1,n2-1);
    }
}
