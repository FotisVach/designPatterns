package fotis.designPatterns.memento;

/**
 * Memento.<br>
 * Can be moved as an inner class in caretaker.
 */
@SuppressWarnings("javadoc")
class EmployeeMemento {

	private String name;

	private String address;

	/**
	 * Creates a new EmployeeMemento object.
	 * 
	 * @param name
	 * @param address
	 */
	public EmployeeMemento(String name, String address) {
		this.name = name;
		this.address = address;
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
	 * Gets the address.
	 *
	 * @return Returns the address
	 */
	String getAddress() {
		return address;
	}

}
