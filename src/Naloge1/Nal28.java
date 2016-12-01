package Naloge1;
import java.util.Random;

public class Nal28 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int max = 1000;
		int min = -1000;
		int[] array = new int[1000];
		Random rand = new Random();
		
		int povprecjeNeg;
		int povprecjeNegI = 0;
		int povprecjeNegR = 0;
		int povprecjePoz;
		int povprecjePozI = 0;
		int povprecjePozR = 0;
		int povprecjeVseh = 0;
		int povprecjeVsehI = 0;
		int povprecjeVsehR = 0;
		int mestoMax = 0;
		
		for(int i = 0; i < array.length; i++) {
			array[i] = rand.nextInt((max+1)-min)+min;
		}
		for(int i = 0; i < array.length; i++) {
			if(array[i] < 0) {
				povprecjeNegI++;
				povprecjeNegR += array[i];
			}
			if(array[i] > 0) {
				povprecjePozI++;
				povprecjePozR += array[i];
			}
			povprecjeVsehI++;
			povprecjeVsehR += array[i];
		}
		povprecjeNeg = povprecjeNegR/povprecjeNegI;
		povprecjePoz = povprecjePozR/povprecjePozI;
		povprecjeVseh = povprecjeVsehR/povprecjeVsehI;
		System.out.println("Povprecje negativnih stevil je: "+povprecjeNeg);
		System.out.println("Povprecje pozitivnih stevil je: "+povprecjePoz);
		System.out.println("Stevila, ki so vecja od povprecja: ");
		for(int i = 0; i < array.length; i++) {
			if(array[i] > povprecjeVseh)
				System.out.print(array[i]+", ");
			if(i == array.length-1)
				System.out.println("");
			if(array[i] > max)
				max = array[i];
				mestoMax = i;
		}
		System.out.println("Max mesto: "+mestoMax);
	}

}
