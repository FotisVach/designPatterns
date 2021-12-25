package fotis.designPatterns.template;

/**
 * Abstract Template
 */
@SuppressWarnings("javadoc")
abstract class OrderTemplate {

	boolean isGift;

	abstract void doCheckout();

	abstract void doPayment();

	abstract void doReceipt();

	abstract void doDelivery();

	final void wrapGift() {
		System.out.println("Gift wrapped."); //$NON-NLS-1$
	}

	final void processOrder() {
		doCheckout();
		doPayment();
		if (isGift) {
			wrapGift();
		} else {
			doReceipt();
		}
		doDelivery();
	}

}
