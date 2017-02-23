package Naloge1;
import java.util.Scanner;

public class Nal22 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int x = scanner.nextInt();
		scanner.close();
		kvadrat(x);
	}
	
	public static void kvadrat(int n) {
		for(int i = 1; i <= n; i++) {
			if(i == 1)
				System.out.println(repeat("* ", n));
			else if(i == n)
				System.out.println(repeat("* ", n));
			else {
				System.out.print("* ");
				System.out.print(repeat(" ", 2*n-4));
				System.out.print("* ");
				System.out.println("");
			}
		}
	}
	
	public static String repeat(String s, int n) {
		return new String(new char[n]).replace("\0", s);
	}

}
