package Naloge1;
import java.util.Random;

public class Nal27 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] t = new int[10][10];
		int max = 110;
		int min = 90;
		Random rand = new Random();
		for(int i = 0;i < t.length-1;i++) {
			for(int j = 0;j < t.length-1;j++) {
				t[i][j] = rand.nextInt((max+1)-min)+min;
			}
		}
		System.out.println("Pojavi se na indeksih:");
		for(int i = 0;i < t.length;i++) {
			for(int j = 0;j < t.length;j++) {
				if(t[i][j] == 100) {
					System.out.println(i+" in "+j);
				}
			}
		}
	}

}
