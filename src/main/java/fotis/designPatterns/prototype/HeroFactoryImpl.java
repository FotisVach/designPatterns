package fotis.designPatterns.prototype;

/**
 * Concrete factory class.
 */
@SuppressWarnings("javadoc")
class HeroFactoryImpl 
implements HeroFactory {
	
	private final Human human;
	
	private final Orc orc;

	/**
	 * Creates a new HeroFactoryImpl object. 
	 *
	 * @param human
	 * @param orc
	 */
	public HeroFactoryImpl(Human human, Orc orc) {
		this.human = human;
		this.orc = orc;
	}

	@Override
	public Human createHuman() {
		return human.copy();
	}

	@Override
	public Orc createOrc() {
		return orc.copy();
	}

}
