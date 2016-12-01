package Naloge1;
import java.util.Scanner;

public class Nal7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int x = scanner.nextInt();
		scanner.close();
		int s = 0;
		int i = (int)Math.pow(10, String.valueOf(x).length()-1);
		while(x > 0) {
			s = s+i*(x%10);
			x = (int)Math.floor(x/10);
			i = i/10;
		}
		System.out.println(s);
	}

}
