package fotis.designPatterns.observer;

/**
 * Observer class of Observer Pattern.
 */
@SuppressWarnings("javadoc")
abstract class Observer {
	
	protected Subject subject;
	
	abstract void update();

}
