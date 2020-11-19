package com.src;

import java.util.Scanner;

public class Customer {
	//business logic class
	String name;
	int cusid;
	String emailId;
	long mobileNo;
	String address;
	long accno;
	

	
	Customer(String ename,int cid,String mailid,long mblno,String add,long accNo)
	  {
		name=ename;
		cusid=cid;
		emailId=mailid;
		mobileNo=mblno;
		address=add;
		accno=accNo;
	
	  }
	
}


