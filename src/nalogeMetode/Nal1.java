package Naloge2;

import java.util.Scanner;

public class Nal1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		String s = scanner.nextLine();
		scanner.close();
		System.out.println("Samoglasniki: "+numberVowel(s));
		System.out.println("Soglasniki: "+numberConsonant(s));
		System.out.println("Loèila: "+numberPunctuationMark(s));
		System.out.println("Presledki: "+numberSpace(s));
		System.out.println("Majhne èrke: "+numberLowerCase(s));
		System.out.println("Velike èrke: "+numberUpperCase(s));
		System.out.println("Dolžina besedila: "+numberLength(s));
		System.out.println("Število besed: "+numberWord(s));
	}
	
	public static int numberVowel(String s) {
		int vowels = 0;
		for(int i=0;i < s.length();i++) {
			if(isVowel(String.valueOf(s.charAt(i))))
				vowels++;
		}
		return vowels;
	}
	
	public static int numberConsonant(String s) {
		int consonants = 0;
		for(int i=0;i < s.length();i++) {
			if(isConsonant(String.valueOf(s.charAt(i))))
				consonants++;
		}
		return consonants;
	}
	
	public static int numberPunctuationMark(String s) {
		int punctuationMarks = 0;
		for(int i=0;i < s.length();i++) {
			if(isPunctuationMark(String.valueOf(s.charAt(i))))
				punctuationMarks++;
		}
		return punctuationMarks;
	}
	
	public static int numberSpace(String s) {
		int spaces = 0;
		for(int i=0;i < s.length();i++) {
			if(Character.isWhitespace(s.charAt(i)))
				spaces++;
		}
		return spaces;
	}
	
	public static int numberLowerCase(String s) {
		int lowerCases = 0;
		for(int i=0;i < s.length();i++) {
			if(Character.isLowerCase(s.charAt(i)))
				lowerCases++;
		}
		return lowerCases;
	}
	
	public static int numberUpperCase(String s) {
		int upperCases = 0;
		for(int i=0;i < s.length();i++) {
			if(Character.isUpperCase(s.charAt(i)))
				upperCases++;
		}
		return upperCases;
	}
	
	public static int numberLength(String s) {
		return s.length();
	}
	
	public static int numberWord(String s) {
		return s.split(" ").length;
	}
	
	public static boolean isVowel(String c) {
		String vowels = "aeiouAEIOU";
		return vowels.contains(c);
	}
	
	public static boolean isConsonant(String c) {
		String consonant = "bcèdfghjklmnpqrsštvwxyzžBCDFGHJKLMNPQRSTVWXYZ";
		return consonant.contains(c);
	}
	
	public static boolean isPunctuationMark(String c) {
		String consonant = ".?!:;-—,";
		return consonant.contains(c);
	}
	
}
