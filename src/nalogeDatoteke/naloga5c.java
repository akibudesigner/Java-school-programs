import java.util.*;
import java.io.*;
public class naloga5c
{
	public static void main(String[] args) 
	{
		try{
			InputStream in = new FileInputStream("besedilo.txt");
			OutputStream out = new FileOutputStream("datoteka.txt");
			
			int bajt = 0;
			int st = 0;
			while(in.available()!=0) 
			{
				bajt = in.read();
				if(bajt >= 65 && bajt<=90)
				{
				out.write(bajt+32);
				}
				if(bajt >= 97 && bajt<=122)
				{
				out.write(bajt-32);
				}
				st++;
			}
			in.close();
			
		}catch(FileNotFoundException e){
			e.printStackTrace();
		}
		catch(IOException e){
			e.printStackTrace();
		}
	}
}