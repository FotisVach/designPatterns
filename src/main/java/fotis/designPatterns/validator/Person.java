package fotis.designPatterns.validator;

/**
 * Class to be validated
 */
@SuppressWarnings("javadoc")
class Person {

	private String name;

	private int age;

	/**
	 * Creates a new Person object.
	 *
	 * @param name
	 * @param age
	 */
	Person(String name, int age) {
		this.name = name;
		this.age = age;
	}

	/**
	 * Gets the name.
	 *
	 * @return Returns the name
	 */
	String getName() {
		return name;
	}

	/**
	 * Assigns a new value to the name.
	 *
	 * @param name
	 *            the name to set
	 */
	void setName(String name) {
		this.name = name;
	}

	/**
	 * Gets the age.
	 *
	 * @return Returns the age
	 */
	int getAge() {
		return age;
	}

	/**
	 * Assigns a new value to the age.
	 *
	 * @param age
	 *            the age to set
	 */
	void setAge(int age) {
		this.age = age;
	}

	@SuppressWarnings("nls")
	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + "]";
	}
	
}
