package fotis.designPatterns.strategy;

import static org.mockito.Mockito.*;

import org.junit.jupiter.api.Test;

/**
 * Test class for {@link DragonSlayer}
 */
@SuppressWarnings("javadoc")
class TestDragonSlayer {

	@Test
	void test_goToBattle() {
		DragonSlayingStrategy strategy = mock(DragonSlayingStrategy.class);
		DragonSlayer slayer = new DragonSlayer(strategy);
		slayer.goToBattle();
		verify(strategy).execute();
		verifyNoMoreInteractions(strategy);
	}

	@Test
	void test_changeStrategy() {
		DragonSlayingStrategy initialStrategy = mock(DragonSlayingStrategy.class);
		DragonSlayer slayer = new DragonSlayer(initialStrategy);

		slayer.goToBattle();
		verify(initialStrategy).execute();

		DragonSlayingStrategy newStrategy = mock(DragonSlayingStrategy.class);
		slayer.changeStrategy(newStrategy);

		slayer.goToBattle();
		verify(newStrategy).execute();

		verifyNoMoreInteractions(initialStrategy, newStrategy);
	}

}
