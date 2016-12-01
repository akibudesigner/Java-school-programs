package Naloge1;
import java.util.Scanner;

public class Nal16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int x;
		int max = 0;
		int s = 0;
		int t[] = new int[10];
		for(int i = 0; i < 10; i++) {
			x = scanner.nextInt();
			t[i] = x;
		}
		scanner.close();
		for(int i = 0; i < 10; i++) {
			max = Math.max(t[i], max);
			s += t[i];
		}
		System.out.println("Vsota stevil je: "+s);
		System.out.println("Povprecna vrednost je: "+s/10);
		System.out.println("Najvecja vrednost je: "+max);
	}

}
