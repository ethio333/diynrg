package backend;
/**
 * concrete class for Glazed Window
 * 
 * @author mike briden
 *
 */
public class Glazed extends Window {
	/**
	 * Cost for Thermal insulation per square foot.
	 */
	private float myItemCost = (float) 24.15;
	
	/**
	 * Insulation energy consumption is 0 for insulation.
	 */
	private int myEnergyConsumption = 0;
	
	/**
	 * Constructor for Thermal Class
	 * @param theQuantity
	 * @param theArea
	 */
	public Glazed( int theQuantity, int theArea) {
		super(theQuantity, theArea);
	}
	
	/**
	 * A type of window.
	 * 
	 * @return the window type name.
	 */
	@Override
	public String name() {
		// TODO Auto-generated method stub
		return "Glazed";
	}

	/**
	 * Access to the cost of the Glazed window cost.
	 * 
	 * @return cost of Glazed window per sq foot.
	 */
	public float getGlazedcost() {
		return myItemCost;
	}
	
	/**
	 * Access to the Energy Consumption of the window type.
	 * 
	 * @return Energy Consumption of the Thermal window insulation.
	 */
	public float getGlazedenergyConsumption() {
		return myEnergyConsumption;
	}
	
	/**
	 * The total price for a chosen number of 
	 * rooms for a given Area type of items.
	 * quantity is set to one.
	 * @return cost * quantity.
	 */
	@Override
	public float getPriceForQuantity() {
		return getGlazedcost() * getQuantity();
	}

	/**
	 * The total Energy Consumption per hour for a chosen number of 
	 * the thermal window type of items.
	 * 
	 * @return energy consumption * quantity.
	 */
	@Override
	public float getEnergyConsumptionForQuantity() {
		return getGlazedenergyConsumption() * getQuantity();
	}

}
