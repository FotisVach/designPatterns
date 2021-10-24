package fotis.designPatterns.factoryMethod;

import static org.junit.Assert.*;

import org.junit.Test;

/**
 * Test class for Factory Method Pattern.
 */
public class TestFactoryMethod {

	/**
	 * Test proper creation by using {@link OrcWeaponCreator} implementation of the AbstractCreator.
	 */
	@Test
	public void test_OrcWeapon_creation() {
		Weapon orcWeapon = createWeapon(new OrcWeaponCreator());
		assertTrue(orcWeapon instanceof OrcWeapon);
		assertEquals(WeaponType.AXE, orcWeapon.getWeaponType());
	}
	
	/**
	 * Test proper creation by using {@link HumanWeaponCreator} implementation of the AbstractCreator.
	 */
	@Test
	public void test_HumanWeapon_creation() {
		Weapon humanWeapon = createWeapon(new HumanWeaponCreator());
		assertTrue(humanWeapon instanceof HumanWeapon);
		assertEquals(WeaponType.AXE, humanWeapon.getWeaponType());
	}
	
	/**
	 * Just a dummy method to test Creator Pattern.
	 * 
	 * @param creator
	 * @return a {@link Weapon}
	 */
	private Weapon createWeapon(WeaponCreator creator) {
		WeaponType weaponType = WeaponType.AXE;
		return creator.createWeapon(weaponType);
	}

}
