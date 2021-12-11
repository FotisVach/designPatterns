package fotis.designPatterns.command;

/**
 * A concrete implementation of command.
 */
@SuppressWarnings("javadoc")
class Toggle implements Command {

	private Light light;

	/**
	 * Creates a new OnCommand object.
	 *
	 * @param light
	 */
	Toggle(Light light) {
		this.light = light;
	}

	@Override
	public void execute() {
		light.toggle();
	}

}
