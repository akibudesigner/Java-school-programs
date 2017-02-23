package Naloge2;

public class Nal2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "ABCDEFG";
		String s2 = prepisi(s, 2, 4);
		System.out.println("Prepisano "+s+" v "+s2);
	}
	
	public static String prepisi(String s, int from, int to) {
		return s.substring(from, to+1);
	}

}
