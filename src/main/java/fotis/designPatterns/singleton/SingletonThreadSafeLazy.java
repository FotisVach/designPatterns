package fotis.designPatterns.singleton;

/**
 * <p>
 * Thread-safe Singleton class that follows the lazy option of creation. The
 * instance needs a synchronization mechanism.
 */
class SingletonThreadSafeLazy {

	/** Singletons single instance */
	private static volatile SingletonThreadSafeLazy instance;

	/** Hide Constructor so nobody can instantiate this class */
	private SingletonThreadSafeLazy() {
		// EMPTY
	}

	/**
	 * <p>
	 * Called be the user to get the Singleton INSTANCE.
	 * <p>
	 * The instance doesn't get created until the method is called for the first
	 * time.
	 * 
	 * @return instance of the singleton.
	 */
	public static synchronized SingletonThreadSafeLazy getInstance() {
		if (instance == null) {
			synchronized (SingletonThreadSafeLazy.class) {
				if (instance == null) {
					instance = new SingletonThreadSafeLazy();
				}
			}
		}
		return instance;
	}

}
