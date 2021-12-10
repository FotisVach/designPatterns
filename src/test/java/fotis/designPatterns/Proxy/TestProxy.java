package fotis.designPatterns.Proxy;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.text.MessageFormat;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

/**
 * Test for Proxy Pattern.
 */
@SuppressWarnings({ "nls", "javadoc" })
class TestProxy {

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
		File file = FileFactory.getFile();
		file.setName("name");
		assertEquals("name", file.getName());
		file.setSize(123f);
		assertEquals(123L, file.getSize());

		String testString = baos.toString();
		assertEquals("", testString);

		file.write("123");
		assertEquals("123", file.read());
		assertEquals("name", file.getName());
		assertEquals(123L, file.getSize());
		testString = baos.toString();
		String expected = MessageFormat.format("write\nread\ngetName\ngetSize\n", Object[].class);
		assertEquals(expected, testString);

	}

	@AfterAll
	static void after() {
		System.setOut(old);
	}

}
