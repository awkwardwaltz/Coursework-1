package com.devops.com.devops.maven.eclipse;

import static org.junit.Assert.*;
import static org.junit.jupiter.api.Assertions.assertThrows;

import java.io.IOException;
import java.io.InputStream;

import org.junit.jupiter.api.Assertions;
import org.junit.Test;

public class Dec2HexTest2 extends Dec2Hex {
	
	@Test
	public void testIfThereIsInput() {
		System.out.println("Standard Input Test:");
		//Print the test type
		String args[] = {"21"};
		//Emulates the command line argument entry
		main(args);
		//invokes the method with the above value
		assertFalse("The program is not receiving the input",noArgument);
		//Tests if there is no command line argument
		assertEquals("The program parsed the wrong Integer",Arg1,21);
		//Tests to see if the command line argument is the same as the value that is being converted
		assertEquals("The program output the wrong hexadecimal value",hexadecimal,"15");
		//Tests to see if the Hexadecimal output is correct for the chosen input
		

	}

	@Test
	public void testIfThereIsNoInput() {
		System.out.println("No Input Test:");
		//Print the test type		
		String args[] = {};
		//Emulates the command line argument entry
		main(args);
		//invokes the method with the above value
		
		assertTrue("The program is not receiving the input",noArgument);
		//tests to ensure that the noArgument boolean is correctly set to True as expected
		assertNull("The program is incorrectly assigning a value to the hexadecimal variable",hexadecimal);
		//Tests to ensure that there is no value for the hexadecimal variable as expected
		assertNotNull("The program is assigning a value to the Arg1 variable",Arg1);
		// tests to ensure that there is no value for the Arg1 variable as expected
	}

	@Test
	public void testIfInputIsNotAnInteger() {
		Arg1 = 0;
		hexadecimal = null;
		//resets values
		System.out.println("Wrong Input Type Test:");
		//Print the test type
		String args[] = {"Apple"};
		//Emulates the command line argument entry
		main(args);
		//invokes the method with the above value
		
	}

	

}
