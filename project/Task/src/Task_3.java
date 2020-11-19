
public class Task_3 {
    
	int a=45;//instance or Non static variable
	static int b=15;//static variable
	public static void main(String[] args) {
		
       Task_3 t3=new Task_3();//to access instance variable in static method
		int c=0;
	
		c=t3.a+b;
		System.out.println("addition  "+c);
		c=t3.a-b;
		System.out.println("subtraction  "+c);
		c=t3.a*b;
		System.out.println("multiplication  "+c);
		c=t3.a%b;
		System.out.println("modulo  "+c);
		c=t3.a/b;
		System.out.println("division  "+c);
		
		
		
		

	}

}
