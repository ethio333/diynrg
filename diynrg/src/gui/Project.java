package gui;


import java.util.ArrayList;
import java.util.Observable;


/**
 * Project represents different DIY's i.e. changing bulbs, insulations
 * @author Kevin
 *
 */
public class Project extends Observable {
	private String myName; 
	private String myDescription;
	private ArrayList<Item> myItems;
	
	
	public Project(String theName, String theDescription) {
		myName = theName;
		myDescription = theDescription;
	}
	
	public String getName() {
		return myName;
	}
	
	public String getDescription() {
		return myDescription;
	}
	
	public void addItem(Item theItem) {
		myItems.add(theItem);
	}

}
