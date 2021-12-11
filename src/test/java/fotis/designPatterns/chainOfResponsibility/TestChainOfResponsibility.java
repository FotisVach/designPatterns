package fotis.designPatterns.chainOfResponsibility;

import static org.junit.Assert.assertTrue;

import org.junit.jupiter.api.Test;

import fotis.designPatterns.chainOfResponsibility.LeaveApplication.Status;
import fotis.designPatterns.chainOfResponsibility.LeaveApplication.Type;

/**
 * Test class for Chain of Responsibility Pattern.
 */
class TestChainOfResponsibility {

	/**
	 * Test case for {@link Type#SICK}
	 */
	@Test
	void test_sick() {
		LeaveApprover handler = createChain();
		LeaveApplication request = new LeaveApplication(Type.SICK);
		assertTrue(request.getStatus() == Status.PENDING);
		handler.handleLeaveApplication(request);
		assertTrue(request.getStatus() == Status.APPROVED);
		assertTrue(request.getProcessedBy() == ProjectLead.class);
	}

	/**
	 * Test case for {@link Type#PTO}
	 */
	@Test
	void test_pto() {
		LeaveApprover handler = createChain();
		LeaveApplication request = new LeaveApplication(Type.PTO);
		assertTrue(request.getStatus() == Status.PENDING);
		handler.handleLeaveApplication(request);
		assertTrue(request.getStatus() == Status.APPROVED);
		assertTrue(request.getProcessedBy() == Manager.class);
	}

	/**
	 * Test case for {@link Type#LOP}
	 */
	@Test
	void test_lpo() {
		LeaveApprover handler = createChain();
		LeaveApplication request = new LeaveApplication(Type.LOP);
		assertTrue(request.getStatus() == Status.PENDING);
		handler.handleLeaveApplication(request);
		assertTrue(request.getStatus() == Status.REJECTED);
		assertTrue(request.getProcessedBy() == Director.class);
	}

	/**
	 * @return the chain of Responsibility
	 */
	private LeaveApprover createChain() {
		Director d = new Director(null);
		Manager m = new Manager(d);
		ProjectLead l = new ProjectLead(m);
		return l;
	}

}
