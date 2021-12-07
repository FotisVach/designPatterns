package fotis.designPatterns.facade;

import java.text.MessageFormat;

/**
 * {@link WorkerBee} be is a part of a subsystem.
 */
@SuppressWarnings("nls")
class WorkerBee extends Bee {

	@Override
	String work() {
		return MessageFormat.format("{0} makes honey\n", name());
	}

	@Override
	String name() {
		return "Worker";
	}

}
