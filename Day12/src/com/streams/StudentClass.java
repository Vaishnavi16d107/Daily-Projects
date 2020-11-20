//*
/*
 * @author vaishnavi
 * @date 18/11/2020
 * student class is for declaring student related details and initializing it.
 */
package com.streams;
public class StudentClass {
	String studname;//declaring student related attributes
	String rollno;
	String dob;
	public StudentClass(String studname, String rollno, String dob) {
		this.studname = studname;//initializing using constructor
		this.rollno = rollno;
		this.dob = dob;
	}
	@Override
	public String toString() {//overriding using toString() method for displaying all values
		return "StudentClass [studname=" + studname + ", rollno=" + rollno + ", dob=" + dob + "]";
	}
	

}
