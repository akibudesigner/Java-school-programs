package Naloge2;

import java.util.Scanner;

public class Nal10 {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner scanner = new Scanner(System.in);
        String x = scanner.nextLine();
        scanner.close();

        System.out.println(countUpperCharacters(x));
    }

    public static int countUpperCharacters(String x) {
        int c = 0;
        for(int i = 0; i < x.length(); i++) {
            if(Character.isUpperCase(x.charAt(i)))
                c++;
        }
        return c;
    }

}
