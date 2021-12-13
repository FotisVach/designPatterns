package fotis.designPatterns.interpreter;

/**
 * Number Expression - Terminal/Leaf Expression.
 */
@SuppressWarnings("javadoc")
class NumberExpression implements Expression {

	private final int number;

	/**
	 * Creates a new Number object.
	 *
	 * @param number
	 */
	NumberExpression(int number) {
		this.number = number;
	}

	@Override
	public int interpret() {
		return number;
	}

	@Override
	public String toString() {
		return "number"; //$NON-NLS-1$
	}
	
}
