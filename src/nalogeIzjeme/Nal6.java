package Naloge4;

import java.io.BufferedReader;
import java.io.FileReader;

public class Nal6 {
    public static void main(String[] args) {
        String d = "autoexec.bat";
        FileReader fr = null;
        BufferedReader br = null;
        try {
            fr = new FileReader(d);
            br = new BufferedReader(fr);
            String s = "";
            while((s = br.readLine()) != null) {
                System.out.println(s);
            }
        } catch(Exception e) {
            e.printStackTrace();
        }
    }
}
