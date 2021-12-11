package fotis.designPatterns.command;

import java.util.List;

/**
 * A concrete implementation of command.
 */
@SuppressWarnings("javadoc")
class ToggleAllLightsCommand implements Command {

	private List<Light> lights;

	/**
	 * Creates a new OnCommand object.
	 *
	 * @param lights
	 */
	ToggleAllLightsCommand(List<Light> lights) {
		this.lights = lights;
	}

	@Override
	public void execute() {
		for (Light light : lights) {
			light.toggle();
		}
	}

}
