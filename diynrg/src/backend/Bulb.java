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
	protected int myQuantity = 0;
	
	/**
	 * Default area. 
	 */
	protected int myArea = 0;
	
	/**
	 * An Bulb abstract class constructor.
	 * 
	 * @param theQuantity - a number of bulbs to replace
	 * @param theArea - an area for window/insulation replacement
	 */
	public Bulb(int theQuantity, int theArea) {
		super();
		
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
}
