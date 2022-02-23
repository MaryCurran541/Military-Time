package militaryTime;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class JUnitException {

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testMilToampm() {
			
	double mynum = -1;
		
	Exception exception = assertThrows(IllegalArgumentException.class , () ->
	MilitaryTimeConverter.milToampm(mynum)); 
	assertEquals("Argument " + mynum + " is too small."  , exception.getMessage());
		
	
			
	//assertTrue("Number is out of range: " + mynum, min > mynum && mynum < max);
		
	}

	

}
