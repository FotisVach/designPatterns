package fotis.designPatterns.mediator;

/**
 * Colleague abstract class 
 */
@SuppressWarnings({ "nls", "javadoc" })
abstract class TeamMemberBase
implements TeamMember {

	protected Team team;

	@Override
	public String joinedTeam(Team theTeam) {
		this.team = theTeam;
		return this + " joins";
	}

	@Override
	public String work(Action action) {
		if (team != null) {
			team.work(this, action);
			return this.toString() + action;
		}
		return null;
	}

	@Override
	public String teamWork(Action action) {
		return "Updated from team " + action;
	}

	@Override
	public abstract String toString();

}
