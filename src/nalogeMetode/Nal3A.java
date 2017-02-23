package Naloge2;

import java.util.Scanner;

public class Nal3A {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int a = scanner.nextInt();
		int b = scanner.nextInt();
		scanner.close();
		rectangle(a, b);
	}
	
	public static void rectangle(int a, int b) {
		for(int i = 1; i <= b; i++) {
			if(i == 1)
				System.out.println(repeat("* ", a));
			else if(i == b)
				System.out.println(repeat("* ", a));
			else {
				System.out.print("* ");
				System.out.print(repeat(" ", 2*a-4));
				System.out.print("* ");
				System.out.println("");
			}
		}
	}
	
	public static String repeat(String s, int n) {
		return new String(new char[n]).replace("\0", s);
	}

}
