package Naloge4;

public class Nal7 {
    public static void main(String[] args) {
        try {
            Nal6.main(args);
        } catch(Exception e) {
            e.printStackTrace();
        } finally {
            System.out.println("Finally!");
        }
    }
}
