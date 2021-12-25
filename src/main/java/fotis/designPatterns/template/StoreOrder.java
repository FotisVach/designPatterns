package fotis.designPatterns.template;

/**
 * Concrete Template
 */
@SuppressWarnings("nls")
class StoreOrder extends OrderTemplate {

	@Override
	void doCheckout() {
		System.out.println("Checking out");
	}

	@Override
	void doPayment() {
		System.out.println("Paying on site");
	}

	@Override
	void doReceipt() {
		System.out.println("Give Receipt");
	}

	@Override
	void doDelivery() {
		System.out.println("Bag items at counter");
	}

}
