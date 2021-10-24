package fotis.designPatterns.abstractFactory;

/**
 * Implementation of {@link Castle}
 */
class HumanCastle implements Castle {

	/** Dummy property */
	static final String DESCRIPTION = "This is a human Castle"; //$NON-NLS-1$

	@Override
	public String getDescription() {
		return DESCRIPTION;
	}

}
