package fotis.designPatterns.prototype;

/**
 * Implementation of the prototype {@link Orc}
 */
class Goblin extends Orc {

	/** Hero status */
	private RangeFighterStatus status = RangeFighterStatus.IDLE;

	/**
	 * Creates a new Goblin object.
	 *
	 * @param goblin
	 */
	Goblin(Goblin goblin) {
		super(goblin);
		this.status = goblin.status;
	}

	/**
	 * Creates a new Goblin object.
	 *
	 * @param health
	 * @param attack
	 * @param status
	 */
	Goblin(Float health, Float attack, RangeFighterStatus status) {
		super(health, attack);
		this.status = status;
	}

	@Override
	public Goblin copy() {
		return new Goblin(this);
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
