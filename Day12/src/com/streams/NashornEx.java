//*
/*
 * @author vaishnavi
 * @date 18/11/2020
 * NashornEx class demonstrates how to run and execute js commands from eclipse
 */
package com.streams;
import java.io.FileNotFoundException;
import java.io.FileReader;

import javax.script.*;
public class NashornEx {
     public static void main(String[] args) throws ScriptException, FileNotFoundException {
		ScriptEngine se=new ScriptEngineManager().getEngineByName("Nashorn");//declaring script engine object by giving engine name as Nashorn
		se.eval("print('hello everyone');");//eval method executes specified script
		se.eval(new FileReader("C:\\Users\\DELL\\eclipse-workspace\\Day12\\src\\com\\streams\\some.js"));//eval method executes script commands by reading file some.js
		
	}

}
