package com.inh;

public class Rectangle {
	//base class
	float length,width;//base class members
	 
	Rectangle()
	{
		
	}
	
	Rectangle(float length,float width)
	{
		this.length=length;//initializing base class members using constructor
		this.width=length;
	}
	
	public void area(float l,float w,float d)
	{
		double a=l*w*d;//computing area 
		System.out.println("the area is "+a);
	}

}

class Box extends Rectangle
{   //derived class
	float depth;
	
	Box(float length,float width,float depth)
	{
		super(length,width);//initializing base arguments and derived 
		this.depth=depth;
	}
	
	public void display()//method to display the area
	{
		area(length,width,depth);

	}

	
	
}


class Main_4
{
	public static void main(String args[])
	{
		Box b=new Box(45.57f,34.0f,43.2f);//derived class object creation
		b.display();//invoking display method to display area
				
	}
}
