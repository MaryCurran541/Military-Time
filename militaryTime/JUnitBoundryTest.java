package militaryTime;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class JUnitBoundryTest {

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testMilToampm() {
		double expectedValue = 11;
		double actualValue = MilitaryTimeConverter.milToampm(23);
		Assert.assertEquals( expectedValue , actualValue , 0.000000000000000001 ); // if the 0.00000001 isn't added the assertEquals is labeled deprecated
		
	}

}
