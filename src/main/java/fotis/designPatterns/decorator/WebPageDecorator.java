package fotis.designPatterns.decorator;

/**
 * Abstract Decorator class - note that it implements {@link WebPage}.
 */
abstract class WebPageDecorator implements WebPage {

	/**
	 * WebPage to be decorated.
	 */
	private final WebPage webPageToBeDecorated;

	/**
	 * Creates a new WebPageDecorator object.
	 *
	 * @param webPageToBeDecorated
	 */
	WebPageDecorator(WebPage webPageToBeDecorated) {
		this.webPageToBeDecorated = webPageToBeDecorated;
	}

	@Override
	public String getUrl() {
		return webPageToBeDecorated.getUrl();
	}

}
