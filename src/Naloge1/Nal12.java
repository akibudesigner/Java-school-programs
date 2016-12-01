package Naloge1;
import java.util.Scanner;

public class Nal12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		while(true) {
			char x = scanner.next().charAt(0);
			
			if(x == 'x') {
				scanner.close();
				break;
			} else if(x == 'v') {
				System.out.println("Pozdravljeni!");
			} else if(x == 'p') {
				System.out.println("Vizitka:");
				System.out.println("Ime: Timotej");
				System.out.println("Priimek: Manfreda");
				System.out.println("Email: timotej.manfreda@gmail.com");
			} else {
				System.out.println("Komanda neveljavna!");
			}
		}
	}

}
