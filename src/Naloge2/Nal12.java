package Naloge2;

import java.util.Scanner;

public class Nal12 {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        scanner.close();

        System.out.println(MMtoM(x));
        System.out.println(MMtoDM(x));
        System.out.println(MMtoCM(x));
    }

    public static int MMtoM(int x) {
        return x/1000;
    }

    public static int MMtoDM(int x) {
        return x/100;
    }

    public static int MMtoCM(int x) {
        return x/10;
    }

}
