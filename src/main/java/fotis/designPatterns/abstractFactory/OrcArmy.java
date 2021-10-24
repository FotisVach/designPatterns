package fotis.designPatterns.abstractFactory;

/**
 * Implementation of {@link Army}
 */
class OrcArmy implements Army {

	/** Dummy property */
	static final String DESCRIPTION = "This is a orc Army"; //$NON-NLS-1$

	@Override
	public String getDescription() {
		return DESCRIPTION;
	}

}
