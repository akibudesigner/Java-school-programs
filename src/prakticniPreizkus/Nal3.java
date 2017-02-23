package PrakticniPreizkus;

import java.util.Scanner;

public class Nal3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String x = scanner.next();
        char y = scanner.next().charAt(0);
        StringBuffer sb = new StringBuffer(x);
        int p = 0;
        int p2 = 0;

        int k = 0;
        // (a) nism vedu kej tu???
        /*while(true) {
            int a = x.indexOf(x, k);
            if(a == -1)
                break;
            k = a+1;
            p++;
        }*/
        // (b)
        for (int i = 0; i < sb.length(); i++) {
            if(sb.charAt(i) == y)
                p2++;
        }

        System.out.println("a) "+p+" b) "+p2);
    }
}
