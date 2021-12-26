package fotis.designPatterns.visitor;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

/**
 * Concrete Element
 */
class ProjectLead extends AbstractEmployee {
	/** Element property */
	private List<Employee> directReports = new ArrayList<>();

	/**
	 * Creates a new Programmer object.
	 *
	 * @param name
	 * @param employees
	 */
	ProjectLead(String name, Employee... employees) {
		super(name);
		Arrays.stream(employees).forEach(directReports::add);
	}

	/**
	 * Gets the directReports.
	 *
	 * @return Returns the directReports
	 */
	@Override
	public Collection<Employee> getDirectReports() {
		return directReports;
	}

	@Override
	public String accept(Visitor visitor) {
		return visitor.visit(this);
	}

}
