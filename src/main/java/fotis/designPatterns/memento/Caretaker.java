package fotis.designPatterns.memento;

import java.util.Stack;

/**
 * The Caretaker.
 */
class Caretaker {

	/** Memento Pattern history */
	Stack<EmployeeMemento> history = new Stack<>();

	/**
	 * Saves an employee to stack.
	 * 
	 * @param employee
	 */
	void save(Employee employee) {
		history.push(employee.save());
	}

	/**
	 * Restores previous Employee state.
	 * 
	 * @param employee
	 */
	void revert(Employee employee) {
		employee.revert(history.pop());
	}

}
