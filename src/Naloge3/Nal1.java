package Naloge3;

import java.util.Scanner;

public class Nal1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();

        int e = fakultetaRekurzija(x);
        System.out.println("Rekurzija: "+e);
        int d = fakultetaIterativna(x);
        System.out.println("Iterativna: "+d);
    }

    public static int fakultetaRekurzija(int n) {
        if(n == 0) {
            return 1;
        }
        return n*fakultetaRekurzija(n-1);
    }

    public static int fakultetaIterativna(int n) {
        int x = 1;
        for(int i = 1;i <= n;i++) {
            x *= i;
        }

        return x;
    }
}
