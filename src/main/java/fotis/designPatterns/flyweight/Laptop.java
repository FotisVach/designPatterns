package fotis.designPatterns.flyweight;

/**
 * A concrete Flyweight. Instance is shared.
 */
@SuppressWarnings("javadoc")
class Laptop implements Item {

	Integer key;

	/**
	 * Creates a new Laptop object.
	 *
	 * @param key
	 */
	Laptop(Integer key) {
		super();
		this.key = key;
	}

	@Override
	public Integer getKey() {
		return key;
	}

}
