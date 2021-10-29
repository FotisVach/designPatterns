package fotis.designPatterns.abstractFactory;


import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

/**
 * Test class for Abstract Fctory.
 */
public class TestAbstractFactory {

	/**
	 * Test human set creation
	 */
	@Test
	public void test_human() {
		// Create factory
		AbstractFactory humanFactory = new HumanFactory();
		// Create products of a specific set
		Army army = humanFactory.createArmy();
		King king = humanFactory.createKing();
		Castle castle = humanFactory.createCastle();
		// Assertions
		assertTrue(army instanceof HumanArmy);
		assertEquals(HumanArmy.DESCRIPTION, army.getDescription());

		assertTrue(king instanceof HumanKing);
		assertEquals(HumanKing.DESCRIPTION, king.getDescription());

		assertTrue(castle instanceof HumanCastle);
		assertEquals(HumanCastle.DESCRIPTION, castle.getDescription());
	}

	/**
	 * Test Orc set creation
	 */
	@Test
	public void test_orc() {
		// Create factory
		AbstractFactory humanFactory = new OrcFactory();
		// Create products of a specific set
		Army army = humanFactory.createArmy();
		King king = humanFactory.createKing();
		Castle castle = humanFactory.createCastle();
		// Assertions
		assertTrue(army instanceof OrcArmy);
		assertEquals(OrcArmy.DESCRIPTION, army.getDescription());

		assertTrue(king instanceof OrcKing);
		assertEquals(OrcKing.DESCRIPTION, king.getDescription());

		assertTrue(castle instanceof OrcCastle);
		assertEquals(OrcCastle.DESCRIPTION, castle.getDescription());
	}

}
