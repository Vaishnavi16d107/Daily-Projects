/**
 * @ author vaishnavi
 * @ date 19/11/2020
 * AccountTest1 class is for testing Account class withdraw method
 */
package com.test;
import static org.junit.Assert.*;
import org.junit.Test;
import com.src.Account;
public class AccountTest1 {
    @Test
	public void testWithdraw() {
		Account a=new Account("raja",66778899,10000f);//creating instance of Account class instance
		a.deposit(4000f);//invoking deposit method
		System.out.println("amount withdrawed");
		assertEquals(true,a.withdraw(1000f, 10f));//verifying expected value with actual  value by invoking withdraw method.
		
		
		
	}

}
