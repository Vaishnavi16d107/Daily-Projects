package com.inh;
import java.util.Scanner;

public class Student {

	String stuName;//declaring members of Student
	int rollno;
	int marks[]=new int[4];
	
	
	Student(String stuName,int rollno)//parametric constructor to initialize members
	{
		this.stuName=stuName;
		this.rollno=rollno;
		
	}
	
	
}

class MyRecord extends Student{
	  
	MyRecord(String stuName, int rollno) {
		super(stuName,rollno);//initializing base class members
	}

	double percentage;
	int total=0;
	
	public double percentageCalculation()//percentage calculation
	{
		for(int j=0;j<marks.length;j++)
		{
			total=total+marks[j];
		}
		 return percentage=((double)total/400)*100;
		
	}
	
	public void display()
	{
		System.out.println(stuName+" "+rollno+" "+percentageCalculation());
	}
	
}

class MainClass
{
	public static void main(String args[])
	{
		MyRecord m=new MyRecord("Raju",4321);//derived class object creation
		Scanner sc=new Scanner(System.in);
		System.out.println("enter marks");//getting array of marks
		for(int i=0;i<m.marks.length;i++)
		{
			m.marks[i]=sc.nextInt();
		}
		
		m.display();//displaying the record
	}
}