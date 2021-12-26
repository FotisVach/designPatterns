package fotis.designPatterns.visitor;

/**
 * Concrete Element
 */
class Programmer extends AbstractEmployee {
	/** Element property */
	private String skill;

	/**
	 * Creates a new Programmer object.
	 *
	 * @param name
	 * @param skill
	 */
	Programmer(String name, String skill) {
		super(name);
		this.skill = skill;
	}

	/**
	 * Gets the skill.
	 *
	 * @return Returns the skill
	 */
	String getSkill() {
		return skill;
	}

	@Override
	public String accept(Visitor visitor) {
		return visitor.visit(this);
	}

}
