package fotis.designPatterns.factoryMethod;

/**
 * Extends Foo.
 */
public class FooImplB 
extends Foo {

	@Override
	String getbar() {
		return getClass().getSimpleName();
	}

}
