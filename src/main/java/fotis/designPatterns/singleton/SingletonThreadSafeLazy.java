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
		// Stop call by reflection
		if (instance != null) {
			throw new RuntimeException("User getInstance() method to create"); //$NON-NLS-1$
		}
	}

	/**
	 * <p>
	 * Called be the user to get the Singleton INSTANCE.
	 * <p>
	 * The instance doesn't get created until the method is called for the first
	 * time.
	 * <p>
	 * It is not considered a good Singleton implementation because we
	 * synchronize all the method, so it becomes slow even when we need just to
	 * read an instance and not to create it.
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
