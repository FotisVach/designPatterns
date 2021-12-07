package fotis.designPatterns.facade;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;

/**
 * {@link BeeFacade} provides a single interface through which users can use the
 * subsystems.
 *
 * <p>
 * This makes the Bee society easier to operate and cuts the dependencies from
 * the Bee user to the subsystems.
 */
@SuppressWarnings("javadoc")
class BeeFacade {

	private final List<Bee> bees;

	/**
	 * Creates a new BeeFacade object.
	 *
	 */
	BeeFacade() {
		bees = Arrays.asList(new ScoutBee(), new WorkerBee(), new QueenBee());
	}

	String startNewDay() {
		return makeActions(bees, Bee.Action.WAKE_UP, Bee.Action.GO_TO_WORK);
	}

	String execute() {
		return makeActions(bees, Bee.Action.WORK);
	}

	String endDay() {
		return makeActions(bees, Bee.Action.GO_HOME, Bee.Action.GO_TO_SLEEP);
	}

	private static String makeActions(Collection<Bee> bees, Bee.Action... actions) {
		StringBuilder builder = new StringBuilder();
		bees.forEach(worker -> builder.append(worker.action(actions)));
		return builder.toString();
	}

}
