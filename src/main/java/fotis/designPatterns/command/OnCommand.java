package fotis.designPatterns.command;

/**
 * A concrete implementation of command.
 */
@SuppressWarnings("javadoc")
class OnCommand implements Command {

	private Light light;

	/**
	 * Creates a new OnCommand object.
	 *
	 * @param light
	 */
	OnCommand(Light light) {
		this.light = light;
	}

	@Override
	public void execute() {
		light.on();
	}

}
