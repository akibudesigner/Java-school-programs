package Naloge2;

import java.util.Scanner;

public class Nal5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		String tab[] = scanner.nextLine().split(" ");
		scanner.close();
		System.out.println("Liha velika, soda mihna: "+convertToUpperLower(tab));
	}
	
	public static StringBuffer convertToUpperLower(String[] tab) {
		StringBuffer ret = new StringBuffer("");
		for(int i=0;i < tab.length;i++) {
			if(i%2 == 0)
				ret.append(tab[i].toLowerCase()+" ");
			else
				ret.append(tab[i].toUpperCase()+" ");
		}
		return ret;
	}

}
