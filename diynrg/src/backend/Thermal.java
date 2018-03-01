package backend;
/**
 * concrete class for Thermal Window
 * 
 * @author mike briden
 *
 */
public class Thermal extends Window {
	/**
	 * Cost for Thermal insulation per square foot.
	 */
	private float myItemCost = (float) 17.63;
	
	/**
	 * Insulation energy consumption is 0 for insulation.
	 */
	private int myEnergyConsumption = 0;
	
	/**
	 * Constructor for Thermal Class
	 * @param theQuantity
	 * @param theArea
	 */
	public Thermal( int theQuantity, int theArea) {
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
		return "Thermal";
	}

	/**
	 * Access to the cost of the thermal window coast.
	 * 
	 * @return cost of thermal window per sq foot.
	 */
	public float getThermalcost() {
		return myItemCost;
	}
	
	/**
	 * Access to the Energy Consumption of the window type.
	 * 
	 * @return Energy Consumption of the Thermal window insulation.
	 */
	public float getThermalenergyConsumption() {
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
		return getThermalcost() * getQuantity();
	}

	/**
	 * The total Energy Consumption per hour for a chosen number of 
	 * the thermal window type of items.
	 * 
	 * @return energy consumption * quantity.
	 */
	@Override
	public float getEnergyConsumptionForQuantity() {
		return getThermalenergyConsumption() * getQuantity();
	}

}
