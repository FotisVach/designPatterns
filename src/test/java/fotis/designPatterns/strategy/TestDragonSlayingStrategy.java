package fotis.designPatterns.strategy;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.function.Supplier;

import org.junit.jupiter.api.Test;

/**
 * Test class for {@link DragonSlayingStrategy}
 */
@SuppressWarnings("nls")
class TestDragonSlayingStrategy {

	/**
	 * Test method for {@link MeleeStrategy}
	 */
	@Test
	void test_MeleeStrategy() {
		test_strategy("You cut the dragon's head with your lightsaber", MeleeStrategy::new);
	}

	/**
	 * Test method for {@link ProjectileStrategy}
	 */
	@Test
	void test_ProjectileStrategy() {
		test_strategy("You kill the dragon by shooting him in the eyes", ProjectileStrategy::new);
	}

	/**
	 * Test method for {@link SpellStrategy}
	 */
	@Test
	void test_SpellStrategy() {
		test_strategy("You kill the dragon by using Avada Kedavra", SpellStrategy::new);
	}

	/**
	 * Test algorithms (sort of)
	 * 
	 * @param msg
	 * @param constructor
	 */
	void test_strategy(String msg, Supplier<DragonSlayingStrategy> constructor) {
		DragonSlayingStrategy strategy = constructor.get();
		assertEquals(msg, strategy.execute());
	}

}
