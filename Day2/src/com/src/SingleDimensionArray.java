package com.src;
import java.util.Scanner;

public class SingleDimensionArray {

	public static void main(String[] args) {
		int n,num;
		boolean flag=false;
		int rem,rev=0,sum=0,arm=0,rem1,num1;
        System.out.println("Enter the n value");//getting size of array
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		int a[]=new int[n];
		
		System.out.println("Enter array elements");
		for(int i=0;i<n;i++)
		{
			a[i]=sc.nextInt();//getting 1D array elements
		}
		
		for(int j=0;j<n;j++)
		{
			for(int k=2;k<=a[j]/2;k++)// checking prime or not
			{
				if(a[j]%k==0)
				{
					flag=true;
					break;
				}
			}
				if(flag==false)
				{
					System.out.println(a[j]+"is prime");
				}
				else
				{
					System.out.println(a[j]+"is Not prime");
				}
				
	     }
		
		
          for(int i=0;i<n;i++)
          {
      	     num=a[i];
			while(a[i]>0)//checking palindrome or not
			{
				rem=a[i]%10;
				rev=rev*10+rem;
				a[i]=a[i]/10;
			}
			if(num==rev)
			{
				System.out.println(num+"is palindrome");
			}
			else
			{
				System.out.println(num+"is not a palindrome");
			}
				
          }
          
          
          for(int i=0;i<n;i++)
		   {
			   for(int k=1;k<a[i];k++)//checking perfect number or not
			   {
				   if(a[i]%k==0)
				   {
					   sum+=k;
				   }
			   }
		   
		   if(a[i]==sum)
		   {
			   System.out.println(a[i]+"perfect number");
		   }
		   else
		   {
			   System.out.println(a[i]+"Not perfect number");
		   }
		   
		   }
          
          
          for(int j=0;j<n;j++)
		   {
     	        num1=a[j];//checking armstrong number or not
			    while(a[j]>0)
			    {
			    	rem1=a[j]%10;
			    	arm=arm+rem1*rem1*rem1;
			    	a[j]=a[j]/10;
			    }
			    if(num1==arm)
			    	System.out.println(num1+"Armstrong Number");
			    else
			    	System.out.println(num1+"Not an Armstrong Number");
		   
		   }
		
	}
          
          
		
	}


