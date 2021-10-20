package fotis.designPatterns.simpleFactory;

/**
 * Implementation of {@link Foo}
 */
@SuppressWarnings("javadoc")
public class FooImplA 
extends Foo {
	
	private String bar;

	/**
	 * Gets the bar.
	 *
	 * @return Returns the bar
	 */
	public String getBar() {
		return bar;
	}

	/**
	 * Assigns a new value to the bar.
	 *
	 * @param bar the bar to set
	 */
	public void setBar(String bar) {
		this.bar = bar;
	}

}
