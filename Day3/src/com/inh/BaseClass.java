package com.inh;
import java.util.Scanner;
public class BaseClass {
    //base class members
	int a,b;
	Scanner sc=new Scanner(System.in);
	
	
	BaseClass()
	{
		System.out.println("enter two numbers");
		a=sc.nextInt();//getting input to the members from user
		b=sc.nextInt();
	  
	}
	
	public void dispMax()
	{
		
	}
	
	public void dispMin()
	{
		
	}
	
}

class DerivedClass extends BaseClass
{
    //derived class
	public void dispMax()//method to display maximum and overriding the base class method
	{
		if(a>b)
		{
			System.out.println(a+" "+"is maximum");
		}
		else
		{
			System.out.println(b+" "+"is maximum");
		}
	}
	
	
	public void dispMin()//method to display minimum and overriding the base class method
	{
		if(a<b)
		{
			System.out.println(a+" "+"is minimum");
		}
		else
		{
			System.out.println(b+" "+"is minimum");
		}
	}
}


class Main_3
{
	public static void main(String args[])
	{
		BaseClass b=new DerivedClass();//dynamic binding the object
		
		b.dispMax();
		b.dispMin();
		
	}
}