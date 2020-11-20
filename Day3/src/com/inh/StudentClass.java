package com.inh;

public class StudentClass {
	//base class
	String name;//base class members
	int rollno;
	
	StudentClass()
	{
		
	}
	public StudentClass(String name, int rollno) {
		
		this.name = name;//initializing members using constructor
		this.rollno = rollno;
	}
	
	
	

}

class Record extends StudentClass
{  //derived class
	String address;

	public Record(String address,String name,int rollno) {
		super(name,rollno);//initializing derived class members
		this.address = address;
	}
	
	public void display()
	{
		System.out.println(name+"-"+rollno+"-"+address);//displaying record of student
	}
	
}

class Main_2
{
	public static void main(String args[])
	{
		Record r=new Record("6/7,southmainroad,chennai","raju",51324);//derived class object creation
		r.display();//invoking display method to display the record
		
	}
}
