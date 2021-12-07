package fotis.designPatterns.facade;

import java.text.MessageFormat;

/**
 * {@link ScoutBee} be is a part of a subsystem.
 */
@SuppressWarnings("nls")
class ScoutBee extends Bee {

	@Override
	String work() {
		return MessageFormat.format("{0} finds flowers\n", name());
	}

	@Override
	String name() {
		return "Scouter";
	}

}
