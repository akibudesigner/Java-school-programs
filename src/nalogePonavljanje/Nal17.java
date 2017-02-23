package Naloge1;
import java.util.Scanner;

public class Nal17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		String x = scanner.nextLine();
		scanner.close();
		StringBuilder y = new StringBuilder(x);
		StringBuilder z = new StringBuilder(x);
		// Zadnja crka v besedah
		for(int i = 0; i < x.length(); i++) {
			if((int)x.charAt(i) == 32)
				y.setCharAt(i-1, 'x');
			else if(i == x.length()-1)
				y.setCharAt(i, 'x');
		}
		// Prva crka v besedah
		for(int i = 0; i < x.length(); i++) {
			if((int)x.charAt(i) == 32)
				z.setCharAt(i+1, 'x');
			else if(i == 0)
				z.setCharAt(i, 'x');
		}
		System.out.println(y);
		System.out.println(z);
	}

}
