package fotis.designPatterns.simpleFactory;

/**
 * Simple Factory implementation.
 */
@SuppressWarnings({ "javadoc", "nls" })
class SimpleFactory {

	static Foo createFoo(String type) {
		switch (type) {
		case "A":
			return new FooImplA();
		case "B":
			return new FooImplB();
		default:
			throw new IllegalArgumentException("Foo type is unknown");
		}
	}

}
