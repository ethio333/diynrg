package gui;

import java.util.Observable;
/**
 * Item represents something to replace i.e. LED Bulbs, Incadescent. 
 * @author Kevin
 *
 */
public class Item extends Observable {
	private String myName;
	private double myPrice;
	private int myUnits;
	private String myDescription;
	
	public Item(String theName, double thePrice, 
				int theUnits, String theDescription) {
		setName(theName);
		setPrice(thePrice);
		setUnits(theUnits);
		setDescription(theDescription);
	}
	
	public void setName(String theName) {
		myName = theName;
	}
	
	public void setPrice(double thePrice) {
		myPrice = thePrice; 
	}
	
	public void setUnits(int theUnits) {
		myUnits = theUnits;
	}
	
	public void setDescription(String theDescription) {
		myDescription = theDescription;
	}
	
	public String getName() {
		return myName;
	}
	
	public double getPrice() {
		return myPrice; 
	}
	
	public int getUnits() {
		return myUnits;
	}
	
	public String getDescription() {
		return myDescription;
	}
	
	public double getTotal() {
		return getPrice()*getUnits();
	}
}
