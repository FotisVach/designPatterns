package fotis.designPatterns.factoryMethod;

/**
 * Implementation A for {@link FooCreator}
 */
class FooCreatorImplA 
extends FooCreator {

	@Override
	protected Foo createFoo() {
		return new FooImplA();
	}

}
