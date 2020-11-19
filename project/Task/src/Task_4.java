import java.util.Scanner;
public class Task_4 {

	public static void main(String[] args) {
		 
		int m1,m2,m3;//getting three different marks
		int Total;
		double percentage;
        
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter three different marks");
		m1=sc.nextInt();
		m2=sc.nextInt();
		m3=sc.nextInt();
		
		Total=m1+m2+m3;//computing total
		
		percentage=((double)Total/300)*100;//computing percentage
		
		System.out.println("Total "+Total+" "+"Percentage "+percentage);
		//depending on percentage respective grades
		if(percentage>75 && percentage<=100)
		{
			System.out.println("Secured First Class");
		}
		else if(percentage>=65 && percentage<=75)
		{
			System.out.println("Secured Second Class");
		}
		else if(percentage>=35 && percentage<=65)
		{
			System.out.println("Secured Third Class");
		}
		else if(percentage>=0 && percentage<35)
		{
			System.out.println("Not Qualified");
			
		}
		else
		{
			System.out.println("Invalid");
		}
		
		
		sc.close();
		
	}

}
