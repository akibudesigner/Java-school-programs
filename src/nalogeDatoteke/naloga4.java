import java.util.*;
import java.io.*;
public class naloga4
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
				if(st%2==0)
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