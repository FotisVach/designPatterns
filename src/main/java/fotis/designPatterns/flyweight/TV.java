package fotis.designPatterns.flyweight;

/**
 * A concrete Flyweight. Instance is shared.
 */
@SuppressWarnings("javadoc")
class TV implements Item {

	Integer key;

	/**
	 * Creates a new TV object.
	 *
	 * @param key
	 */
	TV(Integer key) {
		this.key = key;
	}

	@Override
	public Integer getKey() {
		return key;
	}

}
