package fotis.designPatterns.facade;

import static org.junit.Assert.assertTrue;

import org.junit.jupiter.api.Test;

/**
 * Test for Facade Pattern
 */
@SuppressWarnings("nls")
class TestFacade {

	/**
	 * Test method
	 */
	@Test
	void test() {
		BeeFacade facade = new BeeFacade();
		String startDay = facade.startNewDay();
		String execute = facade.execute();
		String endDay = facade.endDay();

		assertTrue(startDay.contains("Scouter wakeUp"));
		assertTrue(startDay.contains("Scouter goToWork"));
		assertTrue(startDay.contains("Worker wakeUp"));
		assertTrue(startDay.contains("Worker goToWork"));
		assertTrue(startDay.contains("Queen wakeUp"));
		assertTrue(startDay.contains("Queen goToWork"));

		assertTrue(execute.contains("Scouter finds flowers"));
		assertTrue(execute.contains("Worker makes honey"));
		assertTrue(execute.contains("Queen makes bees"));

		assertTrue(endDay.contains("Scouter goHome"));
		assertTrue(endDay.contains("Scouter goToSleep"));
		assertTrue(endDay.contains("Worker goHome"));
		assertTrue(endDay.contains("Worker goToSleep"));
		assertTrue(endDay.contains("Queen goHome"));
		assertTrue(endDay.contains("Queen goToSleep"));
	}
}
