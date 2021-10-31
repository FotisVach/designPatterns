package fotis.designPatterns.adapter;

/**
 * An object adapter.
 * <p>
 * This way is considered a better design that a class adapter.
 */
class EmployeeToCustomerObjectAdapter implements Customer {

	/** Class we want to adapt - transform */
	private final Employee adaptee;

	/**
	 * Creates a new EmployeeToCustomerObjectAdapter object.
	 *
	 * @param adaptee
	 */
	public EmployeeToCustomerObjectAdapter(Employee adaptee) {
		this.adaptee = adaptee;
	}

	@Override
	public String getName() {
		return adaptee.getFullName();
	}

	@Override
	public String getDesignation() {
		return adaptee.getJobTitle();
	}

	@Override
	public String getAddress() {
		return adaptee.getOfficeLocation();
	}

}
