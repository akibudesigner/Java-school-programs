import java.util.*;
import java.io.*;
public class naloga5a
{
	public static void main(String[] args) 
	{
		try{
			InputStream in = new FileInputStream("besedilo.txt");
			OutputStream out = new FileOutputStream("datoteka.txt");
			
			int bajt = 0;
			int st = 0;
			while(in.available()!=0) // ali tak pogoj: bajt=in.read()!=-1
			{
				bajt = in.read();
				if(bajt >= 65 && bajt<=90)
				{
				out.write(bajt);
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