package Naloge1;
import java.util.Scanner;

public class Nal6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		String x = scanner.next();
		scanner.close();
		StringBuffer b = new StringBuffer(x);
		System.out.print(b.insert(b.length(), "a"));
	}

}
