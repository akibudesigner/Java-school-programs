package PrakticniPreizkus;

import java.util.Scanner;

public class Nal1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String x = scanner.next();
        StringBuffer sb = new StringBuffer(x);
        sb.append('a');
        sb.insert(0, 'X');
        sb.insert(2, 'X');
        sb.reverse();
        System.out.println(sb);
    }
}
