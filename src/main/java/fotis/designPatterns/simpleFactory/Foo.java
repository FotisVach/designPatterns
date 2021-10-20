package fotis.designPatterns.simpleFactory;

/**
 * Just an Abstract class
 */
@SuppressWarnings("javadoc")
abstract class Foo {

	private String a;

	private String b;

	/**
	 * Gets the a.
	 *
	 * @return Returns the a
	 */
	String getA() {
		return a;
	}

	/**
	 * Assigns a new value to the a.
	 *
	 * @param a
	 *            the a to set
	 */
	void setA(String a) {
		this.a = a;
	}

	/**
	 * Gets the b.
	 *
	 * @return Returns the b
	 */
	String getB() {
		return b;
	}

	/**
	 * Assigns a new value to the b.
	 *
	 * @param b
	 *            the b to set
	 */
	void setB(String b) {
		this.b = b;
	}

}
