package fotis.designPatterns.strategy;

/**
 * Concrete Strategy.
 */
class ProjectileStrategy implements DragonSlayingStrategy {

	@Override
	public String execute() {
		return "You kill the dragon by shooting him in the eyes"; //$NON-NLS-1$
	}

}
