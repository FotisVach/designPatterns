package fotis.designPatterns.abstractFactory;

/**
 * Implementation of {@link King}
 */
class HumanKing implements King {

	/** Dummy property */
	static final String DESCRIPTION = "This is a human King"; //$NON-NLS-1$

	@Override
	public String getDescription() {
		return DESCRIPTION;
	}

}
