/**
 * 
 */
package tests;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import backend.CFL;

/**
 * @author Kevin Nguyen
 * This test class does not test getters/setters.
 */
public class CFLTest {

	private CFL myCFL;
	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
		myCFL = new CFL(100); // Creates a new CFL object with 100 as quantity
	}

	/**
	 * Test method for {@link backend.CFL#CFL(int)}.
	 */
	@Test (expected = IllegalArgumentException.class) 
	public final void testCFL() {
		new CFL(-1);
	}

	/**
	 * Test method for {@link backend.CFL#name()}.
	 */
	@Test
	public final void testName() {
		String supposedName = "CFL";
		assertEquals(supposedName, myCFL.name());
	}

	/**
	 * Test method for {@link backend.CFL#getPriceForQuantity()}.
	 */
	@Test
	public final void testGetPriceForQuantity() {
		int quantity = myCFL.getQuantity();
		float cost = myCFL.getCFLcost();
		int pricePerQuantity = (int) (quantity * cost);
		
		assertTrue(pricePerQuantity == myCFL.getPriceForQuantity());
		assertFalse(myCFL.getPriceForQuantity() == -9);
	}

	/**
	 * Test method for {@link backend.CFL#getEnergyConsumptionForQuantity()}.
	 */
	@Test
	public final void testGetEnergyConsumptionForQuantity() {
		fail("Not yet implemented");
	}

}
