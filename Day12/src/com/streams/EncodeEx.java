//*
/*
 * @author vaishnavi
 * @date 18/11/2020
 * Encode class is for performing encoding operation on data 
 * Base64 is for encoding and decoding data
 */
package com.streams;
import java.util.Base64;
import java.util.Scanner;
public class EncodeEx {
    public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter number of students to be accepted");//accepting number of students to be accepted
		int number=sc.nextInt();
		for(int i=0;i<number;i++)
		{   System.out.println("enter student name");//accepting details from user
			String name=sc.next();
			System.out.println("enter student rollno");
			String rollno=sc.next();
			System.out.println("enter student date of birth");
			String dob=sc.next();
			StudentClass s=new StudentClass(name,rollno,dob);//creating student class object
			Base64.Encoder encode=Base64.getEncoder();//declaring object for Encoder
			s.studname=encode.encodeToString(s.studname.getBytes());//applying encoding to student name
			s.rollno=encode.encodeToString(s.rollno.getBytes());//applying encoding to student rollno
			s.dob=encode.encodeToString(s.dob.getBytes());//applying encoding to student date of birth
			System.out.println(s);
		}
	
		
	}

}
