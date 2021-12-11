package fotis.designPatterns.chainOfResponsibility;

import fotis.designPatterns.chainOfResponsibility.LeaveApplication.Type;

/**
 * A concrete handler
 */
class ProjectLead extends Employee {

	/**
	 * Creates a new ProjectLead object.
	 *
	 * @param next
	 */
	ProjectLead(LeaveApprover next) {
		super(next);
	}

	@Override
	protected boolean processRequest(LeaveApplication application) {
		if (application.getType() == Type.SICK) {
			application.approve(getRoleApprover());
			return true;
		}
		return false;
	}

}
