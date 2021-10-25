package fotis.designPatterns.singleton;

/**
 * Test for {@link SingletonThreadSafeLazy}
 */
public class TestSingletonThreadSafeLazy extends TestBaseSingleton<SingletonThreadSafeLazy> {

	/**
	 * Creates a new TestSingletonThreadSafeLazy object.
	 */
	public TestSingletonThreadSafeLazy() {
		super(SingletonThreadSafeLazy::getInstance);
	}

}
