package Naloge2;

import java.util.Scanner;

public class Nal6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int x = scanner.nextInt();
		scanner.close();
		
		int sum = sumOf(x);
		int max = maxNum(x);
		int min = minNum(x);
		
		System.out.println("Vsota stevk: "+sum);
		System.out.println("Maksimalna stevka: "+max);
		System.out.println("Minimalna stevka: "+min);
	}

	public static int sumOf(int x) {
		return new String(Integer.toString(x)).length();
	}
	
	public static int maxNum(int x) {
		String strNum = new String(Integer.toString(x));
		int max = 0;
		for(int i = 0; i < strNum.length(); i++) {
			max = Math.max(max, Integer.valueOf(strNum.charAt(i))-48);
		}
		return max;
	}
	
	public static int minNum(int x) {
		String strNum = new String(Integer.toString(x));
		int min = 9;
		for(int i = 0; i < strNum.length(); i++) {
			min = Math.min(min, Integer.valueOf(strNum.charAt(i))-48);
		}
		return min;
	}
	
}
