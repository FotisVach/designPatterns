package fotis.designPatterns.singleton;

/**
 * <p>
 * Singleton Double check locking. Thread-Safe and Lazy initialized
 * <p>
 * See <a href=
 * "https://en.wikipedia.org/wiki/Double-checked_locking">https://en.wikipedia.org/wiki/Double-checked_locking</a>
 */
class SingletonThreadSafeDoubleCheckLocking {

	/** Singletons single instance */
	private static volatile SingletonThreadSafeDoubleCheckLocking instance;

	/** Hide Constructor so nobody can instantiate this class */
	private SingletonThreadSafeDoubleCheckLocking() {
		// Stop call by reflection
		if (instance != null) {
			throw new RuntimeException("User getInstance() method to create"); //$NON-NLS-1$
		}
	}

	/**
	 * <p>
	 * Called be the user to get the Singleton INSTANCE.
	 *
	 * @return instance of the singleton.
	 */
	public static SingletonThreadSafeDoubleCheckLocking getInstance() {
		// Check if singleton instance is initialized. If it is initialized then
		// we can return the instance.
		if (instance == null) {
			// It is not initialized but we cannot be sure because some other
			// thread might have initialized it in the meanwhile. So to make
			// sure we need to lock on an object to get mutual exclusion.
			synchronized (SingletonThreadSafeDoubleCheckLocking.class) {
				// Again assign the instance to local variable to check if it
				// was initialized by some other thread while current thread was
				// blocked to enter the locked zone. If it was initialized then
				// we can return the previously created instance just like the
				// previous null check.
				if (instance == null) {
					// The instance is still not initialized so we can safely
					// (no other thread can enter this zone) create an instance
					// and make it our singleton instance.
					instance = new SingletonThreadSafeDoubleCheckLocking();
				}
			}
		}
		return instance;
	}

}
