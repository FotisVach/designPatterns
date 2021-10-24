package fotis.designPatterns.simpleFactory;

import static org.junit.Assert.*;

import org.junit.Test;

/**
 * Test class for {@link SimpleFactory}
 */
public class TestSimpleFactory {

	/**
	 * Test creation of class {@link Bow}
	 */
	@Test
	public void test_bow() {
		Weapon bow = SimpleFactory.createWeapon(WeaponType.BOW);
		assertTrue(bow instanceof Bow);
		assertEquals(Bow.ATTACK, bow.attack());
	}
	
	/**
	 * Test creation of class {@link MagicStaff}
	 */
	@Test
	public void test_staff() {
		Weapon staff = SimpleFactory.createWeapon(WeaponType.MAGICWAND);
		assertTrue(staff instanceof MagicStaff);
		assertEquals(MagicStaff.ATTACK, staff.attack());
	}

}
