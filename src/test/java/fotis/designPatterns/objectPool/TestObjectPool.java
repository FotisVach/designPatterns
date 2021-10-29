package fotis.designPatterns.objectPool;

import static org.junit.jupiter.api.Assertions.*;

import java.time.Duration;
import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.Test;

/**
 * Test class for {@link Product}
 */
class TestObjectPool {

	/**
	 * Use the same object 100 times subsequently. This should not take much
	 * time since the heavy object instantiation is done only once. Verify if we
	 * get the same object each time.
	 */
	@SuppressWarnings("nls")
	@Test
	public void test() {
		assertTimeout(Duration.ofMillis(5000), () -> {
			final ProductPool pool = new ProductPool();
			assertEquals("Pool available=0 inUse=0", pool.toString());

			final Product expectedProduct = pool.checkOut();
			assertEquals("Pool available=0 inUse=1", pool.toString());

			pool.checkIn(expectedProduct);
			assertEquals("Pool available=1 inUse=0", pool.toString());

			for (int i = 0; i < 100; i++) {
				final Product product = pool.checkOut();
				assertEquals("Pool available=0 inUse=1", pool.toString());
				assertSame(expectedProduct, product);
				assertEquals(expectedProduct.getId(), product.getId());
				assertEquals(expectedProduct.toString(), product.toString());

				pool.checkIn(product);
				assertEquals("Pool available=1 inUse=0", pool.toString());
			}
		});
	}

	/**
	 * Use the same object 100 times subsequently. This should not take much
	 * time since the heavy object instantiation is done only once. Verify if we
	 * get the same object each time.
	 */
	@SuppressWarnings("nls")
	@Test
	void testConcurrentCheckinCheckout() {
		assertTimeout(Duration.ofMillis(5000), () -> {
			final ProductPool pool = new ProductPool();
			assertEquals(pool.toString(), "Pool available=0 inUse=0");

			final Product firstProduct = pool.checkOut();
			assertEquals(pool.toString(), "Pool available=0 inUse=1");

			final Product secondProduct = pool.checkOut();
			assertEquals(pool.toString(), "Pool available=0 inUse=2");

			assertNotSame(firstProduct, secondProduct);
			assertEquals(firstProduct.getId() + 1, secondProduct.getId());

			// After checking in the second, we should get the same when
			// checking out a new Product ...
			pool.checkIn(secondProduct);
			assertEquals(pool.toString(), "Pool available=1 inUse=1");

			final Product product3 = pool.checkOut();
			assertEquals(pool.toString(), "Pool available=0 inUse=2");
			assertSame(secondProduct, product3);

			// ... and the same applies for the first one
			pool.checkIn(firstProduct);
			assertEquals(pool.toString(), "Pool available=1 inUse=1");

			final Product product4 = pool.checkOut();
			assertEquals(pool.toString(), "Pool available=0 inUse=2");
			assertSame(firstProduct, product4);

			// When both product return to the pool, we should still get the
			// same instances
			pool.checkIn(firstProduct);
			assertEquals(pool.toString(), "Pool available=1 inUse=1");

			pool.checkIn(secondProduct);
			assertEquals(pool.toString(), "Pool available=2 inUse=0");

			// The order of the returned instances is not determined, so just
			// put them in a list and verify if both expected instances are in
			// there.
			final List<Product> products = Arrays.asList(pool.checkOut(), pool.checkOut());
			assertEquals(pool.toString(), "Pool available=0 inUse=2");
			assertTrue(products.contains(firstProduct));
			assertTrue(products.contains(secondProduct));
		});
	}

}
