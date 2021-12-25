package fotis.designPatterns.template;

import static org.junit.Assert.assertTrue;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

/**
 * Test class for Template Pattern
 */
@SuppressWarnings({ "nls", "javadoc" })
class TestTemplate {

	static ByteArrayOutputStream baos;

	static PrintStream old;

	@BeforeAll
	static void setup() {
		// Create a stream to hold the output
		baos = new ByteArrayOutputStream();
		PrintStream ps = new PrintStream(baos);
		// IMPORTANT: Save the old System.out!
		old = System.out;
		// Tell Java to use your special stream
		System.setOut(ps);
	}

	/**
	 * Test
	 */
	@Test
	void test() {
		OrderTemplate order = new WebOrder();
		order.processOrder();

		String testString = baos.toString();
		assertTrue(testString.contains("Checking out"));
		assertTrue(testString.contains("Paying from web"));
		assertTrue(testString.contains("Email Receipt"));
		assertTrue(testString.contains("Shipping to destination"));

		baos.reset();
		order = new StoreOrder();
		order.processOrder();

		testString = baos.toString();
		assertTrue(testString.contains("Checking out"));
		assertTrue(testString.contains("Paying on site"));
		assertTrue(testString.contains("Give Receipt"));
		assertTrue(testString.contains("Bag items at counter"));
	}

	@AfterAll
	static void after() {
		System.setOut(old);
	}

}
