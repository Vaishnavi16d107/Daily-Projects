//*
/*
 * @author vaishnavi
 * @date 18/11/2020
 * EmployeeClassEx is for declaring employee related attributes and initializing it.
 * Overriding equals method to avoid duplicate entry
 */
package com.streams;
public class EmployeeClassEx {
    @Override
	public int hashCode() {//hashCode method returns the reference of this class
	   return this.eid;
	}
    @Override
	public String toString() {//toString() is overriddent to display all values
		return "EmployeeClassEx [eid=" + eid + ", ename=" + ename + ", esalary=" + esalary + ", eage=" + eage
				+ ", eyears=" + eyears + "]";
	}
	int eid;//declaring attributes for employee
	String ename;
	double esalary;
	int eage;
	int eyears;
	public EmployeeClassEx(int eid, String ename, double esalary, int eage, int eyears) {
		this.eid = eid;//initializing attributes using constructor
		this.ename = ename;
		this.esalary = esalary;
		this.eage = eage;
		this.eyears = eyears;
	}
    @Override
	public boolean equals(Object obj) {//equals method is overridden to avoid duplicate entry in set
		return this.eid==eid;
	}
	
	
	
}
