package backend;

/**
 * The concrete class for the glass fiber type insulation.
 * 
 * @author mike briden
 */

public class SprayFoam extends Insulation {

	/**
	 * Cost for SprayFoam insulation per square foot.
	 */
	private float myItemCost = (float) 1.22;
	
	/**
	 * Insulation energy consumption is 0 for insulation.
	 */
	private int myEnergyConsumption = 0;
	
	public SprayFoam(int theQuantity, int theArea) {
		super(theQuantity, theArea);
	}
	
	/**
	 * A type of insulation.
	 * 
	 * @return the insulation type name.
	 */
	@Override
	public String name() {
		return "Spray Foam";
	}

	/**
	 * Access to the cost of the mineral wool insulation.
	 * 
	 * @return cost of SprayFoam insulation.
	 */
	public float getSprayFoamcost() {
		return myItemCost;
	}

	/**
	 * Access to the Energy Consumption of the Insulation type.
	 * 
	 * @return Energy Consumption of the Mineral wool insulation.
	 */
	public float getSprayFoamEnergyConsumption() {
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
		return getSprayFoamcost() * getQuantity();
	}

	/**
	 * The total Energy Consumption per hour for a chosen number of 
	 * the mineral wool type of items.
	 * 
	 * @return energy consumption * quantity.
	 */
	@Override
	public float getEnergyConsumptionForQuantity() {
		return getSprayFoamEnergyConsumption();
	}

}
