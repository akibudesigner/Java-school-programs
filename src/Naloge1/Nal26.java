package Naloge1;
import java.util.Scanner;

public class Nal26 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		char x = scanner.next().charAt(0);
		int y = scanner.nextInt();
		scanner.close();
		if(x == 'a') {
			int l = 1;
			int t = 0;
			for(int i = 0;i <= y;i++) {
				while(t < i) {
					System.out.print(l);
					l++;
					if(l > 9)
						l = 0;
					t++;
				}
				t = 0;
				System.out.println();
			}
		} else if(x == 'b') {
			int l = 1;
			int t = 0;
			for(int i = 0;i <= y;i++) {
				System.out.print(repeat(" ", y-i));
				while(t < i) {
					System.out.print(l);
					l++;
					if(l > 9)
						l = 0;
					t++;
				}
				t = 0;
				System.out.println();
			}
		}
	}
	
	public static String repeat(String s, int n) {
		return new String(new char[n]).replace("\0", s);
	}

}
