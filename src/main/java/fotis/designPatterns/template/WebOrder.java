package fotis.designPatterns.template;

/**
 * Concrete Template
 */
@SuppressWarnings("nls")
class WebOrder extends OrderTemplate {

	@Override
	void doCheckout() {
		System.out.println("Checking out");
	}

	@Override
	void doPayment() {
		System.out.println("Paying from web");
	}

	@Override
	void doReceipt() {
		System.out.println("Email Receipt");
	}

	@Override
	void doDelivery() {
		System.out.println("Shipping to destination");
	}

}
