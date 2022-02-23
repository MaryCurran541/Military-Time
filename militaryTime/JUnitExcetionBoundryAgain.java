package militaryTime;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class JUnitExcetionBoundryAgain {

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testMilToampm() {
		
		double mynum = 24;
		
		Exception exception = assertThrows(IllegalArgumentException.class , () ->
		MilitaryTimeConverter.milToampm(mynum)); 
		assertEquals("Argument " + mynum + " is too big."  , exception.getMessage()); //message has to be identical to IllegalArgumentException in the milToampm method or the test will fail
		
	}

}
