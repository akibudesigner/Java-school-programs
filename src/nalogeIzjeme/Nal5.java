package Naloge4;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Nal5 {
    public static void main(String[] args) throws IOException {
        String d = args[0];
        FileReader fr = null;
        BufferedReader br = null;
        try {
            fr = new FileReader(d);
            br = new BufferedReader(fr);
            String s = "";
            while((s = br.readLine()) != null) {
                System.out.println(s);
            }
        } catch(ArrayIndexOutOfBoundsException e) {
            e.printStackTrace();
        } catch(FileNotFoundException e) {
            e.printStackTrace();
        } catch(IOException e) {
            e.printStackTrace();
        } finally {
            System.out.println("Ta program vsebuje lovljenje izjem!");
            br.close();
            fr.close();
        }
    }
}
