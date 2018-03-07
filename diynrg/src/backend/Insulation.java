package backend;
/**
 * An abstract class for the Insulation type items.
 * 
 * @author mike briden
 */
public abstract class Insulation implements AbstractItem {
	private int myQuantity = 0; // quantity of items
	private int myArea = 0; // area of room
	private final float daydegheat = (float) 4697.0; // annual average heating days for seattle/tacoma
	/**
	 * @author mike briden 3/2/2018
	 * Energy consumption for R-13 insulation
	 */
	private final float r13Insulation = (float) 13.0;
	
	/**
	 * An Insulation abstract class constructor.
	 * 
	 * @param theQuantity - a number of rooms to insulate
	 * @param theArea - an area for window/insulation replacement
	 */
	public Insulation(int theQuantity, int theArea){
		super();
		if (theQuantity < 0 || theArea < 0) { // Kevin Nguyen
			throw new IllegalArgumentException("Negative inputs don't make sense?"); 
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
	 * show the DDH value for seattle/tacoma
	 * 
	 * @return DDH annual average
	 */
	public float heatDays(){
		return daydegheat;
	}
	
	/**
	 * show worst R value
	 * 
	 * @return the R value used as the standard for our insulation
	 */
	public float worstRValue() {
		return r13Insulation; 
	}

}
