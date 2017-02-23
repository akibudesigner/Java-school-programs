package PrakticniPreizkus;

import java.util.Scanner;

public class Nal4 {
    public static void main(String[] args) {
        // Tu je args[0] namesto tega
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        // ^^^^^^^
        // (a)
        int x1 = x;
        String y1 = "";
        while(x1 != 0) {
            y1 += Integer.toString(x1 % 10);
            x1 /= 10;
        }
        // (b)
        String x2 = Integer.toString(x);
        String y2 = "";
        for (int i = 0; i < x2.length(); i++) {
            y2 += x2.charAt(x2.length()-i-1);
        }

        System.out.println("a) "+y1+" b) "+y2);
    }
}
