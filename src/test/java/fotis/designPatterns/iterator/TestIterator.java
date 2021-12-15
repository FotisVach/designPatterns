package fotis.designPatterns.iterator;

import static org.junit.Assert.*;
import static org.junit.jupiter.api.Assertions.fail;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

import org.junit.jupiter.api.Test;

/**
 * Test for Iterator Pattern.
 */
@SuppressWarnings({ "nls", "javadoc" })
class TestIterator {

	@Test
	public void test() {
		List<Vehicle> vehicles = Arrays.asList(new Vehicle(VehicleType.CAR, "Car 1"),
				new Vehicle(VehicleType.MOTORBIKE, "Motorbike 1"),
				new Vehicle(VehicleType.CAR, "Car 2"),
				new Vehicle(VehicleType.CAR, "Car 3"),
				new Vehicle(VehicleType.TRAIN, "Train 1"),
				new Vehicle(VehicleType.CAR, "Car 4"),
				new Vehicle(VehicleType.CAR, "Car 5"),
				new Vehicle(VehicleType.MOTORBIKE, "Motorbike 1"),
				new Vehicle(VehicleType.TRAIN, "Train 1"),
				new Vehicle(VehicleType.TRAIN, "Train 2"));

		for (Vehicle vehicle : vehicles) {
			testIterator(vehicle);
		}
	}
	
	@Test
	public void test_Remove() {
		VehicleSeller vs = new VehicleSeller();
		Iterator<Vehicle> iter = vs.iterator(VehicleType.CAR);
		assertThrows(UnsupportedOperationException.class, () -> iter.remove());
	}

	public void testGetVehicles(Vehicle expectedItem) {
		final VehicleSeller vs = new VehicleSeller();
		List<Vehicle> vehicles = vs.getVehicles();
		assertNotNull(vehicles);

		for (Vehicle item : vehicles) {
			assertNotNull(item);
			assertNotNull(item.getVehicleType());
			assertNotNull(item.toString());

			boolean sameType = expectedItem.getVehicleType() == item.getVehicleType();
			boolean sameName = expectedItem.toString().equals(item.toString());
			if (sameType && sameName) {
				return;
			}
		}

		fail("Expected to find item [" + expectedItem + "] in the item list, but we didn't.");

	}

	/**
	 * Test if the expected item can be retrieved from the chest using the
	 * {@link TreasureChestItemIterator}
	 */
	public void testIterator(Vehicle expectedItem) {
		final VehicleSeller vs = new VehicleSeller();
		Iterator<Vehicle> iterator = vs.iterator(expectedItem.getVehicleType());
		assertNotNull(iterator);

		while (iterator.hasNext()) {
			final Vehicle vehicle = iterator.next();
			assertNotNull(vehicle);
			assertEquals(expectedItem.getVehicleType(), vehicle.getVehicleType());

			String name = vehicle.toString();
			assertNotNull(name);
			if (expectedItem.toString().equals(name)) {
				return;
			}
		}

		fail("Expected to find item [" + expectedItem + "] using iterator, but we didn't.");

	}
}
