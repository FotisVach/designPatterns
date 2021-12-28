package fotis.designPatterns.factoryMethod;

/**
 * Extends Weapon.
 */
@SuppressWarnings("javadoc")
public class HumanWeapon implements Weapon {

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
