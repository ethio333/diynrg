package backend;

/**
 * The concrete class for the CFL type bulbs.
 * 
 * @author Denis Yakovlev
 */
public class CFL extends Bulb {
	
	/**
	 * Cost for CFL type bulb
	 */
	private float myItemCost = 2;
	
	/**
	 * The concrete class constructor for the CFL type bulbs.
	 * 
	 * @param theQuantity
	 */
	public CFL(int theQuantity) {
		super(theQuantity, 0);
	}

	/**
	 * A type of bulb.
	 * 
	 * @return the bulb type name.
	 */
	@Override
	public String name() {
		return "CFL";
	}
	
	/**
	 * The total price for a chosen number of items (cost * quantity).
	 * 
	 * @return price one type items.
	 */
	@Override
	public float getPriceForQuantity() {
		return myItemCost * myQuantity;
	}
}
