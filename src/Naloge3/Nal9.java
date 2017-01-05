package Naloge3;

public class Nal9 {
    public static void main(String[] args) {
        System.out.println(sum(14,2));
    }

    public static int sum(int n1, int n2) {
        if(n2 == 0)
            return n1;
        return 1+sum(n1,n2-1);
    }
}
