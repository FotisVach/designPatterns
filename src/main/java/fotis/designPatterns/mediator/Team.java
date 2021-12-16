package fotis.designPatterns.mediator;

import java.util.List;

/**
 * Mediator Class.
 */
@SuppressWarnings("javadoc")
interface Team {

	void addMember(TeamMember teamMember);
	
	void work(TeamMember teamMember, Action action);
	
	List<TeamMember> getTeamMembers();
	
}
