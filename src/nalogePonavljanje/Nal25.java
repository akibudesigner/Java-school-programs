package Naloge1;
import java.util.Scanner;

public class Nal25 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		String s = scanner.nextLine();
		scanner.close();
		StringBuffer sb = new StringBuffer(s);
		char ch;
		int pos = 0;
		for(int i = 0;i < s.length();i++) {
			if((int)s.charAt(i) == 32) {
				ch = s.charAt(i-1);
				sb.deleteCharAt(i-1);
				sb.insert(pos, ch);
				pos = i+1;
			} else if(i == s.length()-1) {
				ch = s.charAt(i);
				sb.deleteCharAt(i);
				sb.insert(pos, ch);
			}
		}
		System.out.println(sb);
	}

}
