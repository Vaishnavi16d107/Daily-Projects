
import java.io.*;
public class ExceptionEx1{

	
   public static void main(String args[])
   {
	int n=10;
	int i=0;
	int[] v = new int[n];
	FileReader f=null;
	BufferedReader in=null;
	try {
	    f = new FileReader("dati.txt");
	    in = new BufferedReader(f);
	    String linea = in.readLine();
	    try
	    {
	         while (linea!=null)
	       {
	          v[i] = Integer.parseInt(linea);
	          linea = in.readLine();
	          i++;
	       }
	    }
	    catch(Exception e)
	    {
	    	System.out.println(e);
	    	System.out.println("exception occurred");
	    }
	   
	   
	}
	catch(FileNotFoundException e)
	{
		System.out.println(e);
		System.out.println("file not found exception");
	}
	catch(IOException e)
	{
		System.out.println(e);
		System.out.println("io exception");
	}
	catch(NullPointerException e)
	{
		System.out.println(e);
		System.out.println("null pointer exception");
	}
    finally
	{
	  try {
		f.close();
		 in.close();
	} catch (IOException e1) {
		System.out.println(e1);
		
	}
	  catch(Exception e1)
	  {
		  System.out.println(e1);
		  System.out.println("null pointer exception");
	  }
	  
	}
	System.out.println("end of program");
  
	
   }

	
}
