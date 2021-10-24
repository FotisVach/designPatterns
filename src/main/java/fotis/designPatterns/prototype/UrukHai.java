package fotis.designPatterns.prototype;

/**
 * Implementation of the prototype {@link Orc}
 */
class UrukHai extends Orc {

	/** Hero status */
	private MeleeFighterStatus status = MeleeFighterStatus.IDLE;

	/**
	 * Creates a new UrukHai object.
	 *
	 * @param urukHai
	 */
	UrukHai(UrukHai urukHai) {
		super(urukHai);
		this.status = urukHai.status;
	}

	/**
	 * Creates a new UrukHai object.
	 *
	 * @param health
	 * @param attack
	 * @param status
	 */
	UrukHai(Float health, Float attack, MeleeFighterStatus status) {
		super(health, attack);
		this.status = status;
	}

	@Override
	public UrukHai copy() {
		return new UrukHai(this);
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
