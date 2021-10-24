package fotis.designPatterns.prototype;

/**
 * This class represents an abstract Prototype and defines the clone method.
 */
@SuppressWarnings("javadoc")
abstract class Human implements Prototype {

	private Float health;

	private String name;

	/**
	 * Creates a new {@link Human} object.
	 * 
	 * @param human
	 */
	Human(Human human) {
		this.health = human.health;
		this.name = human.name;
	}

	/**
	 * Creates a new Human object.
	 *
	 * @param health
	 * @param name
	 */
	public Human(Float health, String name) {
		super();
		this.health = health;
		this.name = name;
	}

	/**
	 * Creates a new {@link Human} object.
	 */
	Human() {
		this.health = 100f;
		this.name = "Uknown"; //$NON-NLS-1$
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
	 * Gets the name.
	 *
	 * @return Returns the name
	 */
	String getName() {
		return name;
	}

	/**
	 * Assigns a new value to the name.
	 *
	 * @param name
	 *            the name to set
	 */
	void setName(String name) {
		this.name = name;
	}

	@Override
	public abstract Human copy();

}
