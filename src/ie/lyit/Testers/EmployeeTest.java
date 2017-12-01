package ie.lyit.Testers;

import static org.junit.Assert.*;
 import ie.lyit.Hotel.*;
import org.junit.Before;
import org.junit.Test;

public class EmployeeTest {

	private Employee e1;
	
	@Before
	public void setUp() throws Exception {
		e1 = new Employee("Mr","Homer","Simpson","Glenties", "0871234567", 20,12,1992, new Date(1,1,2009), 50000);
	}

	@Test
	public void testGetDateProbationEnds() {
		assertEquals(e1.getDateProbationEnds(30), new Date(31,1,2009));
		assertEquals(e1.getDateProbationEnds(50), new Date(20,2,2009));
	}

}
