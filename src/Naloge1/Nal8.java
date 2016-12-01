package Naloge1;
import java.util.Scanner;

public class Nal8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int x = scanner.nextInt();
		scanner.close();
		if(String.valueOf(x).length() != 3 || x <= 0) {
			System.out.println("Stevilo ne zadosca pogojem!");
			return;
		}
		StringBuffer rev = new StringBuffer(String.valueOf(x));
		rev.reverse();
		int revInt = Integer.parseInt(new String(rev));
		int i = 0;
		while(revInt > 0) {
			String t = "";
			if(i != 0)
				t = new String(new char[i]).replace("\0", " ");
			System.out.println(t+revInt%10);
			revInt = (int)Math.floor(revInt/10);
			i++;
		}
	}

}
