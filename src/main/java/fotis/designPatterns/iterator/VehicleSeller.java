package fotis.designPatterns.iterator;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/**
 * The collection class.
 */
@SuppressWarnings({ "nls", "javadoc" })
class VehicleSeller {

	private List<Vehicle> vehicles;

	/**
	 * Constructor.
	 */
	public VehicleSeller() {
		vehicles = Arrays.asList(
				new Vehicle(VehicleType.CAR, "Car 1"),
				new Vehicle(VehicleType.MOTORBIKE, "Motorbike 1"),
				new Vehicle(VehicleType.CAR, "Car 2"),
				new Vehicle(VehicleType.CAR, "Car 3"),
				new Vehicle(VehicleType.TRAIN, "Train 1"),
				new Vehicle(VehicleType.CAR, "Car 4"),
				new Vehicle(VehicleType.CAR, "Car 5"),
				new Vehicle(VehicleType.MOTORBIKE, "Motorbike 1"),
				new Vehicle(VehicleType.TRAIN, "Train 1"),
				new Vehicle(VehicleType.TRAIN, "Train 2"));
	}

	void addVehicles(Vehicle v) {
		vehicles.add(v);
	}

	public Iterator<Vehicle> iterator(VehicleType vehicleType) {
		return new VehicleSellerIterator(this, vehicleType);
	}

	List<Vehicle> getVehicles() {
		return new ArrayList<>(vehicles);
	}

}
