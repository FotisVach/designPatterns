package fotis.designPatterns.Proxy;

/**
 * Interface Implemented by Proxy and concrete Objects.
 */
interface File {

	/**
	 * Gets the name.
	 *
	 * @return Returns the name
	 */
	String getName();

	/**
	 * Assigns a new value to the name.
	 *
	 * @param name
	 *            the name to set
	 */
	void setName(String name);

	/**
	 * Gets the size.
	 *
	 * @return Returns the size
	 */
	Float getSize();

	/**
	 * Assigns a new value to the size.
	 *
	 * @param size
	 *            the size to set
	 */
	void setSize(Float size);

	/**
	 * Read from file.
	 * 
	 * @return what is written in file
	 */
	String read();

	/**
	 * Write to file.
	 * 
	 * @param input
	 */
	void write(String input);

}
