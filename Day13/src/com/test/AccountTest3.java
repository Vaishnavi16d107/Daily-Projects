package com.test;

import static org.junit.Assert.*;

import org.junit.Test;

import com.src.Account;

public class AccountTest3 {

	@Test
	public void testGetAccountNumber() {
		

		Account a=new Account("raja",66778899,10000f);
		System.out.println("retrieved account number");
		assertEquals(66778899,a.getAccountNumber());
		
	}

}
