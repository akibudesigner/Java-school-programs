package Naloge3;

public class Nal9 {
    public static void main(String[] args) {
        System.out.println(sum(14,2));
        System.out.println(sum(-14,2));
        System.out.println(sum(14,-2));
        System.out.println(sum(-14,-2));
        /*
            16
            -12
            12
            -16
         */
    }

    public static int sum(int x, int y) {
        if(x == 0)
            return y;
        if(x < 0)
            return -sum(-x-1, -y)-1;
        return sum(x-1, y+1);
    }

    /*public static int sum(int n1, int n2) {
        if(n2 == 0)
            return n1;
        return 1+sum(n1,n2-1);
    }*/
}
