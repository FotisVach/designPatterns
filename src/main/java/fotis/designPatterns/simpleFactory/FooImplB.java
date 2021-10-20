package fotis.designPatterns.simpleFactory;

/**
 * Implementation of {@link Foo}
 */
@SuppressWarnings("javadoc")
public class FooImplB 
extends Foo {
	
	private String foobar;

	/**
	 * Gets the foobar.
	 *
	 * @return Returns the foobar
	 */
	public String getFoobar() {
		return foobar;
	}

	/**
	 * Assigns a new value to the foobar.
	 *
	 * @param foobar the foobar to set
	 */
	public void setFoobar(String foobar) {
		this.foobar = foobar;
	}
	
}
