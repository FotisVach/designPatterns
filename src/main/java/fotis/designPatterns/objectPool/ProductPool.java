package fotis.designPatterns.objectPool;

/**
 * Concrete {@link Product} pool.
 */
public class ProductPool extends ObjectPool<Product> {

	@Override
	protected Product create() {
		return new Product();
	}

}
