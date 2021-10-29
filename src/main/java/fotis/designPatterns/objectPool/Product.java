package fotis.designPatterns.objectPool;

import java.util.concurrent.atomic.AtomicInteger;

/**
 * Expensive Product to create.
 */
public class Product {

	/**
	 * Thread safe counter
	 */
	private static final AtomicInteger counter = new AtomicInteger(0);

	/**
	 * Incremental id of the {@link Product}
	 */
	private final int id;

	/**
	 * Constructor.
	 */
	public Product() {
		id = counter.incrementAndGet();
		try {
			// Simulate expensive object creation
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	/**
	 * Gets the id.
	 *
	 * @return Returns the id
	 */
	int getId() {
		return id;
	}

	@Override
	public String toString() {
		return String.format("Product id=%d", id); //$NON-NLS-1$
	}
}
