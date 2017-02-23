package Naloge3;

public class Nal11 {
    public static void main(String[] args) {
        int c = compare("enaa", "dvaaa");
        System.out.println(c);
    }

    public static int compare(String s1, String s2) {
        if(length(s1) > length(s2))
            return 1;
        else if(length(s1) < length(s2))
            return 2;
        return 0;
    }

    public static int length(String s) {
        if(s.equals(""))
            return 0;
        return length(s.substring(1))+1;
    }
}
