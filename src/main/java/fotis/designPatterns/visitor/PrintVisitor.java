package fotis.designPatterns.visitor;

/**
 * Concrete Visitor Class
 */
class PrintVisitor implements Visitor {

	@Override
	public String visit(Programmer programmer) {
		return programmer.getName().concat(programmer.getSkill());
	}

	@Override
	public String visit(ProjectLead projectLead) {
		return projectLead.getName() + projectLead.getDirectReports().size();
	}

	@Override
	public String visit(Manager manager) {
		return manager.getName() + manager.getDirectReports().size();
	}

	@Override
	public String visit(VisePresident visePresident) {
		return visePresident.getName() + visePresident.getDirectReports().size();
	}

}
