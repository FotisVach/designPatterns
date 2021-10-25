package fotis.designPatterns.singleton;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.function.Supplier;

import org.junit.Test;

/**
 * <p>
 * This class provides several test case that test singleton construction.
 * 
 * @param <S>
 *            Singleton implementation
 */
public abstract class TestBaseSingleton<S> {

	/**
	 * The singleton's getInstance method.
	 */
	private final Supplier<S> singletonGetInstanceMethod;

	/**
	 * Create a new singleton test instance using the given 'getInstance'
	 * method.
	 *
	 * @param singletonInstanceMethod
	 *            The singleton's getInstance method
	 */
	public TestBaseSingleton(final Supplier<S> singletonInstanceMethod) {
		this.singletonGetInstanceMethod = singletonInstanceMethod;
	}

	/**
	 * Single Thread Test.
	 */
	@Test
	public void testSingleThread() {
		// Create several instances in the same calling thread
		S instance1 = this.singletonGetInstanceMethod.get();
		S instance2 = this.singletonGetInstanceMethod.get();
		S instance3 = this.singletonGetInstanceMethod.get();
		// now check they are equal
		assertSame(instance1, instance2);
		assertSame(instance1, instance3);
		assertSame(instance2, instance3);
	}

	/**
	 * Test singleton instance in a concurrent setting
	 * 
	 * @throws InterruptedException
	 * @throws ExecutionException
	 */
	@Test(timeout = 10000)
	public void testMultipleThreads()
			throws InterruptedException, ExecutionException {

		// Create 10000 tasks and inside each callable instantiate the singleton class
		final List<Callable<S>> tasks = new ArrayList<>();
		for (int i = 0; i < 10000; i++) {
			tasks.add(this.singletonGetInstanceMethod::get);
		}

		// Use up to 8 concurrent threads to handle the tasks
		final ExecutorService executorService = Executors.newFixedThreadPool(8);
		final List<Future<S>> results = executorService.invokeAll(tasks);

		// Wait for all of the threads to complete
		final S expectedInstance = this.singletonGetInstanceMethod.get();
		for (Future<S> res : results) {
			final S instance = res.get();
			assertNotNull(instance);
			assertSame(expectedInstance, instance);
		}

		// Tidy up the executor
		executorService.shutdown();

	}

}
