package fotis.designPatterns.iterator;

/**
 * 
 */
@SuppressWarnings("javadoc")
class Vehicle {

	private VehicleType vehicleType;

	private String name;

	/**
	 * Creates a new Vehicle object.
	 *
	 * @param vehicleType
	 * @param name
	 */
	Vehicle(VehicleType vehicleType, String name) {
		this.vehicleType = vehicleType;
		this.name = name;
	}

	@Override
	public String toString() {
		return name;
	}

	/**
	 * Gets the vehicleType.
	 *
	 * @return Returns the vehicleType
	 */
	VehicleType getVehicleType() {
		return vehicleType;
	}

	/**
	 * Assigns a new value to the vehicleType.
	 *
	 * @param vehicleType
	 *            the vehicleType to set
	 */
	void setVehicleType(VehicleType vehicleType) {
		this.vehicleType = vehicleType;
	}

}
