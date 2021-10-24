package fotis.designPatterns.builder;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

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
	@Test(expected = IllegalArgumentException.class)
	public void test_bad_init() {
		new Product.Builder(null).build();
	}

}
