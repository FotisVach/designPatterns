package fotis.designPatterns.adapter;

/**
 * A class adapter, works as a Two-way Adapter.
 * <p>
 * This way is considered a bad Design, we should use encapsulation instead of
 * inheritance.
 */
class EmployeeToCustomerClassAdapter extends Employee implements Customer {

	@Override
	public String getName() {
		return this.getFullName();
	}

	@Override
	public String getDesignation() {
		return this.getJobTitle();
	}

	@Override
	public String getAddress() {
		return this.getOfficeLocation();
	}

}
