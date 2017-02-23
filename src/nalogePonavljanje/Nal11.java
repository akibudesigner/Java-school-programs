package Naloge1;
import java.util.Random;

public class Nal11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int max = 5;
		int min = -5;
		int s = 0;
		Random rand = new Random();
		while(true) {
			int n = rand.nextInt((max+1)-min)+min;
			s += n;
			if(s == 0)
				break;
			System.out.print(s+" ");
		}
	}

}
