package fotis.designPatterns.interpreter;

/**
 * Plus Expression - Non terminal Expression.
 */
@SuppressWarnings("javadoc")
class PlusExpression implements Expression {

	private final Expression left;

	private final Expression right;

	/**
	 * Creates a new PlusExpression object.
	 *
	 * @param left
	 * @param right
	 */
	PlusExpression(Expression left, Expression right) {
		this.left = left;
		this.right = right;
	}

	@Override
	public int interpret() {
		return left.interpret() + right.interpret();
	}

	@Override
	public String toString() {
		return "+"; //$NON-NLS-1$
	}
	
}
