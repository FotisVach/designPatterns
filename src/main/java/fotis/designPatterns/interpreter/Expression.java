package fotis.designPatterns.interpreter;

/**
 * Expression
 */
@SuppressWarnings("javadoc")
interface Expression {

	public int interpret();

	@Override
	String toString();

}
