/**
 * @ author vaishnavi
 * @ date 19/11/2020
 * FileReadWriteTest class is for writing test cases for FileReadWriteClass
 */
package com.test;
import static org.junit.jupiter.api.Assertions.*;
import java.io.IOException;
import org.junit.jupiter.api.Test;
import com.src.FileReadWriteClass;
class FileReadWriteTest {

	@Test
	void testReadWriteOperation() throws IOException {
		//testReadWriteOperation method supplies inputs and verifies method readWriteOperation
		String name="done";//expected value
		FileReadWriteClass f=new FileReadWriteClass();//creating instance of class to be tested
		String name1=f.readWriteOperation();
		assertEquals(name, name1);//this function verifies the result passed by tested method
		
		
	}
	
	

	@Test
	void testReadOperation() throws IOException {
		
		String name="done";
		
		FileReadWriteClass f=new FileReadWriteClass();
		String name1=f.readOperation();
		
		assertEquals(name, name1);
		
		
	}
	
	

}
