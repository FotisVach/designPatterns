package fotis.designPatterns.prototype;

/**
 * Interface for the factory class.
 */
@SuppressWarnings("javadoc")
interface HeroFactory {
	
	Human createHuman();
	
	Orc createOrc();

}
