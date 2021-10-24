package fotis.designPatterns.prototype;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

/**
 * POC Client for {@link HeroFactory}
 */
@SuppressWarnings({"nls", "javadoc"})
public class TestPrototypePattern {
	
	private Float health = 1000f;
	
	private Float attack = 50f;
	
	private String meleeName = "Aragorn";
	
	private String rangeName = "Legolas";
	
	private MeleeFighterStatus meleeStatus = MeleeFighterStatus.DEFENDING;
	
	private RangeFighterStatus rangeStatus = RangeFighterStatus.RELOADING;

	private HeroFactoryImpl meleeFactory;

	private HeroFactoryImpl rangeFactory;

	/**
	 * Initialization
	 */
	@Before
	public void setUpBeforeClass() {
		meleeFactory = new HeroFactoryImpl(new Swordsman(health, meleeName, meleeStatus),
				new UrukHai(health, attack, meleeStatus));
		rangeFactory = new HeroFactoryImpl(new Archer(health, rangeName, rangeStatus),
				new Goblin(health, attack, rangeStatus));
	}

	@Test
	public void test_creation() {
		Swordsman aragorn = (Swordsman) meleeFactory.createHuman();
		assertEquals(health, aragorn.getHealth());
		assertEquals(meleeName, aragorn.getName());
		assertEquals(meleeStatus, aragorn.getStatus());
		aragorn.act();
		
		UrukHai urukHai = (UrukHai) meleeFactory.createOrc();
		assertEquals(health, urukHai.getHealth());
		assertEquals(attack, urukHai.getAttack());
		assertEquals(meleeStatus, urukHai.getStatus());
		urukHai.act();
		
		Archer legolas = (Archer) rangeFactory.createHuman();
		assertEquals(health, legolas.getHealth());
		assertEquals(rangeName, legolas.getName());
		assertEquals(rangeStatus, legolas.getStatus());
		legolas.act();
		
		Goblin goblin = (Goblin) rangeFactory.createOrc();
		assertEquals(health, goblin.getHealth());
		assertEquals(attack, goblin.getAttack());
		assertEquals(rangeStatus, goblin.getStatus());
		goblin.act();
	}

}
