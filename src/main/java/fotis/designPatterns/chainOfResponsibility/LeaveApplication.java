package fotis.designPatterns.chainOfResponsibility;

/**
 * Represents a request in our Chain of Responsibility
 */
@SuppressWarnings("javadoc")
class LeaveApplication {

	enum Type {
		SICK, PTO, LOP
	}

	enum Status {
		PENDING, APPROVED, REJECTED
	}

	private Type type;

	private Status status;

	private Class<? extends Employee> processedBy;

	/**
	 * Creates a new LeaveApplication object.
	 *
	 * @param type
	 */
	LeaveApplication(Type type) {
		this.type = type;
		this.status = Status.PENDING;
	}

	void approve(Class<? extends Employee> role) {
		this.status = Status.APPROVED;
		this.processedBy = role;
	}

	void reject(Class<? extends Employee> role) {
		this.status = Status.REJECTED;
		this.processedBy = role;
	}

	/**
	 * Gets the type.
	 *
	 * @return Returns the type
	 */
	Type getType() {
		return type;
	}

	/**
	 * Assigns a new value to the type.
	 *
	 * @param type
	 *            the type to set
	 */
	void setType(Type type) {
		this.type = type;
	}

	/**
	 * Gets the status.
	 *
	 * @return Returns the status
	 */
	Status getStatus() {
		return status;
	}

	/**
	 * Assigns a new value to the status.
	 *
	 * @param status
	 *            the status to set
	 */
	void setStatus(Status status) {
		this.status = status;
	}

	/**
	 * Gets the processedBy.
	 *
	 * @return Returns the processedBy
	 */
	Class<? extends Employee> getProcessedBy() {
		return processedBy;
	}

	/**
	 * Assigns a new value to the processedBy.
	 *
	 * @param processedBy
	 *            the processedBy to set
	 */
	void setProcessedBy(Class<? extends Employee> processedBy) {
		this.processedBy = processedBy;
	}

}
