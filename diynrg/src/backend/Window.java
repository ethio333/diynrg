package backend;
/**
 * An abstract class for the Insulation type items.
 * data collected from https://www.energyguide.com/info/window2.asp
 * @author mike briden
 */
public abstract class Window implements AbstractItem {

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
	 * Energy consumption/loss for single pain windo1
	 */
	private final float SINGLER = (float) 0.9;
	
	/**
	 * An Window abstract class constructor.
	 * 
	 * @param theQuantity - a number of bulbs to replace
	 * @param theArea - an area for window/insulation replacement
	 * @throws illegal argument exception if paramters are negative
	 */
	public Window(int theQuantity, int theArea) {
		super();
		if (theQuantity < 0 || theArea < 0) { // Kevin Nguyen
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
	 * show worst R value
	 * 
	 * @return the R value used as the standard for our insulation
	 */
	public float worstRValue() {
		return SINGLER; 
	}

}
