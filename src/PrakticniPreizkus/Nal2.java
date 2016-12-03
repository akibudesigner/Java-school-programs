package PrakticniPreizkus;

import java.util.Scanner;

public class Nal2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String x = scanner.next();
        StringBuffer sb = new StringBuffer(x);
        sb.insert(sb.length(), 'a');
        for(int i = 0; i < sb.length(); i++) {
            try {
                sb.deleteCharAt(i + 1);
            } catch(StringIndexOutOfBoundsException e) {
                //e.printStackTrace();
            }
        }
        System.out.println(sb);
    }
}
