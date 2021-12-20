package fotis.designPatterns.memento;

/**
 * Originator
 */
@SuppressWarnings("javadoc")
class Employee {

	private String name;

	private String address;

	/**
	 * Saves current Employee state.
	 * 
	 * @return
	 */
	EmployeeMemento save() {
		return new EmployeeMemento(name, address);
	}

	/**
	 * Reverts to previous employee.
	 * 
	 * @param memento
	 */
	void revert(EmployeeMemento memento) {
		this.name = memento.getName();
		this.address = memento.getAddress();
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

	/**
	 * Gets the address.
	 *
	 * @return Returns the address
	 */
	String getAddress() {
		return address;
	}

	/**
	 * Assigns a new value to the address.
	 *
	 * @param address
	 *            the address to set
	 */
	void setAddress(String address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return name + " " + address; //$NON-NLS-1$
	}

}
