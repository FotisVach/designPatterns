package fotis.designPatterns.memento;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

/**
 * Test class for Memento Pattern.
 */
@SuppressWarnings({ "nls", "javadoc" })
class TestMemento {

	@Test
	void test() {
		Caretaker caretaker = new Caretaker();
		Employee emp = new Employee();
		emp.setName("fotis");
		emp.setAddress("abc");

		assertEquals("fotis abc", emp.toString());

		caretaker.save(emp);

		emp.setName("fotis 2");

		caretaker.save(emp);

		assertEquals("fotis 2 abc", emp.toString());

		emp.setAddress("abc 2"); // We do not save the state now

		caretaker.revert(emp);

		assertEquals("fotis 2 abc", emp.toString());

		caretaker.revert(emp);

		assertEquals("fotis abc", emp.toString());
	}

}
