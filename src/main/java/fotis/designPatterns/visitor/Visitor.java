package fotis.designPatterns.visitor;

/**
 * Visitor Interface
 */@SuppressWarnings("javadoc")
interface Visitor {
	
	String visit(Programmer programmer);
	
	String visit(ProjectLead projectLead);
	
	String visit(Manager manager);
	
	String visit(VisePresident visePresident);

}
