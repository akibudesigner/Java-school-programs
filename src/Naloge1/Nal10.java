package Naloge1;
import java.util.Random;

public class Nal10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int max = 9;
		int min = 0;
		Random rand = new Random();
		while(true) {
			int n = rand.nextInt((max+1)-min)+min;
			int m = rand.nextInt((max+1)-min)+min;
			if(n == 5 || m == 5)
				break;
			System.out.print(n*m+" ");
			System.out.println();
		}
	}

}
