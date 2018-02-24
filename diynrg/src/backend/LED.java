package backend;

/**
 * The concrete class for the LED type bulbs.
 * 
 * @author Denis Yakovlev
 */
public class LED extends Bulb {
	
	/**
	 * Cost for LED type bulb
	 */
	private float myItemCost = 20;
	
	/**
	 * The concrete class constructor for the LED type bulbs.
	 * 
	 * @param theQuantity
	 */
	public LED(int theQuantity) {
		super(theQuantity, 0);
	}	

	/**
	 * A type of bulb.
	 * 
	 * @return the bulb type name.
	 */
	@Override
	public String name() {
		return "LED";
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
