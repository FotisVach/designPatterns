package fotis.designPatterns.strategy;

/**
 * Context Class - This dragon slayer can use different strategies to kill a
 * dragon.
 */
class DragonSlayer {

	/** Strategy algorithm */
	private DragonSlayingStrategy strategy;

	/**
	 * Creates a new DragonSlayer object.
	 *
	 * @param dragonSlayingStrategy
	 */
	DragonSlayer(DragonSlayingStrategy dragonSlayingStrategy) {
		strategy = dragonSlayingStrategy;
	}

	/**
	 * Changes strategy.
	 * 
	 * @param dragonSlayingStrategy
	 */
	void changeStrategy(DragonSlayingStrategy dragonSlayingStrategy) {
		strategy = dragonSlayingStrategy;
	}

	/**
	 * Execute Strategy
	 */
	void goToBattle() {
		strategy.execute();
	}

}
