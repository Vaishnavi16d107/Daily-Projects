import java.util.Scanner;

public class Task_6 {

	public static void main(String[] args) {
		int num,rem,rev=0,sum=0,arm=0,num1;
		boolean flag=false;
		System.out.println("Enter a Number");
		Scanner sc=new Scanner(System.in);
		num=sc.nextInt();
		int ch=0;
		do
		{
			System.out.println("1)Check Prime or Not");
			System.out.println("2)Check Palindrome or Not");
			System.out.println("3)Check Perfect Number or Not");
			System.out.println("4)Check Armstrong or Not");
			System.out.println("5)exit");
			
			System.out.println("Enter your option");
			
			ch=sc.nextInt();
			switch(ch)
			{
			case 1:
				   for(int i=2;i<=num/2;i++)
				   {
					   if(num%i==0)
					   {
						   flag=true;
						   break;
					   }
				   }
				   if(flag==false)
				   {
					   System.out.println("prime");
				   }
				   else
				   {
					   System.out.println("Not prime");
				   }
			        
			             break;
			 case 2:
				                while(num>0)
				             {
					              rem=num%10;
					              rev=rev*10+rem;
					              num=num/10;
		                       }
				                if(num==rev)
				                {
				                	System.out.println("palindrome");
				                }
				                else
				                {
				                	System.out.println("Not palindrome");
				                }
				                
				                break;
				                
			 case 3:
				    for(int j=1;j<num;j++)
				    {
				    	if(num%j==0)
				    	{
				    		sum=sum+j;
				    	}
				    }
				    if(sum==num)
				    	System.out.println("perfect number");
				    else
				    	System.out.println("not a perfect number");
				                 break;
				    
			 case 4:
				    num1=num;
				    while(num>0)
				    {
				    	rem=num%10;
				    	arm=arm+rem*rem*rem;
				    	num=num/10;
				    }
				    if(num1==arm)
				    	System.out.println("Armstrong Number");
				    else
				    	System.out.println("Not an Armstrong Number");
				    break;
			 case 5:
				       break;
			
		}
		}while(ch!=5);

		
		}
}

