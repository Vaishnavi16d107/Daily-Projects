//*
/*
 * @author vaishnavi
 * @date 18/11/2020
 * MainEmployeeClass accepts details from user and computes operations on employee object using stream
 * sorted method returns default sorting or can be implemented on collections with customised sorting
 * filter method is for applying conditions
 * min and max method is for finding minimum and maximum value
 * map method is for applying implementation for all collection elements
 */
package com.streams;
import java.util.HashSet;
import java.util.Optional;
import java.util.Scanner;
import java.util.stream.Collectors;
public class MainEmployeeClass {
      public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int num;
		HashSet<EmployeeClassEx> hs=new HashSet<>();//declaring hashset to avoid duplicate entries
		System.out.println("enter number of employees to be added");
		num=sc.nextInt();
		for(int i=0;i<num;i++)
		{  System.out.println("enter employee name");//accepting employee details from user
		   String name=sc.next();
		   System.out.println("enter employee id");
		   int id=sc.nextInt();
		   System.out.println("enter employee salary");
		   double salary=sc.nextDouble();
		   System.out.println("enter employee age");
		   int age=sc.nextInt();
		   System.out.println("enter employee working years");
		   int years=sc.nextInt();
		   EmployeeClassEx e=new EmployeeClassEx(id,name,salary,age,years);//creating employee class object
		   hs.add(e);
			
		}
		System.out.println(hs);
		//sorted method sorts elements by specified comparator operation
		HashSet hs1=(HashSet) hs.stream().sorted((e1,e2)-> (Integer)e1.eyears>(Integer)e2.eyears?-1:1).collect(Collectors.toSet());
	    System.out.println(hs1);
	    //max function returns maximum element by pass compartor object 
	    Optional<EmployeeClassEx> max=hs.stream().max((e3,e4)-> (Double)e3.esalary>(Double)e4.esalary?1:-1);
        System.out.println(max);
        //max function returns maximum element by pass compartor object
        Optional<EmployeeClassEx> min=hs.stream().min((e5,e6)-> (Double)e5.esalary>(Double)e6.esalary?1:-1);
        System.out.println(min);
		//map method applies the specified implementation to all elements of collection
		HashSet hs2=(HashSet)hs.stream()
		                       .filter((e)-> (Integer)e.eyears<2)
		                       .sorted((e1,e2)-> (Integer)e1.eyears<(Integer)e2.eyears?-1:1)
		                       .collect(Collectors.toSet());
		System.out.println(hs2);
		//count function returns an integer value by counting elements that is filtered
		int count=(int) hs.stream().filter((e)-> (Integer)e.eyears>5).count();
		System.out.println(" Number of employees with five years experience "+count);
		//employees are filtered with working experience greater than 5 getting bonus of 50000
		HashSet hs3=(HashSet) hs.stream().filter((e)-> (Integer)e.eyears>5).map((e)-> e.esalary=(Double)e.esalary+50000).collect(Collectors.toSet());
		System.out.println(hs3);
		//employees are filtered with working experience greater than 2 and less than 5 getting bonus of 25000
		HashSet hs4=(HashSet) hs.stream().filter((e)-> (Integer)e.eyears>2 && (Integer)e.eyears<5).map((e)-> e.esalary=(Double)e.esalary+25000).collect(Collectors.toSet());
		System.out.println(hs4);
		//employees are filtered with working experience less than 2 getting bonus of 10000
		HashSet hs5=(HashSet) hs.stream().filter((e)-> (Integer)e.eyears<2).map((e)-> e.esalary=(Double)e.esalary+10000).collect(Collectors.toSet());
		System.out.println(hs5);
		
		
	}

}
