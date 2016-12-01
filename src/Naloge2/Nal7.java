package Naloge2;

public class Nal7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		izpis(1, 200, 6);
	}

	public static void izpis(int a, int b, int n) {
		for(int i = a; i <= b; i++) {
			if(Nal3.sumDigits(i) == n)
				System.out.println(i);
		}
	}

}
