package fotis.designPatterns.factoryMethod;

/**
 * Extends Foo.
 */
public class FooImplA 
extends Foo {

	@Override
	String getbar() {
		return getClass().getSimpleName();
	}

}
