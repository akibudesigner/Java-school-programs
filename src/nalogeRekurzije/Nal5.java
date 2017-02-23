package Naloge3;

public class Nal5 {
    public static void main(String[] args) {
        System.out.println(product(5,4));
    }

    public static int product(int n1, int n2) {
        if(n2 > 1)
            n1 += product(n1,n2-1);
        return n1;
    }
}
