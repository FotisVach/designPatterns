package fotis.designPatterns.simpleFactory;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

/**
 * Test class for {@link SimpleFactory}
 */
@SuppressWarnings({ "javadoc", "nls" })
public class TestSimpleFactory {

	@Test
	public void test() {
		Foo f1 = SimpleFactory.createFoo("A");
		assertTrue(f1 instanceof FooImplA);
		Foo f2 = SimpleFactory.createFoo("B");
		assertTrue(f2 instanceof FooImplB);
	}

	@Test(expected = IllegalArgumentException.class)
	public void test_bad_input() {
		SimpleFactory.createFoo("ABC");
	}

}
