package Naloge4;

import java.util.Scanner;

public class Nal2 {
    public static void main(String[] args) {
        read();
    }

    public static boolean isInteger(String x) {
        try {
            Integer.parseInt(x);
            return true;
        } catch(NumberFormatException e) {
            e.printStackTrace();
            return false;
        }
    }

    public static void read() {
        Scanner scanner = new Scanner(System.in);
        String x = "";
        do {
            x = scanner.nextLine();
        } while(isInteger(x));
    }
}
