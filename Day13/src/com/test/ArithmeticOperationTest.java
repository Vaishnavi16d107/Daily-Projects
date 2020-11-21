/**
 * @ author vaishnavi
 * @ date 19/11/2020
 * ArithmeticOperationTest class is for testing ArithmeicOperation add method.
 */
package com.test;
import static org.junit.Assert.*;
import org.junit.Test;
import com.src.ArithmeticOperation;
public class ArithmeticOperationTest {
    @Test
	public void testAdd() {
		ArithmeticOperation ac=new ArithmeticOperation();//creating instance of ArithmeticOperation class
		int n= ac.add(3, 4);//actual value by invoking add method
		System.out.println("added");
		assertEquals(7,n);//vertifying expected value with actual value.
	}

}
