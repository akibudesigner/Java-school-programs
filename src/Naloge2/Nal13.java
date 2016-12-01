package Naloge2;

import java.util.Scanner;

public class Nal13 {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        scanner.close();

        System.out.println(jePrafaktor(x));
    }

    public static boolean jePrafaktor(int n) {
        for(int i = 2; i < n; i++) {
            if(n%i == 0)
                return false;
        }
        return true;
    }

}
