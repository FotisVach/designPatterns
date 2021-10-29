package fotis.designPatterns.builder;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

/**
 * Test method for Builder Pattern.
 */
public class TestBuilder {

	/**
	 * Test creation with proper values.
	 */
	@Test
	@SuppressWarnings("nls")
	public void test() {
		String a = "required value";
		String b = "theB";
		String c = "theC";
		Product p = new Product.Builder(a).b(b).c(c).build();
		assertEquals(a, p.getaRequired());
		assertEquals(b, p.getB());
		assertEquals(c, p.getC());
	}

	/**
	 * Test thrown exception for bad initialization.
	 */
	@Test
	public void test_bad_init() {
		assertThrows(IllegalArgumentException.class, () -> new Product.Builder(null).build());
	}

}
