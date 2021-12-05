package fotis.designPatterns.composite;

/**
 * The component base class for Composite Pattern<br>
 * Defines the operations applicable both in leaf & Composite.
 */
@SuppressWarnings("javadoc")
abstract class File {

	private String name;

	/**
	 * Creates a new File object.
	 *
	 * @param name
	 */
	public File(String name) {
		this.name = name;
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

	abstract String ls();

	/**
	 * We can move the following methods from the parent class to the composite class.<br>
	 * If we do that the leaf class will now have access to these.
	 */
	abstract void addFile(File file);

	abstract File[] getFiles();

	abstract boolean removeFile(File file);

}
