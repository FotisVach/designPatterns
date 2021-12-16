package fotis.designPatterns.mediator;

import java.util.ArrayList;
import java.util.List;

/**
 * Mediator Concrete Implementation.
 */
@SuppressWarnings("javadoc")
class TeamImpl
implements Team {

	private List<TeamMember> members;

	/**
	 * Creates a new TeamImpl object.
	 *
	 */
	TeamImpl() {
		members = new ArrayList<>();
	}

	@Override
	public void addMember(TeamMember teamMember) {
		members.add(teamMember);
		teamMember.joinedTeam(this);
	}

	@Override
	public void work(TeamMember teamMember, Action action) {
		for (TeamMember member : members) {
			if (!member.equals(teamMember)) {
				member.teamWork(action);
			}
		}
	}

	@Override
	public List<TeamMember> getTeamMembers() {
		return members;
	}

}
