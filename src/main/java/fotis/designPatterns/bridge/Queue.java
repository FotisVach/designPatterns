package fotis.designPatterns.bridge;

/**
 * Refined abstraction.
 * @param <T> Type of element.
 */
class Queue<T> implements FifoCollection<T> {
	
	/** Implementation abstraction */
	private LinkedList<T> list;

	/**
	 * Creates a new Queue object. 
	 *
	 * @param list
	 */
	public Queue(LinkedList<T> list) {
		this.list = list;
	}

	@Override
	public void offer(T element) {
		list.addLast(element);
	}

	@Override
	public T poll() {
		return list.removeFirst();
	}

}
