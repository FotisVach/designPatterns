package fotis.designPatterns.factoryMethod;

/**
 * Implementation B for {@link FooCreator}
 */
class FooCreatorImplB 
extends FooCreator {

	@Override
	protected Foo createFoo() {
		return new FooImplB();
	}

}
