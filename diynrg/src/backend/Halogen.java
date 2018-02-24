package backend;

/**
 * The concrete class for the Halogen type bulbs.
 * 
 * @author Denis Yakovlev
 */
public class Halogen extends Bulb {
	
	/**
	 * Cost for Halogen type bulb
	 */
	private float myItemCost = 20;
	
	/**
	 * Energy consumption by this types of bulbs watts / hour.
	 */
	private int myEnergyConsumption = 15;
	
	/**
	 * The concrete class constructor for the Halogen type bulbs.
	 * 
	 * @param theQuantity - total number chosen items.
	 */
	public Halogen(int theQuantity) {
		super(theQuantity, 0);
	}

	/**
	 * A type of bulb.
	 * 
	 * @return the bulb type name.
	 */
	@Override
	public String name() {
		return "Halogen";
	}
	
	/**
	 * Access to the cost to the Halogen bulb.
	 * 
	 * @return cost of Halogen bulb.
	 */
	public float getHalogenCost() {
		return myItemCost;
	}
	
	/**
	 * Access to the Energy Consumption of the Halogen bulb.
	 * 
	 * @return Energy Consumption of the Halogen bulb.
	 */
	public float getHalogenEnergyConsumption() {
		return myEnergyConsumption;
	}
	
	/**
	 * The total price for a chosen number of 
	 * the Halogen type of items.
	 * 
	 * @return cost * quantity.
	 */
	@Override
	public float getPriceForQuantity() {
		return getHalogenCost() * getQuantity();
	}
	
	/**
	 * The total Energy Consumption per hour for a chosen number of 
	 * the Halogen type of items.
	 * 
	 * @return energy consumption * quantity.
	 */
	@Override
	public float getEnergyConsumptionForQuantity() {
		return getHalogenEnergyConsumption() * getQuantity();
	}
}
