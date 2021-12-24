package fotis.designPatterns.state;

/**
 * Concrete State Class.
 */
class InTransitOrder implements OrderState {

	@Override
	public double handleCancelation() {
		System.out.println("This order is in transit. Do respective actions."); //$NON-NLS-1$
		return 20;
	}

}
