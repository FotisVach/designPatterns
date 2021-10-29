package fotis.designPatterns.objectPool;

import java.util.HashSet;
import java.util.Set;

/**
 * Generic object pool.
 * 
 * @param <T>
 *            Type T of Object in the Pool.
 */
abstract class ObjectPool<T> {

	/**
	 * Available objects.
	 */
	private final Set<T> available = new HashSet<>();

	/**
	 * Objects being used right now.
	 */
	private final Set<T> inUse = new HashSet<>();

	/**
	 * Method to create new object if there are none available.
	 * 
	 * @return T
	 */
	protected abstract T create();

	/**
	 * Checkout object from pool.
	 * 
	 * @return Object from pool.
	 */
	public synchronized T checkOut() {
		if (available.isEmpty()) {
			available.add(create());
		}
		T instance = available.iterator().next();
		available.remove(instance);
		inUse.add(instance);
		return instance;
	}

	/**
	 * Release object from use.
	 * 
	 * @param instance
	 */
	public synchronized void checkIn(T instance) {
		inUse.remove(instance);
		available.add(instance);
	}

	@Override
	public synchronized String toString() {
		return String.format("Pool available=%d inUse=%d", available.size(), inUse.size()); //$NON-NLS-1$
	}

}
