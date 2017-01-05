package Naloge3;

public class Nal10 {
    public static void main(String[] args) {
        System.out.println(isPal("kajakd"));
        System.out.println(isPalI("kajak"));
    }

    public static boolean isPal(String s) {
        if(s.length() == 0 || s.length() == 1)
            return true;
        if(s.charAt(0) == s.charAt(s.length()-1))
            return isPal(s.substring(1,s.length()-1));
        return false;
    }

    public static boolean isPalI(String s) {
        int n = s.length();
        for(int i = 0; i<n/2; i++)
            if (s.charAt(i) != s.charAt(n-i-1))
                return false;
        return true;
    }
}
