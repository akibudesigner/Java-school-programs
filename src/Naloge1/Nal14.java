package Naloge1;
import java.util.Scanner;

public class Nal14 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		String x = scanner.next();
		char y = scanner.next().charAt(0);
		scanner.close();
		int i = 0;
		int z = 0;
		while(i < x.length()) {
			if(x.charAt(i) == y)
				z++;
			i++;
		}
		System.out.println("Crka se je pojavila "+z+"-krat");
	}
	
}
