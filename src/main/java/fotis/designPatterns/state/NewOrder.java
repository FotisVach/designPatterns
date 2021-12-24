package fotis.designPatterns.state;

/**
 * Concrete State Class.
 */
class NewOrder implements OrderState {

	@Override
	public double handleCancelation() {
		System.out.println("This is a New Order. No processing done."); //$NON-NLS-1$
		return 0;
	}

}
