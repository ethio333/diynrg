/**
 * 
 */
package tests;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import backend.Glazed;



/**
 * @author Kevin Nguyen
 * Tests methods with complex computation, and rounding. 
 */
public class GlazedTest {
	
	private Glazed myG;
	private Glazed notMyG; 

	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
		myG = new Glazed(100, 100);
		notMyG = new Glazed(10, 10);
	}

	/**
	 * Test method for {@link backend.Glazed#Glazed(int, int)}.
	 */
	@Test (expected = IllegalArgumentException.class)
	public final void testGlazed() {
		new Glazed(-1, 0);
		new Glazed(0, -1);
	}

	/**
	 * Test method for {@link backend.Glazed#getGlazedenergyConsumption()}.
	 */
	@Test
	public final void testGetGlazedenergyConsumption() {
		assertFalse(myG.getGlazedenergyConsumption() == notMyG.getGlazedenergyConsumption());
	}

	/**
	 * Test method for {@link backend.Glazed#getWorstedEnergyConsumption()}.
	 */
	@Test
	public final void testGetWorstedEnergyConsumption() {
		double diff = 419.05994 - myG.getWorstedEnergyConsumption();
		assertTrue(diff < 1);
	}



}
