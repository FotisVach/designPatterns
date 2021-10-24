package fotis.designPatterns.simpleFactory;

import java.util.function.Supplier;

/**
 * Enum that represents the types of {@link Weapon}s that are supported.
 */
enum WeaponType {
	/** Supported classes */
	BOW(Bow::new),
	
	/** */
	MAGICWAND(MagicStaff::new);
	
	/**
	 * The constructor of the concrete class we want to instantiate.
	 */
	private final Supplier<Weapon> constructor;

	/**
	 * Gets the constructor.
	 *
	 * @return Returns the constructor
	 */
	public Supplier<Weapon> getConstructor() {
		return constructor;
	}

	/**
	 * Creates a new WeaponType object. 
	 *
	 * @param constructor
	 */
	private WeaponType(Supplier<Weapon> constructor) {
		this.constructor = constructor;
	}
	
}
