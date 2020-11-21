/**
 * @ author vaishnavi
 * @ date 19/11/2020
 * FileReadWriteClass is for reading and writing  a file 
 */
package com.src;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
public class FileReadWriteClass {
	FileWriter fw=null;//declaring objects of filereader and filewriter
	FileReader fr=null;
	String name;//declaring variable name for accepting name from user
	public String readWriteOperation() throws IOException
	{   //method that writes to file
		Scanner sc=new Scanner(System.in);
		System.out.println("enter name");
		name=sc.next();//accepting name from user
		try {
			fw=new FileWriter(name+".txt");//creating new file
			fw.write(name);//writing name to created file
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally
		{
			fw.close();//closing filewriter for saving contents in file
		}
		 return "done";
		
}
	public String readOperation() throws IOException {
		//readOpertaion method reads from file
		String fname=name;
		fr=new FileReader(name+".txt");//specifying file to be read
        int i;
		while((i=fr.read())!=-1)//reads from file until EOF
		{
		   System.out.print((char)i);
		}
		return "done";
		
	}
	
}
