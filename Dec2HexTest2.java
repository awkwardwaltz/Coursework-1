

import static org.junit.Assert.*;
import static org.junit.jupiter.api.Assertions.assertThrows;

import java.io.IOException;
import java.io.InputStream;

import org.junit.jupiter.api.Assertions;
import org.junit.Test;

public class Dec2HexTest2 extends Dec2Hex {
	
	@Test
	public void testIfThereIsInput() {
		String args[] = {"21"};
		main(args);
		//assertEquals("The program parsed the wrong Integer",Arg1,21);
		assertFalse("The program is not receiving the input",noArgument);
		//assertNotNull("The program is not assigning a value to the hexadecimal variable",hexadecimal);
		

	}

	@Test
	public void testIfThereIsNoInput() {
		String args[] = {};
		main(args);
		//assertEquals("The program parsed the wrong Integer",Arg1,21);
		assertFalse("The program is not receiving the input",noArgument);
		//assertNotNull("The program is not assigning a value to the hexadecimal variable",hexadecimal);
		
	}

	@Test
	public void testIfInputIsNotAnInteger() {
		//String args[] = {"Apple"};
		//main(args);
		//assertThrows(Dec2Hex.class, );
		//assertEquals("The program parsed the wrong Integer",Arg1,21);
		//assertNotNull("The program is not assigning a value to the hexadecimal variable",hexadecimal);
		

		
	}

	@Test
	public void testHashCode() {
		fail("Not yet implemented");
	}

	@Test
	public void testEquals() {
		fail("Not yet implemented");
	}

	@Test
	public void testClone() {
		fail("Not yet implemented");
	}

	@Test
	public void testToString() {
		fail("Not yet implemented");
	}

	@Test
	public void testNotify() {
		fail("Not yet implemented");
	}

	@Test
	public void testNotifyAll() {
		fail("Not yet implemented");
	}

	@Test
	public void testWait() {
		fail("Not yet implemented");
	}

	@Test
	public void testWaitLong() {
		fail("Not yet implemented");
	}

	@Test
	public void testWaitLongInt() {
		fail("Not yet implemented");
	}

	@Test
	public void testFinalize() {
		fail("Not yet implemented");
	}

}

