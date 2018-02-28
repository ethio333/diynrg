package backend;
/**
 * An abstract class for the Insulation type items.
 * 
 * @author mike briden
 */
public abstract class Insulation implements AbstractItem {
	private int myQuantity = 0; // quantity of items
	private int myArea = 0; // area of room
	
	/**
	 * An Insulation abstract class constructor.
	 * 
	 * @param theQuantity - a number of rooms to insulate
	 * @param theArea - an area for window/insulation replacement
	 */
	public Insulation(int theQuantity, int theArea){
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
