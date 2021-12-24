package fotis.designPatterns.state;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

/**
 * Test class for State Pattern.
 */
@SuppressWarnings("javadoc")
class TestState {

	@Test
	void test() {
		Order order = new Order();
		assertEquals(0, order.cancel());

		order.paymentSuccessful();
		assertEquals(10, order.cancel());

		order.dispatched();
		assertEquals(20, order.cancel());

		order.delivered();
		assertEquals(30, order.cancel());
	}

}
