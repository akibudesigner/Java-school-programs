package Naloge4;

public class Nal3 {
    private static int[] m = {52, 42, 421, 493};

    public static void main(String[] args) {
        int x = 5;
        int y = 0;
        first(x, y);
        second(x);
    }

    public static void first(int x, int y) {
        try {
            int r = x/y;
        } catch(ArithmeticException e) {
            System.out.println(e.toString());
            System.out.println(e.getMessage());
        }
    }

    public static void second(int x) {
        try {
            int r = m[x];
        } catch(IndexOutOfBoundsException e) {

        }
    }
}
