import java.util.*;
import java.io.*;
public class naloga5
{
	public static void main(String[] args) 
	{
		try{
			InputStream in = new FileInputStream("besedilo.txt");
			
			
			System.out.println(in.available());
			in.close();
			
		}catch(FileNotFoundException e){
			e.printStackTrace();
		}
		catch(IOException e){
			e.printStackTrace();
		}
	}
}