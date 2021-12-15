package fotis.designPatterns.iterator;

import java.util.Iterator;
import java.util.List;

/**
 * Concrete iterator
 * 
 * TODO: Maybe Transfer this in {@link VehicleSeller} as an inner Class?
 */
@SuppressWarnings("javadoc")
class VehicleSellerIterator implements Iterator<Vehicle> {

	private final VehicleSeller vs;

	private int index;

	private final VehicleType type;

	/**
	 * Creates a new VehicleSellerIterator object.
	 *
	 * @param vs
	 * @param type
	 */
	VehicleSellerIterator(VehicleSeller vs, VehicleType type) {
		this.vs = vs;
		this.index = -1;
		this.type = type;
	}

	@Override
	public boolean hasNext() {
		return findNextIdx() != -1;
	}

	@Override
	public Vehicle next() {
		index = findNextIdx();
		if (index != -1) {
			return vs.getVehicles().get(index);
		}
		return null;
	}

	private int findNextIdx() {
		List<Vehicle> vehicles = vs.getVehicles();
		int tempIdx = index;
		while (true) {
			tempIdx++;
			if (tempIdx >= vehicles.size()) {
				tempIdx = -1;
				break;
			}
			if (vehicles.get(tempIdx).getVehicleType().equals(type)) {
				break;
			}
		}
		return tempIdx;
	}

}
