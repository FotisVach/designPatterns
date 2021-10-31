package fotis.designPatterns.adapter;

/**
 * Client code which requires Customer Interface.
 */
@SuppressWarnings({ "javadoc", "nls" })
class BussinessCardDesigner {

	String designCard(Customer customer) {
		String card = "";
		card += customer.getName();
		card += "\n" + customer.getDesignation();
		card += "\n" + customer.getAddress();
		return card;
	}

}
