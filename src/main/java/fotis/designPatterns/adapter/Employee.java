package fotis.designPatterns.adapter;

/**
 * An existing class in our system</br>
 * Adaptee
 */
@SuppressWarnings("javadoc")
class Employee {

	private String fullName;

	private String jobTitle;

	private String officeLocation;

	/**
	 * Gets the fullName.
	 *
	 * @return Returns the fullName
	 */
	String getFullName() {
		return fullName;
	}

	/**
	 * Assigns a new value to the fullName.
	 *
	 * @param fullName
	 *            the fullName to set
	 */
	void setFullName(String fullName) {
		this.fullName = fullName;
	}

	/**
	 * Gets the jobTitle.
	 *
	 * @return Returns the jobTitle
	 */
	String getJobTitle() {
		return jobTitle;
	}

	/**
	 * Assigns a new value to the jobTitle.
	 *
	 * @param jobTitle
	 *            the jobTitle to set
	 */
	void setJobTitle(String jobTitle) {
		this.jobTitle = jobTitle;
	}

	/**
	 * Gets the officeLocation.
	 *
	 * @return Returns the officeLocation
	 */
	String getOfficeLocation() {
		return officeLocation;
	}

	/**
	 * Assigns a new value to the officeLocation.
	 *
	 * @param officeLocation
	 *            the officeLocation to set
	 */
	void setOfficeLocation(String officeLocation) {
		this.officeLocation = officeLocation;
	}

}
