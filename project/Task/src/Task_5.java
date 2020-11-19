import java.util.Scanner;


public class Task_5 {

	public static void main(String[] args) {
		 
		int a,b,c,l1,l2,l3,Total;
		int rem=0,rev=0;
		System.out.println("Enter three Numbers greater than 100");
		Scanner sc=new Scanner(System.in);
		a=sc.nextInt();
		b=sc.nextInt();
		c=sc.nextInt();
		//last digits of three Numbers
		l1=a%10;
		l2=b%10;
		l3=c%10;
		
		if(l1%2==0 && l2%2==0 && l3%2==0 || l1%2!=0 && l2%2!=0 && l3%2!=0)//checking all digits are odd or even
		{
			Total=a+b+c;
			System.out.println("Total "+Total);
		}
		else
		{
			if(l1%2!=0)
			{
				while(a>0)//reversing particular number when last digit is odd
				{
					rem=a%10;
					rev=rev*10+rem;
					a=a/10;
		        }
				System.out.println("Total "+(rev+b+c));
			}
			else if(l2%2!=0)
			{
				while(b>0)
				{
					rem=b%10;
					rev=rev*10+rem;
					b=b/10;
		        }
				System.out.println("Total "+(a+rev+c));
				
			}
			else
			{
				
				while(c>0)
				{
					rem=c%10;
					rev=rev*10+rem;
					c=c/10;
		        }
				System.out.println("Total "+(a+b+rev));
				
			}
		}
		sc.close();

	}

}
