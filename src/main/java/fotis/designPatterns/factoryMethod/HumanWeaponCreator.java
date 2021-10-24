package fotis.designPatterns.factoryMethod;

/**
 * Implementation B for {@link WeaponCreator}
 */
class HumanWeaponCreator implements WeaponCreator {

	@Override
	public Weapon createWeapon(WeaponType weaponType) {
		return new HumanWeapon(weaponType);
	}

}
