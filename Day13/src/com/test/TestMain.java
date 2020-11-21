/**
 * @ author vaishnavi
 * @ date 19/11/2020
 * TestMain class is main class for running Suit(AllTests class)class.
 */
package com.test;
import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;
public class TestMain {
    public static void main(String[] args) {
		Result result=JUnitCore.runClasses(AllTests.class);//Result class collects the results obtained by running AllTests suite class.
		for(Failure failure:result.getFailures())//Failure class collects failure results from classes that fails in verifying.
		{
			System.out.println(failure.toString());//failure results are printed on console.
		}
		System.out.println(result.wasSuccessful());//to check whether testing is successful.

	}

}
