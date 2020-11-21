/**
 * @ author vaishnavi
 * @ date 19/11/2020
 * AccountTest class is for testing Account class deposit  method.
 */
package com.test;
import static org.junit.Assert.*;
import org.junit.Test;
import com.src.Account;
public class AccountTest {
    @Test
	public void testDeposit() {
		Account a=new Account("raja",66778899,10000f);//creating Account class instance
		System.out.println("deposited amount");
		assertEquals(true,a.deposit(4000f));//verifying expected value with actual value by invoking deposit method.
	}

}
