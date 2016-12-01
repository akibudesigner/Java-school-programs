package Naloge1;
import java.util.Scanner;

public class Nal23 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		scanner.close();
		if(jePrafaktor(n))
			System.out.println("Stevilo je prafaktor");
		else
			System.out.println("Stevilo ni prafaktor");
	}
	
	public static boolean jePrafaktor(int n) {
		for(int i = 2; i < n; i++) {
			if(n%i == 0)
				return false;
		}
		return true;
	}

}
