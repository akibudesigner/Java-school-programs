package Naloge2;

import java.util.Scanner;

public class Nal9 {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner scanner = new Scanner(System.in);
        String x = scanner.nextLine();
        char y = scanner.next().charAt(0);
        scanner.close();

        System.out.println("Ali ima:");
        System.out.println(String.valueOf(doesContain(x, y)));
    }

    public static boolean doesContain(String a, char b) {
        return a.contains(String.valueOf(b));
    }

}
