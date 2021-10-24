package fotis.designPatterns.simpleFactory;

/**
 * Implementation of {@link Weapon}
 */
@SuppressWarnings("javadoc")
public class MagicStaff implements Weapon {

	static final String ATTACK = "CAST SPELL"; //$NON-NLS-1$

	@Override
	public String attack() {
		return ATTACK;
	}

}
