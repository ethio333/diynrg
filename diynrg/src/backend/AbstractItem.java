package backend;

/**
 * Item interface representing material items ,
 * such as bulbs, windows and insulation
 * 
 * @author Denid Yakovlev
 */
public interface AbstractItem {

	/**
	 * A type of bulb.
	 * 
	 * @return the bulb type name.
	 */
	public String name();

	/**
	 * The total price for a chosen number of items (cost * quantity).
	 * 
	 * @return price one type items.
	 */
	public float getPriceForQuantity();
	
	/**
	 * A chosen number of an item to replace.
	 * 
	 * @param theQuantity - total number chosen items.
	 */
	public void setQuantity(int theQuantity);
	
	/**
	 * Chosen area to replace.
	 * 
	 * @param theArea - total replacement area.
	 */
	public void setArea(int theArea);
	
	/**
	 * Show a chosen number of an item to replace.
	 * 
	 * @return the total number chosen items.
	 */
	public int getQuantity();
	
	/**
	 * Show chosen area to replace.
	 * 
	 * @return the total replacement area.
	 */
	public int getArea();
	
}
