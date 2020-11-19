

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class ForEachLoopEx {

	public static void main(String[] args) {
		
		
		HashMap hm=new HashMap();
		
		hm.put(1, "one");
		hm.put(2,"two");
		hm.put(3, "three");
		
		hm.forEach((a,b)->System.out.println(a+" "+b));
		
		//hm.forEach(System.out::println);
		ArrayList<Integer> al=new ArrayList();
		al.add(7);
		al.add(67);
		al.add(45);
		al.add(90);
		
		al.forEach(System.out::println);

	}

}
