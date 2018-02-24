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
	private float myItemCost = 13;
	
	/**
	 * Energy consumption by this types of bulbs watts / hour.
	 */
	private int myEnergyConsumption = 4;
	
	/**
	 * The concrete class constructor for the LED type bulbs.
	 * 
	 * @param theQuantity - total number chosen items.
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
	 * Access to the cost of the LED bulb.
	 * 
	 * @return cost of LED bulb.
	 */
	public float getLEDcost() {
		return myItemCost;
	}
	
	/**
	 * Access to the Energy Consumption of the LED bulb.
	 * 
	 * @return Energy Consumption of the LED bulb.
	 */
	public float getLEDenergyConsumption() {
		return myEnergyConsumption;
	}
	
	/**
	 * The total price for a chosen number of 
	 * the LED type of items.
	 * 
	 * @return cost * quantity.
	 */
	@Override
	public float getPriceForQuantity() {
		return getLEDcost() * getQuantity();
	}
	
	/**
	 * The total Energy Consumption per hour for a chosen number of 
	 * the LED type of items.
	 * 
	 * @return energy consumption * quantity.
	 */
	@Override
	public float getEnergyConsumptionForQuantity() {
		return getLEDenergyConsumption() * getQuantity();
	}
}
