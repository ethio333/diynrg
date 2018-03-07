/**
 * 
 */
package tests;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import backend.Halogen;

/**
 * @author Kevin Nguyen
 * Tests the calculations of Halogen Class
 *
 */
public class HalogenTest {
	
	private Halogen myHalogen;
	
	private Halogen theOther;

	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
		myHalogen = new Halogen(10);
		
		theOther = new Halogen(11);
	}


	/**
	 * Test method for {@link backend.Halogen#getPriceForQuantity()}.
	 */
	@Test
	public final void testGetPriceForQuantity() {
		
		float cost = myHalogen.getHalogenCost();
		int quantity = myHalogen.getQuantity();
		assertTrue(cost * quantity == myHalogen.getPriceForQuantity());
		
		assertFalse(myHalogen.getPriceForQuantity() == theOther.getPriceForQuantity());
	}

	/**
	 * Test method for {@link backend.Halogen#getEnergyConsumptionForQuantity()}.
	 */
	@Test
	public final void testGetEnergyConsumptionForQuantity() {
		float myEnergyConsumption = myHalogen.getEnergyConsumptionForQuantity();
		float otherEnergyConsumption = theOther.getEnergyConsumptionForQuantity();
		
		assertFalse(myEnergyConsumption == otherEnergyConsumption);
	}

	/**
	 * Test method for {@link backend.Halogen#getBaseEnergyConsumptionForQuantity()}.
	 */
	@Test
	public final void testGetBaseEnergyConsumptionForQuantity() {
		float aBaseConsump = myHalogen.getBaseEnergyConsumptionForQuantity();
		float bBaseConsump = theOther.getBaseEnergyConsumptionForQuantity();
		
		assertFalse(aBaseConsump == bBaseConsump);
	}

}
