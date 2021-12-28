package fotis.designPatterns.factoryMethod;

import java.util.function.Supplier;

/**
 * Custom Factory Implementation
 */
interface WeaponFactory extends Supplier<Weapon> {
	
	/**
	 * Creates a Weapon Object. 
	 * 
	 * @return a weapon
	 */
	default Weapon create() {
		return get();
	}
	
	/**
	 * Returns a Weapon Object.
	 * 
	 * @param constructor
	 * @return a Weapon Object
	 */
	static Weapon create(Supplier<Weapon> constructor) {
		return constructor.get();
	}

}
