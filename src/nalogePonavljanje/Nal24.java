package Naloge1;
import java.util.Scanner;

public class Nal24 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		String n;
		int m10 = 0;
		int v10m100 = 0;
		int v100 = 0;
		while(true) {
			n = scanner.next();
			if(isNumeric(n)) {
				int c = Integer.parseInt(n);
				if(c < 10)
					m10++;
				if(c >= 10 && c <= 100)
					v10m100++;
				if(c > 100)
					v100++;
			} else
				break;
		}
		scanner.close();
		System.out.println("Manjse od 10: "+m10);
		System.out.println("Vecje od 10 (vkljucno) in manjse od 100 (vkljucno): "+v10m100);
		System.out.println("Vecje od 100: "+v100);
	}
	
	public static boolean isNumeric(String s) {
		try {
			@SuppressWarnings("unused")
			int n = Integer.parseInt(s);
		} catch(NumberFormatException e) {
			return false;
		}
		return true;
	}

}
