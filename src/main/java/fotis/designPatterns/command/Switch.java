package fotis.designPatterns.command;

/**
 * Invoker
 */
@SuppressWarnings("javadoc")
class Switch {

	void storeAndExecute(Command command) {
		command.execute();
	}

}
