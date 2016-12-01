package Naloge2;

import java.util.Scanner;

public class Nal1B {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int tab[] = new int[10];
		for(int i=0;i < 10;i++) {
			tab[i] = scanner.nextInt();
		}
		scanner.close();
		System.out.println("Indeks najveèje številke: "+indexOfHuge(tab));
	}
	
	public static int indexOfHuge(int[] tab) {
		int max = 0;
		int indexMax = 0;
		for(int i=0;i < 10;i++) {
			if(tab[i] > max) {
				indexMax = i;
				max = tab[i];
			}
		}
		return indexMax;
	}

}
