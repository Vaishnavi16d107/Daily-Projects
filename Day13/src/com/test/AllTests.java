/**
 * @ author vaishnavi
 * @ date 19/11/2020
 * AllTests class is a suite class for running multiple test classes for ArithmeticOperation class.
 */
package com.test;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;
@RunWith(Suite.class)
@SuiteClasses({ ArithmeticOperationTest.class, ArithmeticOperationTest1.class })
public class AllTests {

}
