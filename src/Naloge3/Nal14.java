package Naloge3;

public class Nal14 {
    public static void main(String[] args) {
        int n = 5;
        try {
            System.out.println(valf(5));
        } catch(Exception e) {
            e.printStackTrace();
        }
    }

    public static int valf(int n) throws Exception {
        if(n <= 0)
            throw new Exception("Ne sme biti manjše od 0");
        if(n == 1)
            return 1;
        return 2*valf(n-1)+3*n;
    }
}
