package fotis.designPatterns.decorator;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

/**
 * Test cases for Decorator Pattern.
 */
@SuppressWarnings({ "nls" })
class TestDecorator {

	/**
	 * Test cases
	 */
	@Test
	void test() {
		WebPage page = new BasicWebPage("basicPage");
		assertEquals("basicPage", page.getUrl());

		WannaBeSecureWebPage securePage = new WannaBeSecureWebPage(new BasicWebPage("secureWebPage"));
		assertThrows(RuntimeException.class, securePage::getUrl);

		securePage.setCreds("abc");
		assertEquals("secureWebPage", securePage.getUrl());
	}

}
