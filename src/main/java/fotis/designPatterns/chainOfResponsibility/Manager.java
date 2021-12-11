package fotis.designPatterns.chainOfResponsibility;

import java.util.EnumSet;

import fotis.designPatterns.chainOfResponsibility.LeaveApplication.Type;

/**
 * A concrete handler
 */
class Manager extends Employee {

	/**
	 * Creates a new ProjectLead object.
	 *
	 * @param next
	 */
	Manager(LeaveApprover next) {
		super(next);
	}

	@Override
	protected boolean processRequest(LeaveApplication application) {
		if (EnumSet.of(Type.SICK, Type.PTO).contains(application.getType())) {
			application.approve(getRoleApprover());
			return true;
		}
		return false;
	}

}
