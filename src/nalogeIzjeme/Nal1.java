package Naloge4;

import java.util.Scanner;

public class Nal1 {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        if(x < 6) throw new Exception("Stevilo je manjse od 6!");
        // ALI
        try {
            if(x < 6) throw new Exception("Stevilo je manjse od 6!");
        } catch(Exception e) {
            System.out.println(e.toString());
            System.out.println(e.getMessage());
        }
    }
}
