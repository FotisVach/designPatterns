package fotis.designPatterns.singleton;

/**
 * <p>
 * In software engineering, the initialization-on-demand holder (design pattern)
 * idiom is a lazy-loaded singleton. In all versions of Java, the idiom enables
 * a safe, highly concurrent lazy initialization of static fields with good
 * performance.
 * <p>
 * The implementation of the idiom relies on the initialization phase of
 * execution within the Java Virtual Machine (JVM) as specified by the Java
 * Language Specification (JLS). When the class
 * {@link SingletonInitializingOnDemandHolderIdiom} is loaded by the JVM, the
 * class goes through initialization. Since the class does not have any static
 * variables to initialize, the initialization completes trivially. The static
 * class definition LazyHolder within it is not initialized until the JVM
 * determines that LazyHolder must be executed. The static class LazyHolder is
 * only executed when the static method getInstance is invoked on the class
 * {@link SingletonInitializingOnDemandHolderIdiom}, and the first time this
 * happens the JVM will load and initialize the LazyHolder class. The
 * initialization of the LazyHolder class results in static variable INSTANCE
 * being initialized by executing the (private) constructor for the outer class
 * {@link SingletonInitializingOnDemandHolderIdiom}. Since the class
 * initialization phase is guaranteed by the JLS to be sequential, i.e.,
 * non-concurrent, no further synchronization is required in the static
 * getInstance method during loading and initialization. And since the
 * initialization phase writes the static variable INSTANCE in a sequential
 * operation, all subsequent concurrent invocations of the getInstance will
 * return the same correctly initialized INSTANCE without incurring any
 * additional synchronization overhead.
 * <p>
 * See <a href=
 * "https://en.wikipedia.org/wiki/Initialization-on-demand_holder_idiom">https://en.wikipedia.org/wiki/Initialization-on-demand_holder_idiom</a>
 */
class SingletonInitializingOnDemandHolderIdiom {

	/** Hide Constructor so nobody can instantiate this class */
	private SingletonInitializingOnDemandHolderIdiom() {
		// EMPTY
	}

	/**
	 * Singleton instance.
	 *
	 * @return Singleton instance
	 */
	public static SingletonInitializingOnDemandHolderIdiom getInstance() {
		return LazyHolder.INSTANCE;
	}

	/**
	 * Provides the lazy-loaded Singleton instance.
	 */
	private static class LazyHolder {
		/** Singletons single instance */
		static final SingletonInitializingOnDemandHolderIdiom INSTANCE = new SingletonInitializingOnDemandHolderIdiom();
	}

}
