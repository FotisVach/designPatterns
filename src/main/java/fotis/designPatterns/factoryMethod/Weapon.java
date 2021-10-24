package fotis.designPatterns.factoryMethod;

/**
 * Product abstract class
 */
interface Weapon {

	/**
	 * Gets the weaponType.
	 *
	 * @return Returns the weaponType
	 */
	WeaponType getWeaponType();

	/**
	 * Assigns a new value to the weaponType.
	 *
	 * @param weaponType the weaponType to set
	 */
	void setWeaponType(WeaponType weaponType);

}
