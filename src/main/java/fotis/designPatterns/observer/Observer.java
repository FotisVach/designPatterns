package fotis.designPatterns.observer;

/**
 * Observer class of Observer Paatern.
 */
@SuppressWarnings("javadoc")
abstract class Observer {
	
	protected Subject subject;
	
	abstract void update();

}
