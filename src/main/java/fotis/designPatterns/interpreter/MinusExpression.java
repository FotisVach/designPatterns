package fotis.designPatterns.interpreter;

/**
 * Minus Expression - Non terminal Expression.
 */
@SuppressWarnings("javadoc")
class MinusExpression implements Expression {

	private final Expression left;

	private final Expression right;

	/**
	 * Creates a new MinusExpression object.
	 *
	 * @param left
	 * @param right
	 */
	MinusExpression(Expression left, Expression right) {
		this.left = left;
		this.right = right;
	}

	@Override
	public int interpret() {
		return left.interpret() - right.interpret();
	}

	@Override
	public String toString() {
		return "-"; //$NON-NLS-1$
	}
	
}
