package fotis.designPatterns.validator;

import java.util.function.Predicate;
import java.util.function.Supplier;

/**
 * @deprecated Just use javax.validation
 */
@Deprecated
interface Validator {

	ValidatorSupplier on(Person p);

	default Validator thenValidate(Predicate<Person> predicate, String erroMsg) {
		return p -> {
			try {
				on(p).validate();
				return throwException(predicate, erroMsg, p);
			} catch (ValidationException e) {
				if (predicate.test(p)) {
					return () -> {
						throw e;
					};
				}
				e.addSuppressed(new IllegalArgumentException(erroMsg));
				return () -> {
					throw e;
				};

			}

		};
	}

	static Validator validate(Predicate<Person> predicate, String erroMsg) {
		return p -> {
			return throwException(predicate, erroMsg, p);
		};
	}

	interface ValidatorSupplier extends Supplier<Person> {

		default Person validate() {
			return get();
		}

	}

	static class ValidationException extends RuntimeException {
		public ValidationException(String errorMsg) {
			super(errorMsg);
		}
	}

	/**
	 * @param predicate
	 * @param erroMsg
	 * @param p
	 * @return
	 */
	static ValidatorSupplier throwException(Predicate<Person> predicate, String erroMsg, Person p) {
		if (predicate.test(p)) {
			return () -> p;
		}
		return () -> {
			ValidationException e = new ValidationException("The object is not valid");
			e.addSuppressed(new IllegalArgumentException(erroMsg));
			throw e;
		};
	}

}
