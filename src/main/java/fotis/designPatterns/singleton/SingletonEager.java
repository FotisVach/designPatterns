package fotis.designPatterns.singleton;

/**
 * This implementation of the Singleton Pattern that follows the eager option of
 * creation.
 * <p>
 * Eager singleton pattern guarantees thread safety.
 */
class SingletonEager {

	/** Singletons single instance */
	private static final SingletonEager INSTANCE = new SingletonEager();

	/**
	 * Return singleton single instance
	 * 
	 * @return instance of the singleton.
	 */
	public static SingletonEager getInstance() {
		return INSTANCE;
	}

	/** Hide Constructor so nobody can instantiate this class */
	private SingletonEager() {
		// EMPTY
	}

}
