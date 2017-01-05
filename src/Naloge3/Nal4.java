package Naloge3;

public class Nal4 {
    public static void main(String[] args) {
        for(int i=13;i<=21;i++)
            System.out.print(fib(i)+",");
    }

    public static int fib(int n) {
        if(n == 1 || n == 2)
            return 1;
        return fib(n-1)+fib(n-2);
    }
}
