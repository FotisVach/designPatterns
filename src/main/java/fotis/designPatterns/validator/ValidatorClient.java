package fotis.designPatterns.validator;

/**
 * 
 */
class ValidatorClient {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Person fotis = new Person("Fotis", 27);
		Person arnhtiko = new Person("arnhtiko", -27);
		Person kanenas = new Person(null, 30);
		Person mathousalas = new Person("Mathousalas", 1_000);
		Person otinane = new Person(null, 1_000);

		otinane = Validator.validate(p -> p.getName() != null, "The name should not be null")
				.thenValidate(p -> p.getAge() >= 0, "The age should be greater or equal to 0")
				.thenValidate(p -> p.getAge() < 150, "The age should be less than  150")
				.on(otinane)
				.validate();
	}

}
