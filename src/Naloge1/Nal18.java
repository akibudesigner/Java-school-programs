package Naloge1;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Nal18 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		String x = scanner.nextLine();
		String r = scanner.next();
		scanner.close();
		Pattern pat = Pattern.compile("(?i)"+r); // (?i) pomeni case insensitive
		Matcher mat = pat.matcher(x);
		String y = mat.replaceAll(new String(new char[r.length()]).replace("\0", "x"));
		System.out.println(y);
	}

}
