package fotis.designPatterns.factoryMethod;

/**
 * Extends Weapon.
 */
@SuppressWarnings("javadoc")
class OrcWeapon implements Weapon {

	private WeaponType weaponType;

	@Override
	public WeaponType getWeaponType() {
		return this.weaponType;
	}

	@Override
	public void setWeaponType(WeaponType weaponType) {
		this.weaponType = weaponType;
	}

}
