package fotis.designPatterns.chainOfResponsibility;

/**
 * Abstract handler
 */
abstract class Employee implements LeaveApprover {

	/** Next approver in the chain of Responsibility **/
	private LeaveApprover next;

	/**
	 * Creates a new Employee object.
	 *
	 * @param next
	 */
	Employee(LeaveApprover next) {
		this.next = next;
	}

	@Override
	public void handleLeaveApplication(LeaveApplication application) {
		if (!processRequest(application) && next != null) {
			next.handleLeaveApplication(application);
			return;
		}
	}

	/**
	 * Try to process the request.
	 * 
	 * @param application
	 * @return if the Request was processed
	 */
	protected abstract boolean processRequest(LeaveApplication application);

	@Override
	public Class<? extends Employee> getRoleApprover() {
		return this.getClass();
	}

}
