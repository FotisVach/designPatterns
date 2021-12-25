package fotis.designPatterns.strategy;

/**
 * Concrete Strategy.
 */
class SpellStrategy implements DragonSlayingStrategy {

	@Override
	public String execute() {
		return "You kill the dragon by using Avada Kedavra"; //$NON-NLS-1$
	}

}
