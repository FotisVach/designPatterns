package fotis.designPatterns.mediator;

/**
 * Colleague Interface.
 */
@SuppressWarnings("javadoc")
interface TeamMember {

	String joinedTeam(Team team);

	String work(Action action);
	
	String teamWork(Action action);

}
