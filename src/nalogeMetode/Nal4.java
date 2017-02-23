package Naloge2;

import java.util.Scanner;

public class Nal4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		String tab[] = scanner.nextLine().split(" ");
		scanner.close();
		System.out.println("Indeks najdaljše besede: "+indexOfHuge(tab));
	}
	
	public static int indexOfHuge(String[] tab) {
		int max = 0;
		int indexMax = 0;
		for(int i=0;i < tab.length;i++) {
			if(tab[i].length() > max) {
				indexMax = i;
				max = tab[i].length();
			}
		}
		return indexMax;
	}

}
