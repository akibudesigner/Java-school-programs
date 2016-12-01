package Naloge2;

import java.util.Scanner;

public class Nal1C {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		String s1 = scanner.nextLine();
		String s2 = scanner.nextLine();
		scanner.close();
		System.out.println("Najvec samostalnikov ima: "+stavekKiImaVecSam(s1, s2));
	}
	
	public static String stavekKiImaVecSam(String s1, String s2) {
		int c1 = Nal1.numberVowel(s1);
		int c2 = Nal1.numberVowel(s2);
		if(c1 > c2)
			return s1;
		return s2;
	}
	
	/* Od 1. naloge

	public static int numberVowel(String s) {
		int vowels = 0;
		for(int i=0;i < s.length();i++) {
			if(isVowel(String.valueOf(s.charAt(i))))
				vowels++;
		}
		return vowels;
	}
	
	public static boolean isVowel(String c) {
		String vowels = "aeiouAEIOU";
		return vowels.contains(c);
	}
	
	 */

}
