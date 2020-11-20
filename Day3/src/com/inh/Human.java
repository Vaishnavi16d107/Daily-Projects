package com.inh;

public class Human {
	//base class
	String name;//base class members
	String gender;
	
	Human()//default constructor explicitly
	{
		
	}
	Human(String name,String gender)
	{
		this.name=name;//initializing members using constructor
		this.gender=gender;
	}
	
	public void find(Woman w,Man m)//to find the eldest person
	{
		if(w.age>m.age)//comparing the age of women object and man object
		{
			System.out.println(w.name+ "is elder");
		}
		else
		{
			System.out.println(m.name+ "is elder");
		}
	}

}

class Woman extends Human
{  //derived class
	int age;

	public Woman(int age,String name,String gender) {
		super(name,gender);//initializing derived class members using constructor
		this.age = age;
	}
	
	
	
}

class Man extends Human
{   //derived class
	int age;
	
	public Man(int age,String name,String gender) {
		super(name,gender);//initializing using constructors
		this.age = age;
	}
}


class Main_1Class
{
	public static void main(String args[])
	{
		Woman w1=new Woman(35,"rani","F");//creating object of derived woman class with arguments
		
		Man m1=new Man(60,"raja","M");//creating object of derived man class with arguments
		
		w1.find(w1, m1);//invoking find method with derived object by passing woman and man object
	}
}