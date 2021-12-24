package fotis.designPatterns.state;

/**
 * Concrete State Class.
 */
class PaidOrder implements OrderState {

	@Override
	public double handleCancelation() {
		System.out.println("This is a Paid Order. Do respective actions."); //$NON-NLS-1$
		return 10;
	}

}
