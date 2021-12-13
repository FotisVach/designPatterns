package fotis.designPatterns.interpreter;

import static org.junit.jupiter.api.Assertions.*;

import java.util.function.BiFunction;

import org.junit.jupiter.api.Test;

/**
 * Test class for Interpreter Pattern.<br>
 * Testing all classes in the same Test class like an idiot.
 */
class TestInterpreter {

	/**
	 * Test for class {@link PlusExpression}
	 */
	@Test
	void test_PlusExpression() {
		for (int i = -10; i < 10; i++) {
			for (int j = -10; j < 10; j++) {
				testInterpret(i, j, i + j, "+", PlusExpression::new); //$NON-NLS-1$
			}
		}
	}

	/**
	 * Test for class {@link MinusExpression}
	 */
	@Test
	void test_MinusExpression() {
		for (int i = -10; i < 10; i++) {
			for (int j = -10; j < 10; j++) {
				testInterpret(i, j, i - j, "-", MinusExpression::new); //$NON-NLS-1$
			}
		}
	}

	/**
	 * Test for class {@link MultiplyExpression}
	 */
	@Test
	void test_MultiplyExpression() {
		for (int i = -10; i < 10; i++) {
			for (int j = -10; j < 10; j++) {
				testInterpret(i, j, i * j, "*", MultiplyExpression::new); //$NON-NLS-1$
			}
		}
	}

	/**
	 * Test for class {@link NumberExpression}
	 */
	@Test
	void test_NumberExpression() {
		for (int i = -10; i < 10; i++) {
			NumberExpression number = new NumberExpression(i);
			assertEquals(i, number.interpret());
			assertEquals("number", number.toString()); //$NON-NLS-1$
		}
	}

	/**
	 * @param leftInt
	 * @param rightInt
	 * @param expected
	 * @param toString
	 * @param constructor
	 */
	private void testInterpret(int leftInt, int rightInt, int expected, String toString,
			BiFunction<NumberExpression, NumberExpression, Expression> constructor) {
		NumberExpression left = new NumberExpression(leftInt);
		NumberExpression right = new NumberExpression(rightInt);
		Expression expression = constructor.apply(left, right);
		assertEquals(expected, expression.interpret());
		assertTrue(expression.toString().contains(toString));
	}

}
