package com.inh;


public class Contact {
	    //base class

		String contactPerson;//declaring base class memebers
		long mblno;
		String emailId;
		
		Contact()//default constructor explicitly
		{
			
		}
		
		Contact(String contactPerson,long mblno,String emailId)
		{
			this.contactPerson=contactPerson;//initializing members using constructor
			this.mblno=mblno;
			this.emailId=emailId;
			
		}
		
		public void printContact()
		{
			System.out.println(contactPerson+"-"+mblno+"-"+emailId);//displaying contact details
		}
		
		
	}

class CompanyContact extends Contact
	{    //derived class
		String companyName;//declaring derived class members
		String website;
		String department;
		String city;
		String country;
		String address;
		long pinnno;
		
		CompanyContact()
		{
			
		}
		public CompanyContact(String companyName, String website, String department, String city, String country,
				String address, long pinnno) {
			super("rani",78654323,"rani@gmail.com");//initializing using constructor
			this.companyName = companyName;
			this.website = website;
			this.department = department;
			this.city = city;
			this.country = country;
			this.address = address;
			this.pinnno = pinnno;
		}
		
		public void printContact()
		{   super.printContact();//calling base class method and displaying it
			System.out.println(contactPerson+"-"+mblno+"-"+emailId+"-"+companyName+"-"+website+"-"+department+"-"+country);
		}
		
		
		
	}

class EmployeeContact extends Contact
	{  //derived class
		String city;//declaring derived class members
		String country;
		long pinno;
		String dob;
		String designation;
		
		EmployeeContact()
		{
			
		}
		public EmployeeContact( String city, String country, long pinno,String dob, String designation) {
			super("raju",98456789,"raju@gmail.com");//initializing base class members using super
			this.city = city;
			this.country = country;
			this.pinno = pinno;
			this.dob = dob;
			this.designation = designation;
		}
			
			public void printContact()
			{
				System.out.println(contactPerson+"-"+mblno+"-"+emailId+"-"+city+"-"+country+"-"+dob+"-"+designation);
			}
		
		
		
	}
	
	
class DriverClass
{
	public static void main(String args[])
	{
		CompanyContact cc=new CompanyContact("hcl","www.hcl.com","financial","Chennai","India","sholingnalur",600002);
		cc.printContact();
		
		EmployeeContact ec=new EmployeeContact("Bangalore","india",500002,"17/09/1998","software engineer");
		ec.printContact();
	}
}
