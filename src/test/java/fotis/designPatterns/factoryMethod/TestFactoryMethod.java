package fotis.designPatterns.factoryMethod;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

/**
 * Test class for Factory Method Pattern.
 */
public class TestFactoryMethod {

	/**
	 * Test proper creation by using {@link FooCreatorImplA} implementation of the AbstractCreator.
	 */
	@Test
	public void test_FooImplA_creation() {
		assertEquals(FooImplA.class.getSimpleName(), getClassName(new FooCreatorImplA()));
	}
	
	/**
	 * Test proper creation by using {@link FooCreatorImplB} implementation of the AbstractCreator.
	 */
	@Test
	public void test_FooImplB_creation() {
		assertEquals(FooImplB.class.getSimpleName(), getClassName(new FooCreatorImplB()));
	}
	
	/**
	 * Just a dummy method to test Creator Pattern.
	 * 
	 * @param creator
	 * @return A String from the method {@link Foo#getbar()}
	 */
	private String getClassName(FooCreator creator) {
		Foo foo = creator.getFoo();
		return foo.getbar();
	}

}
