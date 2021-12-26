package fotis.designPatterns.visitor;

import java.util.Collection;

/**
 * Element
 */
@SuppressWarnings("javadoc")
interface Employee {
	
	int getPerformanceRating();

	void setPerformanceRating(int rating);
	
	Collection<Employee> getDirectReports();
	
	int getEmployeeId();
	
	String accept(Visitor visitor);
	
}
