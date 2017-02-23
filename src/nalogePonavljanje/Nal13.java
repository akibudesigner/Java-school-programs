package Naloge1;
import java.util.Scanner;

public class Nal13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		String x = scanner.next();
		String y = scanner.next();
		scanner.close();
		if(x.compareTo(y) > 0)
			System.out.println(y+" je pred "+x+" po abecedi.");
		else if(x.compareTo(y) < 0)
			System.out.println(x+" je pred "+y+" po abecedi.");
		else
			System.out.println("Imeni sta isti.");
	}

}
