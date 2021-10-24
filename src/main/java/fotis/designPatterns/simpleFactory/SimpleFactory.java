package fotis.designPatterns.simpleFactory;

/**
 * Simple Factory implementation.
 */
@SuppressWarnings("javadoc")
class SimpleFactory {

	static Weapon createWeapon(WeaponType type) {
		return type.getConstructor().get();
	}

}
