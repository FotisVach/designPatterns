package fotis.designPatterns.mediator;

import static org.junit.Assert.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * Test TeamMember
 */
@SuppressWarnings({ "nls", "javadoc" })
class TestTeamMember {

	List<TeamMemberBase> members;

	@BeforeEach
	public void setup() {
		members = new ArrayList<>();
		members.add(new Developer());
		members.add(new Architect());
		members.add(new DevOps());
		members.add(new Tester());
	}

	/**
	 * Test for {@link TeamMemberBase#joinedTeam(Team)}
	 */
	@Test
	void test_joinedTeam() {
		Team team = new TeamImpl();
		members.forEach((m) -> this.joinedTeam(m, team));
		assertEquals(0, team.getTeamMembers().size());
	}

	void joinedTeam(TeamMemberBase member, Team team) {
		assertNull(member.team);
		assertEquals(member.getClass().getSimpleName() + " joins", member.joinedTeam(team));
		assertNotNull(member.team);
	}

	/**
	 * Test for {@link TeamMemberBase#teamWork(Action)}
	 */
	@Test
	void test_teamWork() {
		for (Action action : Action.values()) {
			members.forEach((m) -> this.teamWork(m, action));
		}
	}

	void teamWork(TeamMemberBase member, Action action) {
		assertEquals("Updated from team " + action, member.teamWork(action));
	}

	/**
	 * Test for {@link TeamMemberBase#work(Action)}
	 */
	@Test
	void test_work() {
		for (Action action : Action.values()) {
			members.forEach((m) -> assertNull(m.work(action)));
		}

		Team team = new TeamImpl();
		members.forEach((m) -> team.addMember(m));
		for (Action action : Action.values()) {
			members.forEach((m) -> this.work(m, action));
		}
	}

	void work(TeamMemberBase member, Action action) {
		assertEquals(member.getClass().getSimpleName() + action, member.work(action));
	}

}
