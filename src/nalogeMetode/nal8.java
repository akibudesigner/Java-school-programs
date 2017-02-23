package Naloge2;

import java.util.*;

public class nal8 {
	public static void main(String[] args) {

		//INPUT
		Scanner input = new Scanner(System.in);
		System.out.println("1. Inches to CM");
		System.out.println("2. CM to Inches");
		int x = input.nextInt();
		System.out.println("Vnesi stevilo");
		double stevilo = input.nextDouble();

		if (x==1){
			inchToCm(stevilo);
		}
		else if (x==2){
			cmToInch(stevilo);
		}
		else {
			System.out.println("NAPAKA!");
		}

	}

	public static void cmToInch(double st){
		System.out.println("cm to inch = "+st/2.54);
	}

	public static void inchToCm(double st){
		System.out.println("inch to cm = "+st*2.54);
	}

}