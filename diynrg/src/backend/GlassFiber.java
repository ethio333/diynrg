package backend;

/**
 * The concrete class for the glass fiber type insulation.
 * 
 * @author mike briden
 */

public class GlassFiber extends Insulation {
	/**
	 * Cost for Glassfiber insulation per square foot.
	 */
	private float myItemCost = (float) 2.09;
	
	/**
	 * Insulation energy consumption is 0.
	 */
	private int myEnergyConsumption = 0;
	
	/**
	 * 
	 * @param theArea
	 */
	public GlassFiber(int theQuantity, int theArea) {
		super(theQuantity, theArea);
	}
	
	/**
	 * A type of insulation.
	 * 
	 * @return the insulation type name.
	 */
	@Override
	public String name() {
		return "Glassfiber";
	}

	/**
	 * Access to the cost of the glass fiber insulation.
	 * 
	 * @return cost of glass fiber insulation.
	 */
	public float getGlassFibercost() {
		return myItemCost;
	}

	/**
	 * Access to the Energy Consumption of the Insulation type.
	 * 
	 * @return Energy Consumption of the glass fiber insulation.
	 */
	public float getGlassFiberEnergyConsumption() {
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
		return getGlassFibercost() * getQuantity();
	}

	/**
	 * The total Energy Consumption per hour for a chosen number of 
	 * the glass fiber type of items.
	 * 
	 * @return energy consumption * quantity.
	 */
	@Override
	public float getEnergyConsumptionForQuantity() {
		return getGlassFiberEnergyConsumption();
	}
}
