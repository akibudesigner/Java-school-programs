package Naloge3;

import java.util.Scanner;

public class Nal12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int n = scanner.nextInt();
        scanner.close();
        double p = sierpinski(a,n);
        System.out.println(p);
    }

    public static double sierpinski(double a, int n) {
        if(n == 0)
            return ((a*a)*Math.sqrt(3))/4;
        return sierpinski(a/2,n-1);
    }
}
