package fotis.designPatterns.chainOfResponsibility;

/**
 * This represents a handler in the chain of responsibility.
 */
interface LeaveApprover {

	/**
	 * Process a {@link LeaveApplication}
	 * 
	 * @param application
	 */
	void handleLeaveApplication(LeaveApplication application);

	/**
	 * Returns the Role of the person who approved the leave application
	 * 
	 * @return role of approver.
	 */
	public Class<? extends Employee> getRoleApprover();

}
