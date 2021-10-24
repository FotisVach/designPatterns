package fotis.designPatterns.prototype;

/**
 * Implementation of the prototype {@link Human}
 */
class Archer extends Human {

	/** Hero status */
	private RangeFighterStatus status = RangeFighterStatus.IDLE;

	/**
	 * Creates a new Archer object.
	 *
	 * @param archer
	 */
	Archer(Archer archer) {
		super(archer);
		this.status = archer.status;
	}

	/**
	 * Creates a new Archer object.
	 *
	 * @param health
	 * @param name
	 * @param status
	 */
	Archer(Float health, String name, RangeFighterStatus status) {
		super(health, name);
		this.status = status;
	}

	@Override
	public Archer copy() {
		return new Archer(this);
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
	RangeFighterStatus getStatus() {
		return status;
	}

	/**
	 * Assigns a new value to the status.
	 *
	 * @param status
	 *            the status to set
	 */
	void setStatus(RangeFighterStatus status) {
		this.status = status;
	}

}
