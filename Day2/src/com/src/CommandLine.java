package com.src;

public class CommandLine {

	public static void main(String[] args) {
		int n;
		int rem,rev=0;
		boolean flag=false;
		if(args.length>0)
		{
			n=Integer.parseInt(args[0]);//getting command line argument
			
			
			while(n>0)
			{
				rem=n%10;//reversing the number
				rev=rev*10+rem;
				n=n/10;
			}
			
			for(int j=2;j<=rev/2;j++)
			{
				if(rev%j==0)//checking prime or not
				{
					flag=true;
					break;
				}
			}
			if(flag==false)
			{
				System.out.println(rev+"is prime number");
				
			}
			else
			{
				System.out.println(rev+"is not a prime number");
			}
			
		}

	}

}
