package fotis.designPatterns.factoryMethod;

/**
 * Implementation A for {@link WeaponCreator}
 */
class OrcWeaponCreator 
implements WeaponCreator {

	@Override
	public Weapon createWeapon(WeaponType weaponType) {
		return new OrcWeapon(weaponType);
	}

}
