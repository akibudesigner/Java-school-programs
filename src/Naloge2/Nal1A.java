package Naloge2;

import java.util.Scanner;

public class Nal1A {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int x = scanner.nextInt();
		scanner.close();
		//square(x);
		//long start = new Date().getTime();
		System.out.println(squareGlue(x, 1));
		//long end = new Date().getTime();
		//System.out.println(start-end);
	}
	
	public static void square(int n) {
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
	
	public static String squareGlue(int n, int c) {
		String x = "";
		for(int i = 1; i <= n*n; i++) {
			if(c == 0) {
				x += "* ";
				if(i % n == 0)
					x += "\n";
			} else if(c == 1) {
				if(((i >= 1 && i <= n) || (i >= n*n-n+1 && i <= n*n)) || (i % n == 0 || i % n == 1))
					x += "* ";
				else
					x += "  ";
				if(i % n == 0)
					x += "\n";
			}
		}
		return x;
	}
	
	public static String repeat(String s, int n) {
		return new String(new char[n]).replace("\0", s);
	}

}
