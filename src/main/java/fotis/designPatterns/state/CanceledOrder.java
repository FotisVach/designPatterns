package fotis.designPatterns.state;

/**
 * Concrete State Class.
 */
class CanceledOrder implements OrderState {

	@Override
	public double handleCancelation() {
		throw new IllegalStateException("Can not canceled an already Canceled Order"); //$NON-NLS-1$
	}

}
