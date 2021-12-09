package fotis.designPatterns.flyweight;

/**
 * A concrete Flyweight. Instance is shared.
 */
@SuppressWarnings("javadoc")
class Smartphone implements Item {

	Integer key;

	/**
	 * Creates a new Smartphone object.
	 *
	 * @param key
	 */
	Smartphone(Integer key) {
		this.key = key;
	}

	@Override
	public Integer getKey() {
		return key;
	}

}
