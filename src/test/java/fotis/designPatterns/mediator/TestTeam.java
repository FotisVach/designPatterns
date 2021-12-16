package fotis.designPatterns.mediator;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.*;

import org.junit.jupiter.api.Test;

/**
 * Test for {@link Team}
 */
@SuppressWarnings("javadoc")
class TestTeam {

	@Test
	void test() {
		TeamMember member1 = mock(TeamMember.class);
		TeamMember member2 = mock(TeamMember.class);

		Team team = new TeamImpl();
		team.addMember(member1);
		team.addMember(member2);

		assertEquals(2, team.getTeamMembers().size());
		verify(member1).joinedTeam(team);
		verify(member2).joinedTeam(team);

		team.work(member1, Action.CODE);
		verify(member2).teamWork(any(Action.class));

		verifyNoMoreInteractions(member1, member2);
	}

}
