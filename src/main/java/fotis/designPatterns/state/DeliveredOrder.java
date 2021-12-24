package fotis.designPatterns.state;

/**
 * Concrete State Class.
 */
class DeliveredOrder implements OrderState {

	@Override
	public double handleCancelation() {
		System.out.println("This order is Delivered. Do respective actions."); //$NON-NLS-1$
		return 30;
	}

}
