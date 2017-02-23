package Naloge3;

public class Nal6 {
    public static void main(String[] args) {
        System.out.println(quotient(16,2));
    }

    public static int quotient(int n1, int n2) {
        if(n2 == 0)
            return 0;
        else if(n1 < n2)
            return 0;
        return ((n1-n2)-quotient(n1-n2,n2));
    }
}
