package Naloge4;

public class Nal4 {
    public static void main(String[] args) throws Exception {
        try {
            String x = args[0];
            System.out.println(x);
            System.out.println("Program se je izvedel brez izjem.");
        } catch(IndexOutOfBoundsException e) {
            System.out.println("Pozabil si podati niz.");
        }
    }
}
