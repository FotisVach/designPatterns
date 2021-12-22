package fotis.designPatterns.observer;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

/**
 * Test class for Observer Pattern.
 */
@SuppressWarnings({ "nls", "javadoc" })
class TestObserver {

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

	@Test
	void test() {
		Subject subject = new MessageStream();

		PhoneClient phoneClient = new PhoneClient(subject);
		TabletClient tabletClient = new TabletClient(subject);

		phoneClient.addMessage("Here is a new message");
		String testString = baos.toString();
		assertEquals("Phone Stream: Here is a new message - sent from phone\n"
				+ "Tablet Stream: Here is a new message - sent from phone\n", testString);
		baos.reset();

		tabletClient.addMessage("Here is another message");
		testString = baos.toString();
		assertEquals("Phone Stream: Here is another message - sent from tablet\n"
				+ "Tablet Stream: Here is another message - sent from tablet\n", testString);
	}

	@AfterAll
	static void after() {
		System.setOut(old);
	}

}
