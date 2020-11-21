/**
 * @ author vaishnavi
 * @ date 19/11/2020
 * AccountTask2 class is for testing Account class getBalance method
 */
package com.test;
import static org.junit.Assert.*;
import org.junit.Test;
import com.src.Account;
public class AccountTask2 {

	@SuppressWarnings("deprecation")
	@Test
	public void testGetBalance() {
	    Account a=new Account("raja",66778899,10000f);//creating instance of Account class
		a.addInterest();//invoking addInterest method to compute balance with interest
		double bal=10000f+(10000f*0.045f);//expected balance
		System.out.println("retrieved balance amount");
		assertEquals(bal,a.getBalance(),bal);//to verify expected and actual value by passing test cases
		
	     
	}

}
