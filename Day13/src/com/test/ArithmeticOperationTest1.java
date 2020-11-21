/**
 * @ author vaishnavi
 * @ date 19/11/2020
 * ArithmeticOperationTest1 class is for testing ArithmeticOperation class multiplication method.
 */
package com.test;
import static org.junit.Assert.*;
import org.junit.Test;
import com.src.ArithmeticOperation;
public class ArithmeticOperationTest1 {
    @Test
	public void testAdd() {
		ArithmeticOperation ac=new ArithmeticOperation();//creating instance of ArithmeticOperation Class
		int n= ac.multiplication(3, 4);//actual value by invoking multiplication method.
		System.out.println("multiplied");
		assertEquals(12,n);//verifying expected value with actual value.
	}

}
