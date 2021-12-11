package fotis.designPatterns.command;

import static org.junit.Assert.*;

import java.util.Arrays;

import org.junit.jupiter.api.Test;

/**
 * Test for Command Pattern <br>
 * Testing all commands in a single test like an idiot...
 */
@SuppressWarnings("javadoc")
class TestCommand {

	@Test
	void test_on_command() {
		Light light = new Light();
		Switch theSwitch = new Switch();
		Command onCommand = new OnCommand(light);
		Toggle toggle = new Toggle(light);
		assertFalse(light.isOn());
		theSwitch.storeAndExecute(onCommand);
		assertTrue(light.isOn());
		theSwitch.storeAndExecute(toggle);
		assertFalse(light.isOn());
		theSwitch.storeAndExecute(toggle);
		assertTrue(light.isOn());
	}

	@Test
	void test_toggle_all_ligths_command() {
		Light light1 = new Light();
		Light light2 = new Light();
		Light light3 = new Light();
		Switch theSwitch = new Switch();
		Command onCommand = new OnCommand(light2);
		theSwitch.storeAndExecute(onCommand);
		assertFalse(light1.isOn());
		assertTrue(light2.isOn());
		assertFalse(light3.isOn());

		Command allLightsCommand = new ToggleAllLightsCommand(Arrays.asList(light1, light2, light3));
		theSwitch.storeAndExecute(allLightsCommand);
		assertTrue(light1.isOn());
		assertFalse(light2.isOn());
		assertTrue(light3.isOn());
	}

}
