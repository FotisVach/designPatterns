package fotis.designPatterns.observer;

/**
 * Subject Concrete implementation of Observer Pattern.
 */
@SuppressWarnings({ "nls", "javadoc" })
class TabletClient extends Observer {

	/**
	 * Creates a new TabletClient object.
	 * 
	 * @param subject
	 */
	public TabletClient(Subject subject) {
		this.subject = subject;
		subject.attach(this);
	}

	@Override
	void update() {
		System.out.println("Tablet Stream: " + subject.getState());
	}
	
	void addMessage(String message) {
		subject.setState(message + " - sent from tablet");
	}

}
