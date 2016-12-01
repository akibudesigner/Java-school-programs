package Naloge1;
import java.util.Scanner;

public class Nal21 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int x = scanner.nextInt();
		scanner.close();
		for(int i = x; i >= 1; i--) {
			System.out.print(repeat(" ", i-1));
			System.out.println(repeat("*", x*2-1-(i-1)*2));
		}
	}
	
	public static String repeat(String s, int n) {
		return new String(new char[n]).replace("\0", s);
	}

}
