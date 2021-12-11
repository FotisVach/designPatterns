package fotis.designPatterns.command;

/**
 * This class is the receiver.
 */
@SuppressWarnings("javadoc")
class Light {

	private boolean isOn = false;

	void toggle() {
		System.out.print("Toggle Light.\t->\t"); //$NON-NLS-1$
		if (isOn) {
			off();
		} else {
			on();
		}
	}

	void on() {
		System.out.println("Light switched on."); //$NON-NLS-1$
		isOn = true;
	}

	void off() {
		System.out.println("Light switched off."); //$NON-NLS-1$
		isOn = false;
	}

	/**
	 * Gets the isOn.
	 *
	 * @return Returns the isOn
	 */
	boolean isOn() {
		return isOn;
	}

}
