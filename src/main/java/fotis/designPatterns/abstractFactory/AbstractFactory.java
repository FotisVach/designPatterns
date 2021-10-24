package fotis.designPatterns.abstractFactory;

/**
 * Abstract Factory's Factory :P
 */
interface AbstractFactory {

	/**
	 * Create an {@link Army} object.
	 * 
	 * @return Army
	 */
	Army createArmy();

	/**
	 * Create an {@link Castle} object.
	 * 
	 * @return Castle
	 */
	Castle createCastle();

	/**
	 * Create an {@link King} object.
	 * 
	 * @return King
	 */
	King createKing();

}
