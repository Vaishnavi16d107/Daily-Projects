/**
 * @ author vaishnavi
 * @ date 19/11/2020
 * DebugClassEx illustrtes point to point debug by toggling required breadpoints
 */
package com.src;
public class DebugClassEx {
   public static void main(String[] args) {
	   //inserting toggle points
	   DebugClassEx d=new DebugClassEx();//creating object of DebugClassEx 
       d.print();//calling print method
    }
	
	@SuppressWarnings("all")
	public void print()
	{   //loop for continuous print of numbers upto 50
		for(int i=0;i<50;i++)
		{
			System.out.println(i);
		}
		
	}

}
