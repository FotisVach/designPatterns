package fotis.designPatterns.abstractFactory;

/**
 * Implementation of {@link Castle}
 */
class OrcCastle implements Castle {

	/** Dummy property */
	static final String DESCRIPTION = "This is a orc Castle"; //$NON-NLS-1$

	@Override
	public String getDescription() {
		return DESCRIPTION;
	}

}
