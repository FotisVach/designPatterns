package fotis.designPatterns.visitor;

import java.util.Collection;
import java.util.Collections;

/**
 * 
 */
@SuppressWarnings("javadoc")
abstract class AbstractEmployee implements Employee {

	private int performanceRating;

	private String name;

	private static int employeeIdCounter = 101;

	private int employeeId;

	/**
	 * Creates a new AbstractEmployee object.
	 *
	 * @param name
	 */
	AbstractEmployee(String name) {
		this.name = name;
		employeeId = employeeIdCounter++;
	}

	/**
	 * Gets the name.
	 *
	 * @return Returns the name
	 */
	String getName() {
		return name;
	}

	@Override
	public int getPerformanceRating() {
		return performanceRating;
	}

	@Override
	public void setPerformanceRating(int rating) {
		performanceRating = rating;
	}

	@Override
	public Collection<Employee> getDirectReports() {
		return Collections.emptyList();
	}

	@Override
	public int getEmployeeId() {
		return employeeId;
	}

}
