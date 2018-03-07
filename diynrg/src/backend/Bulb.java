package backend;

/**
 * An abstract class for the Bulb type items.
 * 
 * @author Denis Yakovlev
 */
public abstract class Bulb implements AbstractItem {

	/**
	 * Default quantity.
	 */
	private int myQuantity = 0;
	
	/**
	 * Default area. 
	 */
	private int myArea = 0;
	
	/**
	 * @author mike briden 3/2/2018
	 * Energy consumption for a incandescent bulb worst energy consumption
	 */
	private final int incandescent = 60;
	
	/**
	 * An Bulb abstract class constructor.
	 * 
	 * @param theQuantity - a number of bulbs to replace
	 * @param theArea - an area for window/insulation replacement
	 */
	public Bulb(int theQuantity, int theArea) {
		super();
		if (theQuantity < 0 || theArea < 0) { /* Kevin Nguyen */ 
			throw new IllegalArgumentException(); 
		}
		myQuantity = theQuantity;
		myArea = theArea;
	}
		
	/**
	 * A chosen number of an item to replace.
	 * 
	 * @param theQuantity - total number chosen items.
	 */
	@Override
	public void setQuantity(int theQuantity) {
		myQuantity = theQuantity;
	}
	
	/**
	 * Chosen area to replace.
	 * 
	 * @param theArea - total replacement area.
	 */
	@Override
	public void setArea(int theArea) {
		myArea = theArea;
	}
	
	/**
	 * Show a chosen number of an item to replace.
	 * 
	 * @return the total number chosen items.
	 */
	@Override
	public int getQuantity() {
		return myQuantity;
	}

	/**
	 * Show chosen area to replace.
	 * 
	 * @return the total replacement area.
	 */
	@Override
	public int getArea() {
		return myArea;
	}
	
	/**
	 * @author mike briden 3/2/2018
	 * Get worst energy consumption for bulb types
	 */
	public int worstEnergy() {
		return incandescent;
	}
}
