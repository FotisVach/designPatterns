package fotis.designPatterns.visitor;

import org.junit.jupiter.api.Test;

/**
 * Not an actual test - Just client sample code
 */
@SuppressWarnings({ "nls", "javadoc" })
class TestElement {

	@Test
	void test() {
		Programmer p1 = new Programmer("p1", "java");
		Programmer p2 = new Programmer("p1", "python");
		Programmer p3 = new Programmer("p1", "c");
		Programmer p4 = new Programmer("p1", "assemply");
		
		ProjectLead l1 = new ProjectLead("l1", p1, p2);
		ProjectLead l2 = new ProjectLead("l2", p3, p4);
		
		Manager m1 = new Manager("m1", l1);
		Manager m2 = new Manager("m2", l2);
		
		VisePresident vp = new VisePresident("vp", m1, m2);
		
		Visitor visitor = new PrintVisitor();
		visitOrg(vp, visitor);
	}
	
	void visitOrg(Employee e, Visitor v) {
		System.out.println(e.accept(v));
		e.getDirectReports().forEach(emp -> visitOrg(emp, v));
	}

}
