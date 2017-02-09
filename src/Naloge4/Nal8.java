package Naloge4;

public class Nal8 {
    public static void main(String[] args) throws Exception {
        try {
            Nal6.main(args);
        } catch(Exception e) {
        } finally {
            throw new Exception("Finally!");
        }
    }
}
