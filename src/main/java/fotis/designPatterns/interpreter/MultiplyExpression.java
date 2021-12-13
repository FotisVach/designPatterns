package fotis.designPatterns.interpreter;

/**
 * Multiply Expression - Non terminal Expression.
 */
@SuppressWarnings("javadoc")
class MultiplyExpression implements Expression {

	private final Expression left;

	private final Expression right;

	/**
	 * Creates a new MultiplyExpression object.
	 *
	 * @param left
	 * @param right
	 */
	MultiplyExpression(Expression left, Expression right) {
		this.left = left;
		this.right = right;
	}

	@Override
	public int interpret() {
		return left.interpret() * right.interpret();
	}

	@Override
	public String toString() {
		return "*"; //$NON-NLS-1$
	}
	
}
