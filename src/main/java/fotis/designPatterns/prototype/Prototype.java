package fotis.designPatterns.prototype;

/**
 * Prototype Pattern.
 */
interface Prototype {

	/**
	 * Concrete classes must implement this method to create-clone new objects
	 * 
	 * @return cloned object
	 */
	Object copy();

}
