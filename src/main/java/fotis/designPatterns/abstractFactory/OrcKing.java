package fotis.designPatterns.abstractFactory;

/**
 * Implementation of {@link King}
 */
public class OrcKing implements King {

	/** Dummy property */
	static final String DESCRIPTION = "This is a orc King"; //$NON-NLS-1$

	@Override
	public String getDescription() {
		return DESCRIPTION;
	}

}
