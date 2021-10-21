package fotis.designPatterns.factoryMethod;

/**
 * Abstract Creator of Foo
 */
abstract class FooCreator {
	
	/**
	 * Gets the Foo instance that is created.
	 * 
	 * @return Foo
	 */
	Foo getFoo() {
		Foo foo = createFoo();
		
		foo.method1();
		foo.method2();
		
		return foo;
	}
	
	/** 
	 * Factory method - Must be implemented by subclasses.
	 * 
	 * @return Foo instance
	 */
	protected abstract Foo createFoo();

}
