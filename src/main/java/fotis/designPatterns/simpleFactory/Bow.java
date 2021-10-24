package fotis.designPatterns.simpleFactory;

/**
 * Implementation of {@link Weapon}
 */
@SuppressWarnings("javadoc")
class Bow implements Weapon {

	static final String ATTACK = "FIRE ARROW"; //$NON-NLS-1$

	@Override
	public String attack() {
		return ATTACK;
	}

}
