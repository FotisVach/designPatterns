package fotis.designPatterns.singleton;

/**
 * Test for {@link SingletonThreadSafeDoubleCheckLocking}
 */
public class TestSingletonThreadSafeDoubleCheckLocking
extends TestBaseSingleton<SingletonThreadSafeDoubleCheckLocking> {

	/**
	 * Creates a new TestSingletonThreadSafeDoubleCheckLocking object.
	 */
	public TestSingletonThreadSafeDoubleCheckLocking() {
		super(SingletonThreadSafeDoubleCheckLocking::getInstance);
	}

}
