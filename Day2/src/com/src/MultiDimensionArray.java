package com.src;
import java.util.Scanner;
public class MultiDimensionArray {

	public static void main(String[] args) {
		int r=0,c=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the rows and colns");//getting rows and colns of 2D array
		r=sc.nextInt();
		c=sc.nextInt();
		int a[][]=new int[r][c];
		int b[][]=new int[r][c];
		int add[][]=new int[r][c];
		int sub[][]=new int[r][c];
		int mul[][]=new int[r][c];
		int div[][]=new int[r][c];
		 
		System.out.println("Enter Matrix a");//getting a matrix
		for(int i=0;i<r;i++)
		{
			for(int j=0;j<c;j++)
			{
				a[i][j]=sc.nextInt();
			}
		}
		
		System.out.println("Enter Matrix b");//getting b matrix
		for(int i=0;i<r;i++)
		{
			for(int j=0;j<c;j++)
			{
				b[i][j]=sc.nextInt();
			}
		}
		
		for(int i=0;i<r;i++)
		{
			for(int j=0;j<c;j++)
			{
				add[i][j]=a[i][j]+b[i][j];//matrix addition
				sub[i][j]=a[i][j]-b[i][j];//matrix subtraction
				div[i][j]=a[i][j]/b[i][j];//matrix division
			}
		}
		
		for(int i=0;i<r;i++)
		{
			for(int j=0;j<c;j++)
			{    
				mul[i][j]=0;
				for(int k=0;k<c;k++)
				{
					mul[i][j]+=a[i][k]*b[k][j];//matrix multiplication
				}
			}
		}
		
		System.out.println("Matrix Addition");
		for(int i=0;i<r;i++)
		{
			for(int j=0;j<c;j++)
			{  
				System.out.print(add[i][j]+" ");
			}
			System.out.println(" ");
		}
		
		System.out.println("Matrix Subtraction");
		
		for(int i=0;i<r;i++)
		{
			for(int j=0;j<c;j++)
			{   
				System.out.print(sub[i][j]+" ");
			}
			System.out.println(" ");
		}
		
		System.out.println("Matrix Multiplication");
		for(int i=0;i<r;i++)
		{
			for(int j=0;j<c;j++)
			{
				System.out.print(mul[i][j]+" ");
			}
			System.out.println(" ");
		}
		
		System.out.println("Matrix Division");
		for(int i=0;i<r;i++)
		{
			for(int j=0;j<c;j++)
			{
				System.out.print(div[i][j]+" ");
			}
			System.out.println(" ");
		}
	}

}
