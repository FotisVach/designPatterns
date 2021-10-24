package fotis.designPatterns.prototype;

/**
 * Implementation of the prototype {@link Human}
 */
class Swordsman extends Human {

	/** Hero status */
	private MeleeFighterStatus status = MeleeFighterStatus.IDLE;

	/**
	 * Creates a new Swordsman object.
	 *
	 * @param swordsman
	 */
	Swordsman(Swordsman swordsman) {
		super(swordsman);
		this.status = swordsman.status;
	}

	/**
	 * Creates a new Swordsman object.
	 *
	 * @param health
	 * @param name
	 * @param status
	 */
	Swordsman(Float health, String name, MeleeFighterStatus status) {
		super(health, name);
		this.status = status;
	}

	@Override
	public Swordsman copy() {
		return new Swordsman(this);
	}

	@Override
	void act() {
		System.out.println(this + " " + this.status); //$NON-NLS-1$
	}

	/**
	 * Gets the status.
	 *
	 * @return Returns the status
	 */
	MeleeFighterStatus getStatus() {
		return status;
	}

	/**
	 * Assigns a new value to the status.
	 *
	 * @param status
	 *            the status to set
	 */
	void setStatus(MeleeFighterStatus status) {
		this.status = status;
	}

}
