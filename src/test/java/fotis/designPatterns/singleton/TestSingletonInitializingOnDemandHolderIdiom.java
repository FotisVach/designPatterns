package fotis.designPatterns.singleton;

/**
 * Test for {@link SingletonInitializingOnDemandHolderIdiom}
 */
public class TestSingletonInitializingOnDemandHolderIdiom
extends TestBaseSingleton<SingletonInitializingOnDemandHolderIdiom> {

	/**
	 * Creates a new TestSingletonInitializingOnDemandHolderIdiom object.
	 */
	public TestSingletonInitializingOnDemandHolderIdiom() {
		super(SingletonInitializingOnDemandHolderIdiom::getInstance);
	}

}
