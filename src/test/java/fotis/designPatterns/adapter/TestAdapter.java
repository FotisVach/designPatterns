package fotis.designPatterns.adapter;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

/**
 * Test case for Class Adapter Pattern.
 */
@SuppressWarnings("nls")
class TestAdapter {

	/**
	 * Test method for {@link EmployeeToCustomerClassAdapter}
	 */
	@Test
	void test_classAdapter() {
		EmployeeToCustomerClassAdapter e2cAdapter = new EmployeeToCustomerClassAdapter();
		populateEmployeeData(e2cAdapter);
		BussinessCardDesigner designer = new BussinessCardDesigner();
		String card = designer.designCard(e2cAdapter);

		assertTrue(card.contains("Donald Duck"));
		assertTrue(card.contains("Looney Tune"));
		assertTrue(card.contains("Duckburg"));
	}

	/**
	 * Test method for {@link EmployeeToCustomerObjectAdapter}
	 */
	@Test
	void test_objectAdapter() {
		Employee e = new Employee();
		populateEmployeeData(e);
		EmployeeToCustomerObjectAdapter e2cAdapter = new EmployeeToCustomerObjectAdapter(e);

		BussinessCardDesigner designer = new BussinessCardDesigner();
		String card = designer.designCard(e2cAdapter);

		assertTrue(card.contains("Donald Duck"));
		assertTrue(card.contains("Looney Tune"));
		assertTrue(card.contains("Duckburg"));
	}

	/**
	 * Creates a sample {@link Employee}
	 * 
	 * @param e
	 *            Employee
	 */
	private void populateEmployeeData(Employee e) {
		e.setFullName("Donald Duck");
		e.setJobTitle("Looney Tune");
		e.setOfficeLocation("Duckburg");
	}

}
