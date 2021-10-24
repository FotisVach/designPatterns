package fotis.designPatterns.prototype;

/**
 * This class represents an abstract Prototype and defines the clone method.
 */
@SuppressWarnings("javadoc")
abstract class Orc implements Prototype {

	private Float health;

	private Float attack;

	/**
	 * Creates a new {@link Orc} object.
	 * 
	 * @param human
	 */
	Orc(Orc human) {
		this.health = human.health;
		this.attack = human.attack;
	}

	/**
	 * Creates a new Human object.
	 *
	 * @param health
	 * @param attack
	 */
	public Orc(Float health, Float name) {
		super();
		this.health = health;
		this.attack = name;
	}

	/**
	 * Creates a new {@link Orc} object.
	 */
	Orc() {
		this.health = 100f;
		this.attack = 10f;
	}

	/** Humans basic move */
	abstract void act();

	/**
	 * Gets the health.
	 *
	 * @return Returns the health
	 */
	Float getHealth() {
		return health;
	}

	/**
	 * Assigns a new value to the health.
	 *
	 * @param health
	 *            the health to set
	 */
	void setHealth(Float health) {
		this.health = health;
	}

	/**
	 * Gets the attack.
	 *
	 * @return Returns the attack
	 */
	public Float getAttack() {
		return attack;
	}

	/**
	 * Assigns a new value to the attack.
	 *
	 * @param attack
	 *            the attack to set
	 */
	public void setAttack(Float attack) {
		this.attack = attack;
	}

	@Override
	public abstract Orc copy();

}
