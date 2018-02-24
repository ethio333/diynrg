package backend;

/**
 * The concrete class for the Halogen type bulbs.
 * 
 * @author Denis Yakovlev
 */
public class Halogen extends Bulb {
	
	/**
	 * Cost for Halogen type bulb
	 */
	private float myItemCost = 13;
	
	/**
	 * The concrete class constructor for the Halogen type bulbs.
	 * 
	 * @param theQuantity
	 */
	public Halogen(int theQuantity) {
		super(theQuantity, 0);
	}

	/**
	 * A type of bulb.
	 * 
	 * @return the bulb type name.
	 */
	@Override
	public String name() {
		return "Halogen";
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
