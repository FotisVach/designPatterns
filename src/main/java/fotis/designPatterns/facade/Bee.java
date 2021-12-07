package fotis.designPatterns.facade;

import java.text.MessageFormat;
import java.util.Arrays;

/**
 * {@link Bee} is a part of a subsystem.
 */
@SuppressWarnings({"nls", "javadoc"})
abstract class Bee {

	String goToSleep() {
		return MessageFormat.format("{0} goToSleep\n", name());
	}

	String wakeUp() {
		return MessageFormat.format("{0} wakeUp\n", name());
	}

	String goHome() {
		return MessageFormat.format("{0} goHome\n", name());
	}

	String goToWork() {
		return MessageFormat.format("{0} goToWork\n", name());
	}

	private String action(Action action) {
		switch (action) {
		case GO_TO_SLEEP:
			return goToSleep();
		case WAKE_UP:
			return wakeUp();
		case GO_HOME:
			return goHome();
		case GO_TO_WORK:
			return goToWork();
		case WORK:
			return work();
		default:
			return "Undefined action\n";
		}
	}

	/**
	 * Perform actions.
	 */
	public String action(Action... actions) {
		StringBuilder builder = new StringBuilder();
		Arrays.stream(actions).forEach((action) -> builder.append(this.action(action)));
		return builder.toString();
	}

	abstract String work();

	abstract String name();

	enum Action {
		GO_TO_SLEEP, WAKE_UP, GO_HOME, GO_TO_WORK, WORK
	}

}
