package fotis.designPatterns.singleton;

/**
 * Test for {@link SingletonEager}
 */
public class TestSingletonEager extends TestBaseSingleton<SingletonEager> {

	/**
	 * Creates a new TestSingletonEager object. 
	 */
	public TestSingletonEager() {
		super(SingletonEager::getInstance);
	}

}
