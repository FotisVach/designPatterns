package fotis.designPatterns.bridge;

import static org.junit.jupiter.api.Assertions.*;

import java.util.NoSuchElementException;

import org.junit.jupiter.api.Test;

/**
 * Test class for the Bridge Pattern
 */
class TestBridge {

	/**
	 * Assert correct addition and removal of elements.
	 */
	@Test
	void test() {
		FifoCollection<Integer> fifo = new Queue<>(new SingleLinkedList<>());
		fifo.offer(11);
		fifo.offer(22);
		fifo.offer(33);
		
		assertEquals(11, fifo.poll());
		assertEquals(22, fifo.poll());
		assertEquals(33, fifo.poll());
		assertThrows(NoSuchElementException.class, () -> fifo.poll());
	}

}
