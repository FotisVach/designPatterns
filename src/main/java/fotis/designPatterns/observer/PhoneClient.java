package fotis.designPatterns.observer;

/**
 * Subject Concrete implementation of Observer Pattern.
 */
@SuppressWarnings({ "nls", "javadoc" })
class PhoneClient extends Observer {

	/**
	 * Creates a new PhoneClient object.
	 * 
	 * @param subject
	 */
	public PhoneClient(Subject subject) {
		this.subject = subject;
		subject.attach(this);
	}

	@Override
	void update() {
		System.out.println("Phone Stream: " + subject.getState());
	}
	
	void addMessage(String message) {
		subject.setState(message + " - sent from phone");
	}

}
