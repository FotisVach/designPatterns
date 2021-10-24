package fotis.designPatterns.factoryMethod;

/**
 * Abstract Creator of Weapon, in charge of producing {@link Weapon}s
 */
interface WeaponCreator {

	/**
	 * Create a Weapon.
	 * 
	 * @param weaponType
	 * @return Weapon
	 */
	Weapon createWeapon(WeaponType weaponType);

}
