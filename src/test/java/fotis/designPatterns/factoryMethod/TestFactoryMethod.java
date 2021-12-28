package fotis.designPatterns.factoryMethod;

import static org.junit.Assert.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

/**
 * Test class for Factory Method Pattern.
 */
public class TestFactoryMethod {

	/**
	 * Test proper creation by using {@link WeaponFactory}
	 */
	@Test
	public void test_OrcWeapon_creation() {
		Weapon orcWeapon = WeaponFactory.create(OrcWeapon::new);
		assertTrue(orcWeapon instanceof OrcWeapon);
		assertFalse(orcWeapon instanceof HumanWeapon);

		WeaponFactory factory = OrcWeapon::new;
		orcWeapon = factory.create();
		assertTrue(orcWeapon instanceof OrcWeapon);
		assertFalse(orcWeapon instanceof HumanWeapon);
	}

	/**
	 * Test proper creation by using {@link WeaponFactory}
	 */
	@Test
	public void test_HumanWeapon_creation() {
		Weapon humanWeapon = WeaponFactory.create(HumanWeapon::new);
		assertTrue(humanWeapon instanceof HumanWeapon);
		assertFalse(humanWeapon instanceof OrcWeapon);
		
		WeaponFactory factory = HumanWeapon::new;
		humanWeapon = factory.create();
		assertTrue(humanWeapon instanceof HumanWeapon);
		assertFalse(humanWeapon instanceof OrcWeapon);
	}

}
