package Naloge1;
import java.util.Scanner;

public class Nal15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		String x = scanner.next();
		char y = scanner.next().charAt(0);
		scanner.close();
		int z = 0;
		for(int i = 0; i < x.length(); i++) {
			if(x.charAt(i) == y)
				z++;
		}
		System.out.println("Crka se je pojavila "+z+"-krat");
	}

}
