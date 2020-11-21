/**
 * @ author vaishnavi
 * @ date 19/11/2020
 * AllTests1 class is a suite class for running multiple test classes.
 */
package com.test;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;
@RunWith(Suite.class)
@SuiteClasses({ AccountTask2.class, AccountTest.class, AccountTest1.class, AccountTest3.class })
public class AllTests1 {

}
