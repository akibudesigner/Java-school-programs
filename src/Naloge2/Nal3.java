package Naloge2;

import java.util.Scanner;

public class Nal3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int a = scanner.nextInt();
		int b = scanner.nextInt();
		scanner.close();
		if(a > b) {
			int temp = a;
			a = b;
			b = temp;
		}
		getAdd(a, b, n);
	}
	
	public static void getAdd(int a, int b, int n) {
		while(a <= b) {
			if(sumDigits(a) == n)
				System.out.println("Vsota števk števila "+a+" je enaka "+n);
			a++;
		}
	}
	
	public static int sumDigits(int a) {
		int sum = 0;
		while(a > 0) {
			sum += a%10;
			a /= 10;
		}
		return sum;
	}

}
