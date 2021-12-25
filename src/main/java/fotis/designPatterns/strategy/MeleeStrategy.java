package fotis.designPatterns.strategy;

/**
 * Concrete Strategy
 */
class MeleeStrategy implements DragonSlayingStrategy {

	@Override
	public String execute() {
		return "You cut the dragon's head with your lightsaber"; //$NON-NLS-1$
	}

}
