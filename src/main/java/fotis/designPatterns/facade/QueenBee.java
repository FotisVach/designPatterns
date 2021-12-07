package fotis.designPatterns.facade;

import java.text.MessageFormat;

/**
 * {@link QueenBee} be is a part of a subsystem.
 * 
 * TODO : This maybe should be a Singleton actually :)
 */
@SuppressWarnings("nls")
class QueenBee extends Bee {

	@Override
	String work() {
		return MessageFormat.format("{0} makes bees\n", name());
	}

	@Override
	String name() {
		return "Queen";
	}

}
