package fotis.designPatterns.flyweight;

import static org.junit.Assert.assertTrue;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

import org.junit.jupiter.api.Test;

/**
 * Test for Flyweight Pattern.
 */
class TestFlyweight {

	/**
	 * This way we simulate the clients code.
	 */
	@Test
	void test() {
		List<ItemType> types = Arrays.asList(ItemType.LAPTOP, ItemType.SMARTPHONE, ItemType.TV);
		Catalog catalog = new Catalog();
		for (int i = 0; i < 1000; i++) {
			catalog.lookup(types.get(ThreadLocalRandom.current().nextInt(0, 3)));
			assertTrue(catalog.getCatalogSize() <= 3);
		}
	}

}
