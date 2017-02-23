package Naloge2;

import java.util.Scanner;

public class Nal11 {
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner scanner = new Scanner(System.in);
        String x = scanner.nextLine();
        scanner.close();

        System.out.println(isPalindrome(x));
    }

    public static boolean isPalindrome(String x) {
        return x.equals(new StringBuilder(x).reverse().toString());
    }

}
