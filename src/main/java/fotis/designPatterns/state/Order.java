package fotis.designPatterns.state;

/**
 * Context class.
 */
@SuppressWarnings("javadoc")
class Order {

	OrderState orderState = new NewOrder();

	double cancel() {
		double charges = orderState.handleCancelation();
		orderState = new CanceledOrder();
		return charges;
	}

	void paymentSuccessful() {
		orderState = new PaidOrder();
	}

	void dispatched() {
		orderState = new InTransitOrder();
	}

	void delivered() {
		orderState = new DeliveredOrder();
	}

}
