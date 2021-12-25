package fotis.designPatterns.strategy;

/**
 * Strategy Interface.
 */
@FunctionalInterface
interface DragonSlayingStrategy {

	/**
	 * Execute Strategy
	 * 
	 * @return Strategy executed
	 */
	String execute();

}
