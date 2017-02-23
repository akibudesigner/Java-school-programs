package Naloge1;
import java.util.Random;

public class Nal19 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int max = 69;
		int min = 0;
		int iMin = 0;
		int cMin = 0;
		int[] array = new int[10];
		Random rand = new Random();
		for(int i = 0; i < 10; i++) {
			array[i] = rand.nextInt((max+1)-min)+min;
			System.out.println("INSERT: "+array[i]);
		}
		for(int i = 0; i < array.length; i++) {
			if(array[i] > cMin) {
				iMin = i;
				cMin = array[i];
			}
		}
		System.out.print("Najvecje stevilo je na indeksu: "+iMin);
	}

}
