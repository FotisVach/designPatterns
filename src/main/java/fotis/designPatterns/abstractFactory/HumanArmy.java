package fotis.designPatterns.abstractFactory;

/**
 * Implementation of {@link Army}
 */
class HumanArmy implements Army {

	/** Dummy property */
	static final String DESCRIPTION = "This is a human Army"; //$NON-NLS-1$

	@Override
	public String getDescription() {
		return DESCRIPTION;
	}

}
