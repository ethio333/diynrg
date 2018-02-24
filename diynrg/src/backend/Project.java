package backend;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * Blueprint to create projects.
 * 
 * @author Denis Yakovlev
 */
public class Project {

	/**
	 * The project name.
	 */
	private String myProjectName;
	
	/**
	 * The project creation date.
	 */
	private Date myProjectDate = new Date();
	
	/**
	 * A list to store items.
	 */
	private List<AbstractItem> myItems = new ArrayList<AbstractItem>();;

	/**
	 * The class constructor
	 * 
	 * @param theName - a name's chosen for the current project by a user
	 */
	public Project(String theName) {
		myProjectName = theName;
	}

	/**
	 * A method to add items in the current project
	 * 
	 * @param theItem - an item's chosen ti replace
	 */
	public void addItem(AbstractItem theItem) {
		myItems.add(theItem);
	}

	/**
	 * The current project name.
	 * 
	 * @return a project name
	 */
	public String getProjectName() {
		return myProjectName;
	}

	/**
	 * Project creation date.
	 * 
	 * @return a project creation date
	 */
	public Date getDate() {
		return myProjectDate;
	}

	/**
	 * Method calculates a cost for items to replace in the current 
	 * project 
	 * 
	 * @return total cost all item in the project
	 */
	public float getTotalCost() {
		float totalCost = 0.0f;

		for (AbstractItem item : myItems) {
			totalCost += item.getPriceForQuantity();
		}
		
		return totalCost;
	}
	
	/**
	 * NEED a formula (Implemented User Story #2)
	 * 
	 * @return saved per year for a given DIYproject
	 */
	public double savingPerYearForGivenDIYproject() {
		return 0.0;
	}
	
	/**
	 * NEED a formula (Implemented User Story #3)
	 * 
	 * @return estimated time for how long it will cost to “break even”
	 */
	public int estimationBreakEvenTime() {
		return 0;
	}		

	/**
	 * A method to test in text mode
	 */
	public void showItems() {
		for (AbstractItem item : myItems) {
			System.out.print("Item : " + item.name());
			System.out.print(", Quantity : " + item.getQuantity());
			System.out.print(", Area : " + item.getArea());
			System.out.println(", Price for Item set : " 
										+ item.getPriceForQuantity());
		}
	}
}
